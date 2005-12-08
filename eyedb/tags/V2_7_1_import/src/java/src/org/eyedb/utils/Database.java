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

public class Database extends org.eyedb.Database {

  public Database(String name) {super(name);}

  public Database(String name, String dbmfile) {super(name, dbmfile);}

  public Database(int dbid) {super(dbid);}

  public Database(int dbid, String dbmfile) {super(dbid, dbmfile);}

  public void open(org.eyedb.Connection conn, int flags, String userauth, String passwdauth) throws org.eyedb.Exception
  {
    super.open(conn, flags, userauth, passwdauth);

    checkSchema(getSchema());
  }

  public org.eyedb.Object loadObjectRealize(org.eyedb.Oid oid, int lockmode, org.eyedb.RecMode rcm)
  throws org.eyedb.Exception
  {
    org.eyedb.Object o = super.loadObjectRealize(oid, lockmode, rcm);
    org.eyedb.Object ro = makeObject(o, true);
    if (ro != null) o = ro;
    return o;
  }

  private void checkSchema(org.eyedb.Schema m) throws org.eyedb.Exception {
    org.eyedb.Class cl;
    String msg = "";

    if ((cl = m.getClass("image_type")) == null)
      msg += "class 'image_type' does not exist\n";
    else if (!ImageType.idbclass.compare(cl))
      msg += "class 'image_type' differs in database and in runtime environment\n";
    if ((cl = m.getClass("month")) == null)
      msg += "class 'month' does not exist\n";
    else if (!Month.idbclass.compare(cl))
      msg += "class 'month' differs in database and in runtime environment\n";
    if ((cl = m.getClass("weekday")) == null)
      msg += "class 'weekday' does not exist\n";
    else if (!Weekday.idbclass.compare(cl))
      msg += "class 'weekday' differs in database and in runtime environment\n";
    if ((cl = m.getClass("image")) == null)
      msg += "class 'image' does not exist\n";
    else if (!Image.idbclass.compare(cl))
      msg += "class 'image' differs in database and in runtime environment\n";
    if ((cl = m.getClass("URL")) == null)
      msg += "class 'URL' does not exist\n";
    else if (!URL.idbclass.compare(cl))
      msg += "class 'URL' differs in database and in runtime environment\n";
    if ((cl = m.getClass("w_config")) == null)
      msg += "class 'w_config' does not exist\n";
    else if (!WConfig.idbclass.compare(cl))
      msg += "class 'w_config' differs in database and in runtime environment\n";
    if ((cl = m.getClass("date")) == null)
      msg += "class 'date' does not exist\n";
    else if (!Date.idbclass.compare(cl))
      msg += "class 'date' differs in database and in runtime environment\n";
    if ((cl = m.getClass("time")) == null)
      msg += "class 'time' does not exist\n";
    else if (!Time.idbclass.compare(cl))
      msg += "class 'time' differs in database and in runtime environment\n";
    if ((cl = m.getClass("time_stamp")) == null)
      msg += "class 'time_stamp' does not exist\n";
    else if (!TimeStamp.idbclass.compare(cl))
      msg += "class 'time_stamp' differs in database and in runtime environment\n";
    if ((cl = m.getClass("time_interval")) == null)
      msg += "class 'time_interval' does not exist\n";
    else if (!TimeInterval.idbclass.compare(cl))
      msg += "class 'time_interval' differs in database and in runtime environment\n";
    if ((cl = m.getClass("ostring")) == null)
      msg += "class 'ostring' does not exist\n";
    else if (!OString.idbclass.compare(cl))
      msg += "class 'ostring' differs in database and in runtime environment\n";
    if (!msg.equals("")) throw new org.eyedb.Exception(new org.eyedb.Status(org.eyedb.Status.IDB_ERROR, msg));
  }

  static public org.eyedb.Object makeObject(org.eyedb.Object o, boolean share)
  throws org.eyedb.Exception {

    if (o == null || o.getClass(true) == null) return o;

    if (o.isGRTObject()) return o;

    try {
      java.lang.reflect.Constructor cons = (java.lang.reflect.Constructor)hash.get(o.getClass(true).getName());
      if (cons == null) return o;

      java.lang.Object[] tmp = new java.lang.Object[2]; tmp[0] = o; tmp[1] = new java.lang.Boolean(share);
      return (org.eyedb.Object)cons.newInstance(tmp);
    } catch(java.lang.Exception e) {
      System.err.println("caught " + e + " in database");
      System.exit(2);
      return null;
    }
  }

  static java.util.Hashtable hash = new java.util.Hashtable(256);
  static protected java.lang.Class[] clazz;
  static {
    clazz = new java.lang.Class[2];
    clazz[0] = org.eyedb.Struct.class;
    clazz[1] = boolean.class;
  }

  public static void init()
 throws org.eyedb.Exception {
    ImageType.init_p();
    Month.init_p();
    Weekday.init_p();
    Root.init_p();
    Image.init_p();
    URL.init_p();
    WConfig.init_p();
    Date.init_p();
    Time.init_p();
    TimeStamp.init_p();
    TimeInterval.init_p();
    OString.init_p();
    ImageType.init();
    Month.init();
    Weekday.init();
    Root.init();
    Image.init();
    URL.init();
    WConfig.init();
    Date.init();
    Time.init();
    TimeStamp.init();
    TimeInterval.init();
    OString.init();
  }
}

