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

package org.eyedb.dbm;

import org.eyedb.*;
import org.eyedb.utils.*;
import org.eyedb.syscls.*;

public class DBEntry extends Root {

  public DBEntry(org.eyedb.Database db) throws org.eyedb.Exception {
    super(db, 1);
    initialize(db);
  }

  public DBEntry(org.eyedb.Database db, org.eyedb.Dataspace dataspace) throws org.eyedb.Exception {
    super(db, dataspace, 1);
    initialize(db);
  }

  private void initialize(org.eyedb.Database db) throws org.eyedb.Exception {
    setClass(((db != null) ? db.getSchema().getClass("database_entry") : DBEntry.idbclass));

    setIDR(new byte[idr_objsz]);

    org.eyedb.Coder.memzero(getIDR(), org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE, idr_objsz - org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public DBEntry(org.eyedb.Struct x, boolean share) throws org.eyedb.Exception {
    super(x, share, 1);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public DBEntry(DBEntry x, boolean share) throws org.eyedb.Exception {
    super(x, share, 1);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public void setDbname(String _dbname)
  throws org.eyedb.Exception {
    int len = _dbname.length() + 1;

    int size = getClass(true).getAttributes()[2].getSize(this);
    if (size < len)
      getClass(true).getAttributes()[2].setSize(this, len);
    getClass(true).getAttributes()[2].setStringValue(this, _dbname);
  }

  public void setDbname(int a0, char _dbname)
  throws org.eyedb.Exception {
    int from = a0;
    int size = getClass(true).getAttributes()[2].getSize(this);
    if (size <= from)
      getClass(true).getAttributes()[2].setSize(this, from+1);
    getClass(true).getAttributes()[2].setValue(this, new org.eyedb.Value(_dbname), from);
  }

  public String getDbname()
  throws org.eyedb.Exception {
    return getClass(true).getAttributes()[2].getStringValue(this);
  }

  public void setDbid(int _dbid)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[3].setValue(this, new org.eyedb.Value(_dbid), 0);
  }

  public int getDbid()
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;

    __x = getClass(true).getAttributes()[3].getValue(this, 0, true);
    return __x.sgetInt();
  }

  public void setDbfile(String _dbfile)
  throws org.eyedb.Exception {
    int len = _dbfile.length() + 1;

    int size = getClass(true).getAttributes()[4].getSize(this);
    if (size < len)
      getClass(true).getAttributes()[4].setSize(this, len);
    getClass(true).getAttributes()[4].setStringValue(this, _dbfile);
  }

  public void setDbfile(int a0, char _dbfile)
  throws org.eyedb.Exception {
    int from = a0;
    int size = getClass(true).getAttributes()[4].getSize(this);
    if (size <= from)
      getClass(true).getAttributes()[4].setSize(this, from+1);
    getClass(true).getAttributes()[4].setValue(this, new org.eyedb.Value(_dbfile), from);
  }

  public String getDbfile()
  throws org.eyedb.Exception {
    return getClass(true).getAttributes()[4].getStringValue(this);
  }

  public void setDefaultAccess(int _default_access)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[5].setValue(this, new org.eyedb.Value(_default_access), 0);
  }

  public int getDefaultAccess()
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;

    __x = getClass(true).getAttributes()[5].getValue(this, 0, true);
    return __x.sgetInt();
  }

  public void setSchm(org.eyedb.Object _schm)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[6].setValue(this, new org.eyedb.Value(_schm), 0);
  }

  public org.eyedb.Object getSchm()
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;

    __x = getClass(true).getAttributes()[6].getValue(this, 0, true);
    __y = Database.makeObject(__x.sgetObject(), true);
    if (__y != __x.sgetObject())
      getClass(true).getAttributes()[6].setValue(this, new org.eyedb.Value(__y), 0);
    return (org.eyedb.Object)__y;
  }

  public void setSchmOid_oid(org.eyedb.Oid _oid)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[6].setOid(this, _oid, 0);
  }

  public org.eyedb.Oid getSchmOid_oid()
  throws org.eyedb.Exception {
    org.eyedb.Oid __x;

    __x = getClass(true).getAttributes()[6].getOid(this, 0);
    return __x;
  }

  public void setComment(String _comment)
  throws org.eyedb.Exception {
    int len = _comment.length() + 1;

    int size = getClass(true).getAttributes()[7].getSize(this);
    if (size < len)
      getClass(true).getAttributes()[7].setSize(this, len);
    getClass(true).getAttributes()[7].setStringValue(this, _comment);
  }

  public void setComment(int a0, char _comment)
  throws org.eyedb.Exception {
    int from = a0;
    int size = getClass(true).getAttributes()[7].getSize(this);
    if (size <= from)
      getClass(true).getAttributes()[7].setSize(this, from+1);
    getClass(true).getAttributes()[7].setValue(this, new org.eyedb.Value(_comment), from);
  }

  public String getComment()
  throws org.eyedb.Exception {
    return getClass(true).getAttributes()[7].getStringValue(this);
  }

  public void setProps(int a0, DBProperty _props)
  throws org.eyedb.Exception {
    int from = a0;
    int size = getClass(true).getAttributes()[8].getSize(this);
    if (size <= from)
      getClass(true).getAttributes()[8].setSize(this, from+1);
    getClass(true).getAttributes()[8].setValue(this, new org.eyedb.Value(_props), from);
  }

  public DBProperty getProps(int a0)
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;
    int from = a0;

    __x = getClass(true).getAttributes()[8].getValue(this, from, true);
    __y = Database.makeObject(__x.sgetObject(), true);
    if (__y != __x.sgetObject())
      getClass(true).getAttributes()[8].setValue(this, new org.eyedb.Value(__y), 0);
    return (DBProperty)__y;
  }

  int getProps_cnt()
  {
    return getClass(true).getAttributes()[8].getSize(this);
  }

  public void setPropsOid_oid(int a0, org.eyedb.Oid _oid)
  throws org.eyedb.Exception {
    int from = a0;
    int size = getClass(true).getAttributes()[8].getSize(this);
    if (size <= from)
      getClass(true).getAttributes()[8].setSize(this, from+1);
    getClass(true).getAttributes()[8].setOid(this, _oid, from);
  }

  public org.eyedb.Oid getPropsOid_oid(int a0)
  throws org.eyedb.Exception {
    org.eyedb.Oid __x;
    int from = a0;

    __x = getClass(true).getAttributes()[8].getOid(this, from);
    return __x;
  }


  protected DBEntry(org.eyedb.Database db, int dummy) {
    super(db, 1);
  }

  protected DBEntry(org.eyedb.Database db, org.eyedb.Dataspace dataspace, int dummy) {
    super(db, dataspace, 1);
  }

  protected DBEntry(org.eyedb.Struct x, boolean share, int dummy) {
     super(x, share, 1);
  }

  protected DBEntry(DBEntry x, boolean share, int dummy) {
     super(x, share, 1);
  }

  static int idr_psize;
  static int idr_objsz;
  public static org.eyedb.Class idbclass;
  static StructClass make(StructClass DBEntry_class, org.eyedb.Schema m)
   throws org.eyedb.Exception {
    if (DBEntry_class == null)
      return new StructClass("database_entry", ((m != null) ? m.getClass("Root") : Root.idbclass));
    org.eyedb.Attribute[] attr = new org.eyedb.Attribute[9];
    int[] dims;

    dims = new int[1];
    dims[0] = -1;
    attr[2] = new org.eyedb.Attribute(((m != null) ? m.getClass("char") : Char.idbclass), idbclass, "dbname", 2, false, 1, dims);

    dims = null;
    attr[3] = new org.eyedb.Attribute(((m != null) ? m.getClass("int") : Int32.idbclass), idbclass, "dbid", 3, false, 0, dims);

    dims = new int[1];
    dims[0] = -1;
    attr[4] = new org.eyedb.Attribute(((m != null) ? m.getClass("char") : Char.idbclass), idbclass, "dbfile", 4, false, 1, dims);

    dims = null;
    attr[5] = new org.eyedb.Attribute(((m != null) ? m.getClass("database_access_mode") : DBAccessMode.idbclass), idbclass, "default_access", 5, false, 0, dims);

    dims = null;
    attr[6] = new org.eyedb.Attribute(((m != null) ? m.getClass("object") : org.eyedb.Object.idbclass), idbclass, "schm", 6, true, 0, dims);

    dims = new int[1];
    dims[0] = -1;
    attr[7] = new org.eyedb.Attribute(((m != null) ? m.getClass("char") : Char.idbclass), idbclass, "comment", 7, false, 1, dims);

    dims = new int[1];
    dims[0] = -1;
    attr[8] = new org.eyedb.Attribute(((m != null) ? m.getClass("database_property") : DBProperty.idbclass), idbclass, "props", 8, true, 1, dims);

    DBEntry_class.setAttributes(attr, 2, 7);

    return DBEntry_class;
  }

  static void init_p()
   throws org.eyedb.Exception {
    idbclass = make(null, null);
    try {
      Database.hash.put("database_entry", DBEntry.class.getConstructor(Database.clazz));
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

