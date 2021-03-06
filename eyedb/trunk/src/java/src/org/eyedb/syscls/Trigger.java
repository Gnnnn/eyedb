
//
// class Trigger
//
// package org.eyedb.syscls
//
// Generated by eyedbodl at Wed May 12 11:14:59 2010
//

package org.eyedb.syscls;

import org.eyedb.utils.*;
import org.eyedb.syscls.*;

public class Trigger extends AgregatClassExecutable {

  public Trigger(org.eyedb.Database db) throws org.eyedb.Exception {
    super(db, 1);
    initialize(db);
  }

  public Trigger(org.eyedb.Database db, org.eyedb.Dataspace dataspace) throws org.eyedb.Exception {
    super(db, dataspace, 1);
    initialize(db);
  }

  private void initialize(org.eyedb.Database db) throws org.eyedb.Exception {
    setClass(((db != null) ? db.getSchema().getClass("trigger") : Trigger.idbclass));

    setIDR(new byte[idr_objsz]);

    org.eyedb.Coder.memzero(getIDR(), org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE, idr_objsz - org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public Trigger(org.eyedb.Struct x, boolean share) throws org.eyedb.Exception {
    super(x, share, 1);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public Trigger(Trigger x, boolean share) throws org.eyedb.Exception {
    super(x, share, 1);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public void setType(int _type)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[5].setValue(this, new org.eyedb.Value(_type), 0);
  }

  public int getType()
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;

    __x = getClass(true).getAttributes()[5].getValue(this, 0, true);
    return __x.sgetInt();
  }

  public void setLight(int _light)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[6].setValue(this, new org.eyedb.Value(_light), 0);
  }

  public int getLight()
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;

    __x = getClass(true).getAttributes()[6].getValue(this, 0, true);
    return __x.sgetInt();
  }

  public void setSuffix(String _suffix)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[7].setStringValue(this, _suffix);
  }

  public void setSuffix(int a0, char _suffix)
  throws org.eyedb.Exception {
    int from = a0;
    getClass(true).getAttributes()[7].setValue(this, new org.eyedb.Value(_suffix), from);
  }

  public String getSuffix()
  throws org.eyedb.Exception {
    return getClass(true).getAttributes()[7].getStringValue(this);
  }


  protected Trigger(org.eyedb.Database db, int dummy) {
    super(db, 1);
  }

  protected Trigger(org.eyedb.Database db, org.eyedb.Dataspace dataspace, int dummy) {
    super(db, dataspace, 1);
  }

  protected Trigger(org.eyedb.Struct x, boolean share, int dummy) {
     super(x, share, 1);
  }

  protected Trigger(Trigger x, boolean share, int dummy) {
     super(x, share, 1);
  }

  static int idr_psize;
  static int idr_objsz;
  public static org.eyedb.Class idbclass;
  static org.eyedb.StructClass make(org.eyedb.StructClass Trigger_class, org.eyedb.Schema m)
   throws org.eyedb.Exception {
    if (Trigger_class == null)
      return new org.eyedb.StructClass("trigger", ((m != null) ? m.getClass("eyedb::AgregatClassExecutable") : AgregatClassExecutable.idbclass));
    org.eyedb.Attribute[] attr = new org.eyedb.Attribute[8];
    int[] dims;

    dims = null;
    attr[5] = new org.eyedb.Attribute(((m != null) ? m.getClass("trigger_type") : TriggerType.idbclass), idbclass, "type", 5, false, 0, dims);

    dims = null;
    attr[6] = new org.eyedb.Attribute(((m != null) ? m.getClass("int") : org.eyedb.Int32.idbclass), idbclass, "light", 6, false, 0, dims);

    dims = new int[1];
    dims[0] = 16;
    attr[7] = new org.eyedb.Attribute(((m != null) ? m.getClass("char") : org.eyedb.Char.idbclass), idbclass, "suffix", 7, false, 1, dims);

    Trigger_class.setAttributes(attr, 5, 3);

    return Trigger_class;
  }

  static void init_p()
   throws org.eyedb.Exception {
    idbclass = make(null, null);
    try {
      Database.hash.put("trigger", Trigger.class.getConstructor(Database.clazz));
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

