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

package org.eyedb.syscls;

import org.eyedb.*;
import org.eyedb.utils.*;
import org.eyedb.syscls.*;

public class Signature extends Root {

  public Signature(org.eyedb.Database db) throws org.eyedb.Exception {
    super(db, 1);
    initialize(db);
  }

  public Signature(org.eyedb.Database db, org.eyedb.Dataspace dataspace) throws org.eyedb.Exception {
    super(db, dataspace, 1);
    initialize(db);
  }

  private void initialize(org.eyedb.Database db) throws org.eyedb.Exception {
    setClass(((db != null) ? db.getSchema().getClass("signature") : Signature.idbclass));

    setIDR(new byte[idr_objsz]);

    org.eyedb.Coder.memzero(getIDR(), org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE, idr_objsz - org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public Signature(org.eyedb.Struct x, boolean share) throws org.eyedb.Exception {
    super(x, share, 1);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public Signature(Signature x, boolean share) throws org.eyedb.Exception {
    super(x, share, 1);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public void setRettype(ArgType _rettype)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[2].setValue(this, new org.eyedb.Value(_rettype), 0);
  }

  public ArgType getRettype()
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;

    __x = getClass(true).getAttributes()[2].getValue(this, 0, true);
    __y = Database.makeObject(__x.sgetObject(), true);
    if (__y != __x.sgetObject())
      getClass(true).getAttributes()[2].setValue(this, new org.eyedb.Value(__y), 0);
    return (ArgType)__y;
  }

  public void setNargs(int _nargs)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[3].setValue(this, new org.eyedb.Value(_nargs), 0);
  }

  public int getNargs()
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;

    __x = getClass(true).getAttributes()[3].getValue(this, 0, true);
    return __x.sgetInt();
  }

  public void setTypes(int a0, ArgType _types)
  throws org.eyedb.Exception {
    int from = a0;
    int size = getClass(true).getAttributes()[4].getSize(this);
    if (size <= from)
      getClass(true).getAttributes()[4].setSize(this, from+1);
    getClass(true).getAttributes()[4].setValue(this, new org.eyedb.Value(_types), from);
  }

  public ArgType getTypes(int a0)
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;
    int from = a0;

    __x = getClass(true).getAttributes()[4].getValue(this, from, true);
    __y = Database.makeObject(__x.sgetObject(), true);
    if (__y != __x.sgetObject())
      getClass(true).getAttributes()[4].setValue(this, new org.eyedb.Value(__y), 0);
    return (ArgType)__y;
  }

  int getTypes_cnt()
  {
    return getClass(true).getAttributes()[4].getSize(this);
  }


  protected Signature(org.eyedb.Database db, int dummy) {
    super(db, 1);
  }

  protected Signature(org.eyedb.Database db, org.eyedb.Dataspace dataspace, int dummy) {
    super(db, dataspace, 1);
  }

  protected Signature(org.eyedb.Struct x, boolean share, int dummy) {
     super(x, share, 1);
  }

  protected Signature(Signature x, boolean share, int dummy) {
     super(x, share, 1);
  }

  static int idr_psize;
  static int idr_objsz;
  public static org.eyedb.Class idbclass;
  static StructClass make(StructClass Signature_class, org.eyedb.Schema m)
   throws org.eyedb.Exception {
    if (Signature_class == null)
      return new StructClass("signature", ((m != null) ? m.getClass("Root") : Root.idbclass));
    org.eyedb.Attribute[] attr = new org.eyedb.Attribute[5];
    int[] dims;

    dims = null;
    attr[2] = new org.eyedb.Attribute(((m != null) ? m.getClass("argtype") : ArgType.idbclass), idbclass, "rettype", 2, false, 0, dims);

    dims = null;
    attr[3] = new org.eyedb.Attribute(((m != null) ? m.getClass("int") : Int32.idbclass), idbclass, "nargs", 3, false, 0, dims);

    dims = new int[1];
    dims[0] = -1;
    attr[4] = new org.eyedb.Attribute(((m != null) ? m.getClass("argtype") : ArgType.idbclass), idbclass, "types", 4, false, 1, dims);

    Signature_class.setAttributes(attr, 2, 3);

    return Signature_class;
  }

  static void init_p()
   throws org.eyedb.Exception {
    idbclass = make(null, null);
    try {
      Database.hash.put("signature", Signature.class.getConstructor(Database.clazz));
    } catch(java.lang.Exception e) {
      e.printStackTrace();
    }
  }

  static void init()
   throws org.eyedb.Exception {
    make((StructClass)idbclass, null);

    idr_objsz = idbclass.getObjectSize();
    idr_psize = idbclass.getObjectPSize();
  }

}

