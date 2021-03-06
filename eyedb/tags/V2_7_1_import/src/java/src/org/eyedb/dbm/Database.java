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

    if ((cl = m.getClass("system_access_mode")) == null)
      msg += "class 'system_access_mode' does not exist\n";
    else if (!SysAccessMode.idbclass.compare(cl))
      msg += "class 'system_access_mode' differs in database and in runtime environment\n";
    if ((cl = m.getClass("database_access_mode")) == null)
      msg += "class 'database_access_mode' does not exist\n";
    else if (!DBAccessMode.idbclass.compare(cl))
      msg += "class 'database_access_mode' differs in database and in runtime environment\n";
    if ((cl = m.getClass("user_type")) == null)
      msg += "class 'user_type' does not exist\n";
    else if (!UserType.idbclass.compare(cl))
      msg += "class 'user_type' differs in database and in runtime environment\n";
    if ((cl = m.getClass("user_entry")) == null)
      msg += "class 'user_entry' does not exist\n";
    else if (!UserEntry.idbclass.compare(cl))
      msg += "class 'user_entry' differs in database and in runtime environment\n";
    if ((cl = m.getClass("database_user_access")) == null)
      msg += "class 'database_user_access' does not exist\n";
    else if (!DBUserAccess.idbclass.compare(cl))
      msg += "class 'database_user_access' differs in database and in runtime environment\n";
    if ((cl = m.getClass("system_user_access")) == null)
      msg += "class 'system_user_access' does not exist\n";
    else if (!SysUserAccess.idbclass.compare(cl))
      msg += "class 'system_user_access' differs in database and in runtime environment\n";
    if ((cl = m.getClass("database_entry")) == null)
      msg += "class 'database_entry' does not exist\n";
    else if (!DBEntry.idbclass.compare(cl))
      msg += "class 'database_entry' differs in database and in runtime environment\n";
    if ((cl = m.getClass("database_property_value")) == null)
      msg += "class 'database_property_value' does not exist\n";
    else if (!DBPropertyValue.idbclass.compare(cl))
      msg += "class 'database_property_value' differs in database and in runtime environment\n";
    if ((cl = m.getClass("database_property")) == null)
      msg += "class 'database_property' does not exist\n";
    else if (!DBProperty.idbclass.compare(cl))
      msg += "class 'database_property' differs in database and in runtime environment\n";
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
    SysAccessMode.init_p();
    DBAccessMode.init_p();
    UserType.init_p();
    Root.init_p();
    UserEntry.init_p();
    DBUserAccess.init_p();
    SysUserAccess.init_p();
    DBEntry.init_p();
    DBPropertyValue.init_p();
    DBProperty.init_p();
    SysAccessMode.init();
    DBAccessMode.init();
    UserType.init();
    Root.init();
    UserEntry.init();
    DBUserAccess.init();
    SysUserAccess.init();
    DBEntry.init();
    DBPropertyValue.init();
    DBProperty.init();
  }
}

