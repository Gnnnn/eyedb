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


#ifndef _EYEDB_ERROR_H
#define _EYEDB_ERROR_H

namespace eyedb {

  /**
     @addtogroup eyedb
     @{
  */

  typedef enum {
    IDB_SUCCESS      = eyedbsm::SUCCESS,
    IDB_ERROR        = eyedbsm::N_ERROR,
    IDB_FATAL_ERROR,
    IDB_NOT_YET_IMPLEMENTED,
    IDB_INTERNAL_ERROR,
    IDB_EXIT_CALLED,
    IDB_INTERNAL_BUG,
    IDB_CONNECTION_FAILURE,
    IDB_SERVER_FAILURE,
    IDB_SM_ERROR,
    IDB_INVALID_DBOPEN_FLAG,
    IDB_INVALID_DB_ID,
    IDB_INVALID_CLIENT_ID,
    IDB_INVALID_SCHEMA,
    IDB_INVALID_OBJECT_HEADER,
    IDB_INVALID_TRANSACTION,
    IDB_INVALID_TRANSACTION_MODE,
    IDB_INVALID_TRANSACTION_WRITE_MODE,
    IDB_INVALID_TRANSACTION_PARAMS,
    IDB_AUTHENTICATION_NOT_SET,
    IDB_AUTHENTICATION_FAILED,
    IDB_INSUFFICIENT_PRIVILEGES,
    IDB_NO_CURRENT_TRANSACTION,
    IDB_TRANSACTION_COMMIT_UNEXPECTED,
    IDB_TRANSACTION_ABORT_UNEXPECTED,
    IDB_ADD_USER_ERROR,
    IDB_DELETE_USER_ERROR,
    IDB_SET_USER_PASSWD_ERROR,
    IDB_SET_PASSWD_ERROR,
    IDB_SET_USER_DBACCESS_ERROR,
    IDB_SET_DEFAULT_DBACCESS_ERROR,
    IDB_SET_USER_SYSACCESS_ERROR,
    IDB_SETDATABASE_ERROR,
    IDB_OBJECT_REMOVE_ERROR,
    IDB_IS_OBJECT_OF_CLASS_ERROR,
    IDB_ITERATOR_ERROR,
    IDB_DBM_ERROR,
    IDB_SCHEMA_ERROR,
    IDB_DATABASE_OPEN_ERROR,
    IDB_DATABASE_CLOSE_ERROR,
    IDB_DATABASE_CREATE_ERROR,
    IDB_DATABASE_REMOVE_ERROR,
    IDB_DATABASE_COPY_ERROR,
    IDB_DATABASE_MOVE_ERROR,
    IDB_DATABASE_RENAME_ERROR,
    IDB_DATABASE_LOAD_OBJECT_ERROR,
    IDB_DATABASE_GET_OBJECT_CLASS_ERROR,
    IDB_INCONSISTANT_OBJECT_HEADERS,
    IDB_CANNOT_CREATE_SCHEMA,
    IDB_CANNOT_UPDATE_SCHEMA,
    IDB_SCHEMA_ALREADY_CREATED,
    IDB_OBJECT_ALREADY_CREATED,
    IDB_OBJECT_NOT_CREATED,
    IDB_OUT_OF_MEMORY,
    IDB_BACKEND_INTERRUPTED,
    IDB_ITERATOR_ATTRIBUTE_NO_IDX,
    IDB_ITERATOR_ATTRIBUTE_INVALID_SIZE,
    IDB_ITERATOR_ATTRIBUTE_INVALID_INDICE,
    IDB_OQL_SYNTAX_ERROR,
    IDB_OQL_ERROR,
    IDB_OQL_INTERRUPTED,
    IDB_CLASS_READ,
    IDB_ATTRIBUTE_ERROR,
    IDB_ATTRIBUTE_INVERSE_ERROR,
    IDB_OUT_OF_RANGE_ATTRIBUTE_ERROR,
    IDB_MAG_ORDER_ERROR,
    IDB_ENUM_ERROR,
    IDB_NO_CLASS,
    IDB_CLASS_NOT_CREATED,
    IDB_CLASS_NOT_FOUND,
    IDB_INDEX_ERROR,
    IDB_COLLECTION_ERROR,
    IDB_COLLECTION_INSERT_ERROR,
    IDB_COLLECTION_DUPLICATE_INSERT_ERROR,
    IDB_COLLECTION_SUPPRESS_ERROR,
    IDB_COLLECTION_IS_IN_ERROR,
    IDB_COLLECTION_ITEM_SIZE_TOO_LARGE,
    IDB_COLLECTION_ITEM_SIZE_UNKNOWN,
    IDB_COLLECTION_BACK_END_ERROR,
    IDB_COLLECTION_LOCKED,
    IDB_CLASS_COMPLETION_ERROR,
    IDB_GENERATION_CODE_ERROR,
    IDB_EXECUTABLE_ERROR,
    IDB_UNIQUE_CONSTRAINT_ERROR,
    IDB_UNIQUE_COMP_CONSTRAINT_ERROR,
    IDB_NOTNULL_CONSTRAINT_ERROR,
    IDB_NOTNULL_COMP_CONSTRAINT_ERROR,
    IDB_CARDINALITY_CONSTRAINT_ERROR,
    IDB_SESSION_LOG_CREATION_ERROR,
    IDB_SESSION_LOG_OPEN_ERROR,
    IDB_SESSION_LOG_NO_SPACE_LEFT,
    IDB_N_ERROR
  } Error;

  /**
     @}
  */

}

#endif
