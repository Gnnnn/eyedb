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


#ifndef _EYEDB_COLL_SET_H
#define _EYEDB_COLL_SET_H

namespace eyedb {

  /**
     @addtogroup eyedb
     @{
  */

  /**
     Not yet documented.
  */
  class CollSet : public Collection {

    // ----------------------------------------------------------------------
    // CollSet Interface
    // ----------------------------------------------------------------------
  public:
    /**
       Not yet documented
       @param db
       @param n
       @param mc
       @param isref
       @param idximpl
    */
    CollSet(Database *db, const char *n, Class *mc = NULL,
	    Bool isref = True,
	    const IndexImpl *idximpl = 0);

    /**
       Not yet documented
       @param db
       @param n
       @param mc
       @param dim
       @param idximpl
    */
    CollSet(Database *db, const char *n, Class *mc, int dim,
	    const IndexImpl *idximpl = 0);

    /**
       Not yet documented
       @param o
    */
    CollSet(const CollSet &o);

    /**
       Not yet documented
       @param o
       @return
    */
    CollSet& operator=(const CollSet &o);

    /**
       Not yet documented
       @return
    */
    virtual Object *clone() const {return new CollSet(*this);}

    /**
       Not yet documented
       @param item_oid
       @param noDup
       @return
    */
    virtual CollSet *asCollSet() {return this;}

    /**
       Not yet documented
       @return
    */
    virtual const CollSet *asCollSet() const {return this;}

    // ----------------------------------------------------------------------
    // CollSet Private Part
    // ----------------------------------------------------------------------
  private:
    void init();

    const char *getClassName() const;
    CollSet(const char *, Class *,
	    const Oid&, const Oid&, int,
	    int, int, const IndexImpl *,
	    Object *, Bool, Data, Size);
    friend class CollectionPeer;

    // ----------------------------------------------------------------------
    // CollSet Restricted Access (conceptually private)
    // ----------------------------------------------------------------------
  public:
    CollSet(const char *, Class * = NULL, Bool = True,
	    const IndexImpl * = 0);
    CollSet(const char *, Class *, int,
	    const IndexImpl * = 0);

    Status insert_p(const Oid &item_oid, Bool noDup = False);
    Status insert_p(const Object *item_o, Bool noDup = False);
    Status insert_p(Data data, Bool noDup = False, Size size = defaultSize);
  };

  /**
     @}
  */

}

#endif
