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

package org.eyedb.utils;

import org.eyedb.*;
import org.eyedb.utils.*;
import org.eyedb.syscls.*;

public class Month extends org.eyedb.Enum {

  Month(org.eyedb.Database db)
  {
    super(db);
  }

  Month()
  {
    super();
  }

  public static final int JANUARY = 1;
  public static final int FEBRUARY = 2;
  public static final int MARCH = 3;
  public static final int APRIL = 4;
  public static final int MAY = 5;
  public static final int JUNE = 6;
  public static final int JULY = 7;
  public static final int AUGUST = 8;
  public static final int SEPTEMBER = 9;
  public static final int OCTOBER = 10;
  public static final int NOVEMBER = 11;
  public static final int DECEMBER = 12;

  static org.eyedb.EnumClass make(org.eyedb.EnumClass Month_class, org.eyedb.Schema m)
  {
    if (Month_class == null)
      return new org.eyedb.EnumClass("month");

    org.eyedb.EnumItem[] en = new org.eyedb.EnumItem[12];
    en[0] = new org.eyedb.EnumItem("JANUARY", 1, 0);
    en[1] = new org.eyedb.EnumItem("FEBRUARY", 2, 1);
    en[2] = new org.eyedb.EnumItem("MARCH", 3, 2);
    en[3] = new org.eyedb.EnumItem("APRIL", 4, 3);
    en[4] = new org.eyedb.EnumItem("MAY", 5, 4);
    en[5] = new org.eyedb.EnumItem("JUNE", 6, 5);
    en[6] = new org.eyedb.EnumItem("JULY", 7, 6);
    en[7] = new org.eyedb.EnumItem("AUGUST", 8, 7);
    en[8] = new org.eyedb.EnumItem("SEPTEMBER", 9, 8);
    en[9] = new org.eyedb.EnumItem("OCTOBER", 10, 9);
    en[10] = new org.eyedb.EnumItem("NOVEMBER", 11, 10);
    en[11] = new org.eyedb.EnumItem("DECEMBER", 12, 11);

    Month_class.setEnumItems(en);

    return Month_class;
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

