SUBDIRS=old

bin_PROGRAMS= \
eyedbadmin

# The last directory is needed for endian.h, which is generated by configure.in
INCLUDES=-I$(top_srcdir)/src -I$(top_srcdir)/src/eyedb -I$(top_srcdir)/include -I$(top_builddir)/include

EYEDBCLLIBS=$(top_builddir)/src/eyedb/libeyedb.la $(top_builddir)/src/lib/libeyedbrpcfe.la $(top_builddir)/src/eyedbsm/libeyedbsm.la $(top_builddir)/src/lib/libeyedbutils.la

eyedbadmin_SOURCES=\
eyedbadmin.cc \
Topic.cc \
DBSTopic.cc \
DTFTopic.cc \
DSPTopic.cc \
USRTopic.cc \
IDXTopic.cc \
CLSTopic.cc \
COLTopic.cc \
ATRTopic.cc \
OBJTopic.cc \
CNSTopic.cc \
DatafileStats.cc \
DatabaseExportImport.cc 

eyedbadmin_LDADD= $(EYEDBCLLIBS)

noinst_HEADERS= \
Command.h \
Const.h \
DBSTopic.h \
DSPTopic.h \
DTFTopic.h \
USRTopic.h \
IDXTopic.h \
CLSTopic.h \
COLTopic.h \
ATRTopic.h \
OBJTopic.h \
CNSTopic.h \
Topic.h \
DatafileStats.h \
DatabaseExportImport.h 

EYEDBADMIN_LINKS= \
 eyedb_dbcreate \
 eyedb_dbdelete \
 eyedb_dblist \
 eyedb_dbrename \
 eyedb_dbexport \
 eyedb_dbimport \
 eyedb_dtfcreate \
 eyedb_dtfdelete \
 eyedb_dtflist \
 eyedb_dspcreate \
 eyedb_dspdelete \
 eyedb_dsplist \
 eyedb_useradd \
 eyedb_userdelete \
 eyedb_userlist \
 eyedb_userpasswd 

install-exec-hook:
	cd $(DESTDIR)$(bindir) ; \
	for f in $(EYEDBADMIN_LINKS) ; do \
		if [ -L $$f ] ; then rm $$f ; fi ; \
		if [ ! -f $$f ] ; then ln -s eyedbadmin $$f ; fi ; \
	done
