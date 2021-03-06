
//
// class CardinalityConstraint_Test
//
// package org.eyedb.syscls
//
// Generated by eyedbodl at Wed May 12 11:14:59 2010
//

package org.eyedb.syscls;

import org.eyedb.utils.*;
import org.eyedb.syscls.*;

public class CardinalityConstraint_Test extends AttributeComponent {

  public CardinalityConstraint_Test(org.eyedb.Database db) throws org.eyedb.Exception {
    super(db, 1);
    initialize(db);
  }

  public CardinalityConstraint_Test(org.eyedb.Database db, org.eyedb.Dataspace dataspace) throws org.eyedb.Exception {
    super(db, dataspace, 1);
    initialize(db);
  }

  private void initialize(org.eyedb.Database db) throws org.eyedb.Exception {
    setClass(((db != null) ? db.getSchema().getClass("cardinality_constraint_test") : CardinalityConstraint_Test.idbclass));

    setIDR(new byte[idr_objsz]);

    org.eyedb.Coder.memzero(getIDR(), org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE, idr_objsz - org.eyedb.ObjectHeader.IDB_OBJ_HEAD_SIZE);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public CardinalityConstraint_Test(org.eyedb.Struct x, boolean share) throws org.eyedb.Exception {
    super(x, share, 1);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public CardinalityConstraint_Test(CardinalityConstraint_Test x, boolean share) throws org.eyedb.Exception {
    super(x, share, 1);
    headerCode(org.eyedb.ObjectHeader._Struct_Type, idr_psize, org.eyedb.ObjectHeader.IDB_XINFO_LOCAL_OBJ, true);
    if (!share)
      getClass(true).newObjRealize(getDatabase(), this);
    setGRTObject(true);
    userInitialize();
  }

  public void setCardDesc(CardinalityDescription _card_desc)
  throws org.eyedb.Exception {
    getClass(true).getAttributes()[6].setValue(this, new org.eyedb.Value(_card_desc), 0);
  }

  public CardinalityDescription getCardDesc()
  throws org.eyedb.Exception {
    org.eyedb.Value __x;
    org.eyedb.Object __y;

    __x = getClass(true).getAttributes()[6].getValue(this, 0, true);
    __y = Database.makeObject(__x.sgetObject(), true);
    if (__y != __x.sgetObject())
      getClass(true).getAttributes()[6].setValue(this, new org.eyedb.Value(__y), 0);
    return (CardinalityDescription)__y;
  }


  protected CardinalityConstraint_Test(org.eyedb.Database db, int dummy) {
    super(db, 1);
  }

  protected CardinalityConstraint_Test(org.eyedb.Database db, org.eyedb.Dataspace dataspace, int dummy) {
    super(db, dataspace, 1);
  }

  protected CardinalityConstraint_Test(org.eyedb.Struct x, boolean share, int dummy) {
     super(x, share, 1);
  }

  protected CardinalityConstraint_Test(CardinalityConstraint_Test x, boolean share, int dummy) {
     super(x, share, 1);
  }

  static int idr_psize;
  static int idr_objsz;
  public static org.eyedb.Class idbclass;
  static org.eyedb.StructClass make(org.eyedb.StructClass CardinalityConstraint_Test_class, org.eyedb.Schema m)
   throws org.eyedb.Exception {
    if (CardinalityConstraint_Test_class == null)
      return new org.eyedb.StructClass("cardinality_constraint_test", ((m != null) ? m.getClass("eyedb::AttributeComponent") : AttributeComponent.idbclass));
    org.eyedb.Attribute[] attr = new org.eyedb.Attribute[7];
    int[] dims;

    dims = null;
    attr[6] = new org.eyedb.Attribute(((m != null) ? m.getClass("cardinality_description") : CardinalityDescription.idbclass), idbclass, "card_desc", 6, false, 0, dims);

    CardinalityConstraint_Test_class.setAttributes(attr, 6, 1);

    return CardinalityConstraint_Test_class;
  }

  static void init_p()
   throws org.eyedb.Exception {
    idbclass = make(null, null);
    try {
      Database.hash.put("cardinality_constraint_test", CardinalityConstraint_Test.class.getConstructor(Database.clazz));
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

