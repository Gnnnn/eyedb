eyedbexamplesdir=$(datadir)/doc/$(PACKAGE)-$(VERSION)/examples/C++Binding/schema-oriented/store
dist_eyedbexamples_DATA=store.cc
eyedbexamples_DATA=Makefile.eyedb-examples

check_PROGRAMS= store

EYEDBSVLIBS=$(top_builddir)/src/eyedb/libeyedb.la $(top_builddir)/src/lib/libeyedbrpcbe.la $(top_builddir)/src/lib/libeyedbrpcfe.la $(top_builddir)/src/eyedbsm/libeyedbsm.la $(top_builddir)/src/lib/libeyedbutils.la 


store_SOURCES= store.cc 
store_LDADD= $(EYEDBSVLIBS) $(top_builddir)/examples/C++Binding/schema-oriented/share/libperson.la

# The last directory is needed for endian.h, which is generated by configure.in
INCLUDES=-I$(top_srcdir)/src -I$(top_srcdir)/include -I$(top_builddir)/include -I$(top_builddir)/examples/C++Binding/schema-oriented/share
