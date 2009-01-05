
//
// class AttributeConvertType
//
// package org.eyedb.syscls
//
// Generated by eyedbodl at Mon Jan  5 17:19:09 2009
//

package org.eyedb.syscls;

import org.eyedb.utils.*;
import org.eyedb.syscls.*;

public class AttributeConvertType extends org.eyedb.Enum {

  AttributeConvertType(org.eyedb.Database db)
  {
    super(db);
  }

  AttributeConvertType()
  {
    super();
  }

  public static final int INT16_TO_INT16 = 0;
  public static final int INT16_TO_INT32 = 1;
  public static final int INT16_TO_INT64 = 2;
  public static final int INT16_TO_FLOAT = 3;
  public static final int INT16_TO_BYTE = 4;
  public static final int INT16_TO_CHAR = 5;
  public static final int INT16_TO_ENUM = 6;
  public static final int INT32_TO_INT32 = 7;
  public static final int INT32_TO_INT16 = 8;
  public static final int INT32_TO_INT64 = 9;
  public static final int INT32_TO_FLOAT = 10;
  public static final int INT32_TO_BYTE = 11;
  public static final int INT32_TO_CHAR = 12;
  public static final int INT32_TO_ENUM = 13;
  public static final int INT64_TO_INT64 = 14;
  public static final int INT64_TO_INT16 = 15;
  public static final int INT64_TO_INT32 = 16;
  public static final int INT64_TO_FLOAT = 17;
  public static final int INT64_TO_BYTE = 18;
  public static final int INT64_TO_CHAR = 19;
  public static final int INT64_TO_ENUM = 20;
  public static final int FLOAT_TO_FLOAT = 21;
  public static final int FLOAT_TO_INT16 = 22;
  public static final int FLOAT_TO_INT32 = 23;
  public static final int FLOAT_TO_INT64 = 24;
  public static final int FLOAT_TO_BYTE = 25;
  public static final int FLOAT_TO_CHAR = 26;
  public static final int FLOAT_TO_ENUM = 27;
  public static final int CHAR_TO_CHAR = 28;
  public static final int CHAR_TO_INT16 = 29;
  public static final int CHAR_TO_INT32 = 30;
  public static final int CHAR_TO_INT64 = 31;
  public static final int CHAR_TO_FLOAT = 32;
  public static final int CHAR_TO_BYTE = 33;
  public static final int CHAR_TO_ENUM = 34;
  public static final int BYTE_TO_BYTE = 35;
  public static final int BYTE_TO_INT16 = 36;
  public static final int BYTE_TO_INT32 = 37;
  public static final int BYTE_TO_INT64 = 38;
  public static final int BYTE_TO_FLOAT = 39;
  public static final int BYTE_TO_CHAR = 40;
  public static final int BYTE_TO_ENUM = 41;
  public static final int ENUM_TO_ENUM = 42;
  public static final int ENUM_TO_INT16 = 43;
  public static final int ENUM_TO_INT32 = 44;
  public static final int ENUM_TO_INT64 = 45;
  public static final int ENUM_TO_FLOAT = 46;
  public static final int ENUM_TO_CHAR = 47;
  public static final int ENUM_TO_BYTE = 48;
  public static final int CHAR_TO_STRING = 49;
  public static final int STRING_TO_CHAR = 50;
  public static final int INT16_TO_STRING = 51;
  public static final int STRING_TO_INT16 = 52;
  public static final int INT32_TO_STRING = 53;
  public static final int STRING_TO_INT32 = 54;
  public static final int INT64_TO_STRING = 55;
  public static final int STRING_TO_INT64 = 56;
  public static final int FLOAT_TO_STRING = 57;
  public static final int STRING_TO_FLOAT = 58;
  public static final int BYTE_TO_STRING = 59;
  public static final int STRING_TO_BYTE = 60;
  public static final int SET_TO_BAG = 61;
  public static final int SET_TO_ARRAY = 62;
  public static final int SET_TO_LIST = 63;
  public static final int BAG_TO_SET = 64;
  public static final int BAG_TO_ARRAY = 65;
  public static final int BAG_TO_LIST = 66;
  public static final int ARRAY_TO_BAG = 67;
  public static final int ARRAY_TO_SET = 68;
  public static final int ARRAY_TO_LIST = 69;
  public static final int LIST_TO_BAG = 70;
  public static final int LIST_TO_ARRAY = 71;
  public static final int LIST_TO_SET = 72;
  public static final int CLASS_TO_CLASS = 73;
  public static final int USER_CNV = 74;
  public static final int NIL_CNV = 75;

  static org.eyedb.EnumClass make(org.eyedb.EnumClass AttributeConvertType_class, org.eyedb.Schema m)
  {
    if (AttributeConvertType_class == null)
      return new org.eyedb.EnumClass("attribute_convert_type");

    org.eyedb.EnumItem[] en = new org.eyedb.EnumItem[76];
    en[0] = new org.eyedb.EnumItem("INT16_TO_INT16", 0, 0);
    en[1] = new org.eyedb.EnumItem("INT16_TO_INT32", 1, 1);
    en[2] = new org.eyedb.EnumItem("INT16_TO_INT64", 2, 2);
    en[3] = new org.eyedb.EnumItem("INT16_TO_FLOAT", 3, 3);
    en[4] = new org.eyedb.EnumItem("INT16_TO_BYTE", 4, 4);
    en[5] = new org.eyedb.EnumItem("INT16_TO_CHAR", 5, 5);
    en[6] = new org.eyedb.EnumItem("INT16_TO_ENUM", 6, 6);
    en[7] = new org.eyedb.EnumItem("INT32_TO_INT32", 7, 7);
    en[8] = new org.eyedb.EnumItem("INT32_TO_INT16", 8, 8);
    en[9] = new org.eyedb.EnumItem("INT32_TO_INT64", 9, 9);
    en[10] = new org.eyedb.EnumItem("INT32_TO_FLOAT", 10, 10);
    en[11] = new org.eyedb.EnumItem("INT32_TO_BYTE", 11, 11);
    en[12] = new org.eyedb.EnumItem("INT32_TO_CHAR", 12, 12);
    en[13] = new org.eyedb.EnumItem("INT32_TO_ENUM", 13, 13);
    en[14] = new org.eyedb.EnumItem("INT64_TO_INT64", 14, 14);
    en[15] = new org.eyedb.EnumItem("INT64_TO_INT16", 15, 15);
    en[16] = new org.eyedb.EnumItem("INT64_TO_INT32", 16, 16);
    en[17] = new org.eyedb.EnumItem("INT64_TO_FLOAT", 17, 17);
    en[18] = new org.eyedb.EnumItem("INT64_TO_BYTE", 18, 18);
    en[19] = new org.eyedb.EnumItem("INT64_TO_CHAR", 19, 19);
    en[20] = new org.eyedb.EnumItem("INT64_TO_ENUM", 20, 20);
    en[21] = new org.eyedb.EnumItem("FLOAT_TO_FLOAT", 21, 21);
    en[22] = new org.eyedb.EnumItem("FLOAT_TO_INT16", 22, 22);
    en[23] = new org.eyedb.EnumItem("FLOAT_TO_INT32", 23, 23);
    en[24] = new org.eyedb.EnumItem("FLOAT_TO_INT64", 24, 24);
    en[25] = new org.eyedb.EnumItem("FLOAT_TO_BYTE", 25, 25);
    en[26] = new org.eyedb.EnumItem("FLOAT_TO_CHAR", 26, 26);
    en[27] = new org.eyedb.EnumItem("FLOAT_TO_ENUM", 27, 27);
    en[28] = new org.eyedb.EnumItem("CHAR_TO_CHAR", 28, 28);
    en[29] = new org.eyedb.EnumItem("CHAR_TO_INT16", 29, 29);
    en[30] = new org.eyedb.EnumItem("CHAR_TO_INT32", 30, 30);
    en[31] = new org.eyedb.EnumItem("CHAR_TO_INT64", 31, 31);
    en[32] = new org.eyedb.EnumItem("CHAR_TO_FLOAT", 32, 32);
    en[33] = new org.eyedb.EnumItem("CHAR_TO_BYTE", 33, 33);
    en[34] = new org.eyedb.EnumItem("CHAR_TO_ENUM", 34, 34);
    en[35] = new org.eyedb.EnumItem("BYTE_TO_BYTE", 35, 35);
    en[36] = new org.eyedb.EnumItem("BYTE_TO_INT16", 36, 36);
    en[37] = new org.eyedb.EnumItem("BYTE_TO_INT32", 37, 37);
    en[38] = new org.eyedb.EnumItem("BYTE_TO_INT64", 38, 38);
    en[39] = new org.eyedb.EnumItem("BYTE_TO_FLOAT", 39, 39);
    en[40] = new org.eyedb.EnumItem("BYTE_TO_CHAR", 40, 40);
    en[41] = new org.eyedb.EnumItem("BYTE_TO_ENUM", 41, 41);
    en[42] = new org.eyedb.EnumItem("ENUM_TO_ENUM", 42, 42);
    en[43] = new org.eyedb.EnumItem("ENUM_TO_INT16", 43, 43);
    en[44] = new org.eyedb.EnumItem("ENUM_TO_INT32", 44, 44);
    en[45] = new org.eyedb.EnumItem("ENUM_TO_INT64", 45, 45);
    en[46] = new org.eyedb.EnumItem("ENUM_TO_FLOAT", 46, 46);
    en[47] = new org.eyedb.EnumItem("ENUM_TO_CHAR", 47, 47);
    en[48] = new org.eyedb.EnumItem("ENUM_TO_BYTE", 48, 48);
    en[49] = new org.eyedb.EnumItem("CHAR_TO_STRING", 49, 49);
    en[50] = new org.eyedb.EnumItem("STRING_TO_CHAR", 50, 50);
    en[51] = new org.eyedb.EnumItem("INT16_TO_STRING", 51, 51);
    en[52] = new org.eyedb.EnumItem("STRING_TO_INT16", 52, 52);
    en[53] = new org.eyedb.EnumItem("INT32_TO_STRING", 53, 53);
    en[54] = new org.eyedb.EnumItem("STRING_TO_INT32", 54, 54);
    en[55] = new org.eyedb.EnumItem("INT64_TO_STRING", 55, 55);
    en[56] = new org.eyedb.EnumItem("STRING_TO_INT64", 56, 56);
    en[57] = new org.eyedb.EnumItem("FLOAT_TO_STRING", 57, 57);
    en[58] = new org.eyedb.EnumItem("STRING_TO_FLOAT", 58, 58);
    en[59] = new org.eyedb.EnumItem("BYTE_TO_STRING", 59, 59);
    en[60] = new org.eyedb.EnumItem("STRING_TO_BYTE", 60, 60);
    en[61] = new org.eyedb.EnumItem("SET_TO_BAG", 61, 61);
    en[62] = new org.eyedb.EnumItem("SET_TO_ARRAY", 62, 62);
    en[63] = new org.eyedb.EnumItem("SET_TO_LIST", 63, 63);
    en[64] = new org.eyedb.EnumItem("BAG_TO_SET", 64, 64);
    en[65] = new org.eyedb.EnumItem("BAG_TO_ARRAY", 65, 65);
    en[66] = new org.eyedb.EnumItem("BAG_TO_LIST", 66, 66);
    en[67] = new org.eyedb.EnumItem("ARRAY_TO_BAG", 67, 67);
    en[68] = new org.eyedb.EnumItem("ARRAY_TO_SET", 68, 68);
    en[69] = new org.eyedb.EnumItem("ARRAY_TO_LIST", 69, 69);
    en[70] = new org.eyedb.EnumItem("LIST_TO_BAG", 70, 70);
    en[71] = new org.eyedb.EnumItem("LIST_TO_ARRAY", 71, 71);
    en[72] = new org.eyedb.EnumItem("LIST_TO_SET", 72, 72);
    en[73] = new org.eyedb.EnumItem("CLASS_TO_CLASS", 73, 73);
    en[74] = new org.eyedb.EnumItem("USER_CNV", 74, 74);
    en[75] = new org.eyedb.EnumItem("NIL_CNV", 75, 75);

    AttributeConvertType_class.setEnumItems(en);

    return AttributeConvertType_class;
  }

  static void init_p()
  {
    idbclass = make(null, null);
  }

  static void init()
  {
    make((org.eyedb.EnumClass)idbclass, null);
  }
  public static org.eyedb.Class idbclass;
}

