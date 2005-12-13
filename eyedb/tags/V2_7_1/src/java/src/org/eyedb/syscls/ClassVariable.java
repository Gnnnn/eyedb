
//
// class ClassVariable
//
// package org.eyedb.syscls
//
// Generated by eyedbodl at Sat Dec 10 16:57:24 2005
//

package org.eyedb.syscls;

import org.eyedb.utils.*;
import org.eyedb.syscls.*;

public class ClassVariable extends ClassComponent {

  public ClassVariable(org.eyedb.Database db) throws org.eyedb.Exception {
    super(db, 1);
    initialize(db);
  }

  public ClassVariable(org.eyedb.Database db, org.eyedb.Dataspace dataspace) throws org.eyedb.Exception {
    super(db, dataspace, 1);
    initialize(db);
  }

  private void initialize(org.eyedb.Database db) throws org.eyedb.Exception {
    setClass(((db != null) ? db.getSchema().getClass("class_variable") : ClassVariable.idbclass));

    setIDR(new byte[idr_objsz]);

    org.eyedb.Coder.memzero(getIDR(), org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE, idr_objsz - org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public ClassVariable(org.eyedb.Struct x, boolean share) throws org.eyedb.Exception {
    super(x, share, 1);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public ClassVariable(ClassVariable x, boolean share) throws org.eyedb.Exception {
    super(x, share, 1);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public void setVname(String _vname)
  throws org.eyedb.Exception {
    int len = _vname.length() + 1;

    int size = getClass(true).getAttributes()[4].getSize(this);
    if (size < len)
      getClass(true).getAttributes()[4].setSize(this, len);
    getClass(true).getAttributes()[4].setStringValue(this, _vname);
  }

  public void setVname(int a0, char _vname)
  throws org.eyedb.Exception {
    int from = a0;
    int size = getClass(true).getAttributes()[4].getSize(this);
    if (size <= from)
      getClass(true).getAttributes()[4].setSize(this, from+1);
    getClass(true).getAttributes()[4].setValue(this, new org.eyedb.Value(_vname), from);
  }

  public String getVname()
  throws org.eyedb.Exception {
    return getClass(true).getAttributes()[4].getStringValue(this);
  }

  public void setVal(org.eyedb.Object _val)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[5].setValue(this, new org.eyedb.Value(_val), 0);
  }

  public org.eyedb.Object getVal()
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;

    __x = getClass(true).getAttributes()[5].getValue(this, 0, true);
    __y = Database.makeObject(__x.sgetObject(), true);
    if (__y != __x.sgetObject())
      getClass(true).getAttributes()[5].setValue(this, new org.eyedb.Value(__y), 0);
    return (org.eyedb.Object)__y;
  }

  public void setValOid_oid(org.eyedb.Oid _oid)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[5].setOid(this, _oid, 0);
  }

  public org.eyedb.Oid getValOid_oid()
  throws org.eyedb.Exception {
    org.eyedb.Oid __x;

    __x = getClass(true).getAttributes()[5].getOid(this, 0);
    return __x;
  }


  protected ClassVariable(org.eyedb.Database db, int dummy) {
    super(db, 1);
  }

  protected ClassVariable(org.eyedb.Database db, org.eyedb.Dataspace dataspace, int dummy) {
    super(db, dataspace, 1);
  }

  protected ClassVariable(org.eyedb.Struct x, boolean share, int dummy) {
     super(x, share, 1);
  }

  protected ClassVariable(ClassVariable x, boolean share, int dummy) {
     super(x, share, 1);
  }

  static int idr_psize;
  static int idr_objsz;
  public static org.eyedb.Class idbclass;
  static org.eyedb.StructClass make(org.eyedb.StructClass ClassVariable_class, org.eyedb.Schema m)
   throws org.eyedb.Exception {
    if (ClassVariable_class == null)
      return new org.eyedb.StructClass("class_variable", ((m != null) ? m.getClass("ClassComponent") : ClassComponent.idbclass));
    org.eyedb.Attribute[] attr = new org.eyedb.Attribute[6];
    int[] dims;

    dims = new int[1];
    dims[0] = -1;
    attr[4] = new org.eyedb.Attribute(((m != null) ? m.getClass("char") : org.eyedb.Char.idbclass), idbclass, "org.eyedb.Char", 4, false, 1, dims);

    dims = null;
    attr[5] = new org.eyedb.Attribute(((m != null) ? m.getClass("object") : org.eyedb.Object.idbclass), idbclass, "org.eyedb.Object", 5, true, 0, dims);

    ClassVariable_class.setAttributes(attr, 4, 2);

    return ClassVariable_class;
  }

  static void init_p()
   throws org.eyedb.Exception {
    idbclass = make(null, null);
    try {
      Database.hash.put("class_variable", ClassVariable.class.getConstructor(Database.clazz));
    } catch(java.lang.Exception e) {
      e.printStackTrace();
    }
  }

  static void init()
   throws org.eyedb.Exception {
    make((org.eyedb.StructClass)idbclass, null);

    idr_objsz = idbclass.getObjectSize();
    idr_psize = idbclass.getObjectPSize();
  }

}

