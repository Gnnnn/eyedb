
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

package dspsch;

import org.eyedb.*;
import org.eyedb.utils.*;
import org.eyedb.syscls.*;

public class O1 extends org.eyedb.Struct {

  public O1(org.eyedb.Database db) throws org.eyedb.Exception {
    super(db);
    initialize(db);
  }

  public O1(org.eyedb.Database db, org.eyedb.Dataspace dataspace) throws org.eyedb.Exception {
    super(db, dataspace);
    initialize(db);
  }

  private void initialize(org.eyedb.Database db) throws org.eyedb.Exception {
    setClass(((db != null) ? db.getSchema().getClass("O1") : O1.idbclass));

    setIDR(new byte[idr_objsz]);

    org.eyedb.Coder.memzero(getIDR(), org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE, idr_objsz - org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public O1(org.eyedb.Struct x, boolean share) throws org.eyedb.Exception {
    super(x, share);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public O1(O1 x, boolean share) throws org.eyedb.Exception {
    super(x, share);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public void setN1(int _n1)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[2].setValue(this, new org.eyedb.Value(_n1), 0);
  }

  public int getN1()
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;

    __x = getClass(true).getAttributes()[2].getValue(this, 0, true);
    return __x.sgetInt();
  }

  public void setData1(String _data1)
  throws org.eyedb.Exception {
    int len = _data1.length() + 1;

    int size = getClass(true).getAttributes()[3].getSize(this);
    if (size < len)
      getClass(true).getAttributes()[3].setSize(this, len);
    getClass(true).getAttributes()[3].setStringValue(this, _data1);
  }

  public void setData1(int a0, char _data1)
  throws org.eyedb.Exception {
    int from = a0;
    int size = getClass(true).getAttributes()[3].getSize(this);
    if (size <= from)
      getClass(true).getAttributes()[3].setSize(this, from+1);
    getClass(true).getAttributes()[3].setValue(this, new org.eyedb.Value(_data1), from);
  }

  public String getData1()
  throws org.eyedb.Exception {
    return getClass(true).getAttributes()[3].getStringValue(this);
  }


  protected O1(org.eyedb.Database db, int dummy) {
    super(db);
  }

  protected O1(org.eyedb.Database db, org.eyedb.Dataspace dataspace, int dummy) {
    super(db, dataspace);
  }

  protected O1(org.eyedb.Struct x, boolean share, int dummy) {
     super(x, share);
  }

  protected O1(O1 x, boolean share, int dummy) {
     super(x, share);
  }

  static int idr_psize;
  static int idr_objsz;
  public static org.eyedb.Class idbclass;
  static StructClass make(StructClass O1_class, org.eyedb.Schema m)
   throws org.eyedb.Exception {
    if (O1_class == null)
      return new StructClass("O1", ((m != null) ? m.getClass("org.eyedb.Struct") : org.eyedb.Struct.idbclass));
    org.eyedb.Attribute[] attr = new org.eyedb.Attribute[4];
    int[] dims;

    dims = null;
    attr[2] = new org.eyedb.Attribute(((m != null) ? m.getClass("int") : Int32.idbclass), idbclass, "n1", 2, false, 0, dims);

    dims = new int[1];
    dims[0] = -1;
    attr[3] = new org.eyedb.Attribute(((m != null) ? m.getClass("char") : Char.idbclass), idbclass, "data1", 3, false, 1, dims);

    O1_class.setAttributes(attr, 2, 2);

    return O1_class;
  }

  static void init_p()
   throws org.eyedb.Exception {
    idbclass = make(null, null);
    try {
      Database.hash.put("O1", O1.class.getConstructor(Database.clazz));
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

