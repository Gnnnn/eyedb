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

public class ArgType_Type extends org.eyedb.Enum {

  ArgType_Type(org.eyedb.Database db)
  {
    super(db);
  }

  ArgType_Type()
  {
    super();
  }

  public static final int ANY_TYPE = 0;
  public static final int VOID_TYPE = 1;
  public static final int INT16_TYPE = 2;
  public static final int INT32_TYPE = 3;
  public static final int INT64_TYPE = 4;
  public static final int STRING_TYPE = 5;
  public static final int CHAR_TYPE = 6;
  public static final int FLOAT_TYPE = 7;
  public static final int OID_TYPE = 8;
  public static final int OBJ_TYPE = 9;
  public static final int RAW_TYPE = 10;
  public static final int BYTE_TYPE = 11;
  public static final int ARRAY_TYPE = 256;
  public static final int IN_ARG_TYPE = 4096;
  public static final int OUT_ARG_TYPE = 8192;
  public static final int INOUT_ARG_TYPE = 12288;

  static org.eyedb.EnumClass make(org.eyedb.EnumClass ArgType_Type_class, org.eyedb.Schema m)
  {
    if (ArgType_Type_class == null)
      return new org.eyedb.EnumClass("argtype_type");

    org.eyedb.EnumItem[] en = new org.eyedb.EnumItem[16];
    en[0] = new org.eyedb.EnumItem("ANY_TYPE", 0, 0);
    en[1] = new org.eyedb.EnumItem("VOID_TYPE", 1, 1);
    en[2] = new org.eyedb.EnumItem("INT16_TYPE", 2, 2);
    en[3] = new org.eyedb.EnumItem("INT32_TYPE", 3, 3);
    en[4] = new org.eyedb.EnumItem("INT64_TYPE", 4, 4);
    en[5] = new org.eyedb.EnumItem("STRING_TYPE", 5, 5);
    en[6] = new org.eyedb.EnumItem("CHAR_TYPE", 6, 6);
    en[7] = new org.eyedb.EnumItem("FLOAT_TYPE", 7, 7);
    en[8] = new org.eyedb.EnumItem("OID_TYPE", 8, 8);
    en[9] = new org.eyedb.EnumItem("OBJ_TYPE", 9, 9);
    en[10] = new org.eyedb.EnumItem("RAW_TYPE", 10, 10);
    en[11] = new org.eyedb.EnumItem("BYTE_TYPE", 11, 11);
    en[12] = new org.eyedb.EnumItem("ARRAY_TYPE", 256, 12);
    en[13] = new org.eyedb.EnumItem("IN_ARG_TYPE", 4096, 13);
    en[14] = new org.eyedb.EnumItem("OUT_ARG_TYPE", 8192, 14);
    en[15] = new org.eyedb.EnumItem("INOUT_ARG_TYPE", 12288, 15);

    ArgType_Type_class.setEnumItems(en);

    return ArgType_Type_class;
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

