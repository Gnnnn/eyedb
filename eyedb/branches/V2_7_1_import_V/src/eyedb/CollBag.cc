/* 
   EyeDB Object Database Management System
   Copyright (C) 1994-1999,2004,2005 SYSRA
   
   EyeDB is free software; you can redistribute it and/or
   modify it under the terms of the GNU Lesser General Public
   License as published by the Free Software Foundation; either
   version 2.1 of the License, or (at your option) any later version.
   
   EyeDB is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   Lesser General Public License for more details.
   
   You should have received a copy of the GNU Lesser General Public
   License along with this library; if not, write to the Free Software
   Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA 
*/

/*
   Author: Eric Viara <viara@sysra.com>
*/


#include "eyedb_p.h"
#include "CollCache.h"
#include <assert.h>
#include "AttrNative.h"

/* CollBag */

namespace eyedb {

  void CollBag::init()
  {
    allow_dup = True;
    ordered = False;
    type = _CollBag_Type;
    if (!status)
      setClass(CollBagClass::make(coll_class, isref, dim, status));
  }

  CollBag::CollBag(const char *n, Class *_class,
		   const Oid& _idx1_oid,
		   const Oid& _idx2_oid,
		   int icnt,
		   int _bottom, int _top,
		   const IndexImpl *_idximpl,
		   Object *_card,
		   Bool _is_literal,
		   Data _idx_data, Size _idx_data_size)
    : Collection(n, _class, _idx1_oid, _idx2_oid, icnt, 
		 _bottom, _top, _idximpl, _card, _is_literal, _idx_data, _idx_data_size)
  {
    init();
    setClass(_class);
  }

  CollBag::CollBag(const char *n, Class *mc, Bool _isref,
		   const IndexImpl *_idximpl) :
    Collection(n, mc, _isref, _idximpl)
  {
    init();
  }

  CollBag::CollBag(const char *n, Class *mc, int _dim,
		   const IndexImpl *_idximpl) :
    Collection(n, mc, _dim, _idximpl)
  {
    init();
  }

  CollBag::CollBag(Database *_db, const char *n, Class *mc,
		   Bool _isref, const IndexImpl *_idximpl) :
    Collection(n, mc, _isref, _idximpl)
  {
    init();
    if (!status)
      status = setDatabase(_db);
  }

  CollBag::CollBag(Database *_db, const char *n, Class *mc,
		   int _dim, const IndexImpl *_idximpl) :
    Collection(n, mc, _dim, _idximpl)
  {
    init();
    if (!status)
      status = setDatabase(_db);
  }

  CollBag::CollBag(const CollBag& o) : Collection(o)
  {
    allow_dup = True;
    ordered = False;
    type = _CollBag_Type;
  }

  CollBag& CollBag::operator=(const CollBag& o)
  {
    *(Collection *)this = (Collection &)o;
    allow_dup = True;
    ordered = False;
    type = _CollBag_Type;
    return *this;
  }

  const char *CollBag::getClassName() const
  {
    return CollBag_Class->getName();
  }

  Status CollBag::insert_p(const Oid& item_oid, Bool noDup)
  {
    if (status)
      return Exception::make(status);

    /*
      1/ on regarde si oid est present dans la cache: si oui -> return error
      2/ si la collection est realize'e (oid valid) on fait:
      collectionGetByValue() -> si found -> return error
      3/ on insere dans le cache avec le state `added'
      v_items_cnt++;
    */

    if (CollectionPeer::isLocked(this))
      return Exception::make(IDB_COLLECTION_LOCKED, "collection '%s' is locked for writing", name);

    Status s = check(item_oid, IDB_COLLECTION_INSERT_ERROR);
    if (s) return s;

    IDB_COLL_LOAD_DEFERRED();
    touch();
    if (noDup)
      {
	Bool is_in;
	Status s = isIn(item_oid, is_in);
	if (s || is_in) return s;
      }

    /*
      printf("CollBag::insert(%s) -> %s\n", item_oid.toString(),
      getOid().toString());
    */
    create_cache();
    cache->insert(item_oid, v_items_cnt, added);
    v_items_cnt++;

    return Success;
  }

  Status CollBag::insert_p(const Object *item_o, Bool noDup)
  {
    if (status)
      return Exception::make(status);

    if (!isref) {
      Status s = check(item_o, IDB_COLLECTION_INSERT_ERROR);
      if (s) return s;
      return insert_p(item_o->getIDR() + IDB_OBJ_HEAD_SIZE, noDup);
    }

    if (CollectionPeer::isLocked(this))
      return Exception::make(IDB_COLLECTION_LOCKED, "collection '%s' is locked for writing", name);

    Status s = check(item_o, IDB_COLLECTION_INSERT_ERROR);
    if (s) return s;

    IDB_COLL_LOAD_DEFERRED();
    touch();
    if (noDup)
      {
	Bool is_in;
	Status s = isIn(item_o, is_in);
	if (s || is_in) return s;
      }

    /*
      printf("CollBag::insert(%s) -> %s\n", item_o->getOid().toString(),
      getOid().toString());
    */

    create_cache();
    cache->insert(item_o, v_items_cnt, added);
    v_items_cnt++;

    return Success;
  }

  Status CollBag::insert_p(Data val, Bool noDup, Size size)
  {
    if (status)
      return Exception::make(status);

    if (CollectionPeer::isLocked(this))
      return Exception::make(IDB_COLLECTION_LOCKED, "collection '%s' is locked for writing", name);

    Status s = check(val, size, IDB_COLLECTION_INSERT_ERROR);
    if (s) return s;

    IDB_COLL_LOAD_DEFERRED();
    touch();
    if (noDup)
      {
	Bool is_in;
	Status s = isIn_p(val, is_in, size);
	if (s || is_in) return s;
      }

#ifdef NEW_COLL_XDR2
    Data item_data = make_data(val, size, True);
#else
    Data item_data = make_data(val, size);
#endif

    create_cache();
#ifdef USE_VALUE_CACHE
    cache->insert(Value(item_data, item_size), v_items_cnt, added);
#else
    cache->insert(item_data, v_items_cnt, added);
#endif
    v_items_cnt++;

    return Success;
  }
}
