
/*
 * EyeDB Version 2.8.8 Copyright (c) 1995-2006 SYSRA
 *
 * File 'sysclsmthfe-skel.cc'
 *
 * Package Name 'syscls'
 *
 * Generated by eyedbodl at Mon Apr 12 16:51:37 2010
 *
 */

#include <eyedb/eyedb.h>

#include "syscls.h"

using namespace eyedb;

// To implement and use user methods, perform the following operations
/*

#1. Copy the skeleton file
cp sysclsmthfe-skel.cc sysclsmthfe.cc

#2. Implement the user methods in sysclsmthfe.cc using a text editor

#3. Compile the shared library

#4. Copy the shared library to the eyedb loadable library directory
cp sysclsmthfe-2.8.8.so <eyedbinstalldir>/lib/eyedb

#5. Change the file access mode
chmod a+r <eyedbinstalldir>/lib/eyedb/sysclsmthfe-2.8.8.so

*/

static Bool __syscls_init = False;

#define _packageInit(DB) \
 \
  if (!__syscls_init) { \
    syscls::init(); \
    __syscls_init = True; \
  } \
 \
  if (!(DB)->getUserData("eyedb:syscls")) { \
     Status s = sysclsDatabase::checkSchema((DB)->getSchema()); \
     if (s) return s; \
     sysclsDatabase::setConsApp(DB); \
     (DB)->setUserData("eyedb:syscls", (void *)1); \
  }

