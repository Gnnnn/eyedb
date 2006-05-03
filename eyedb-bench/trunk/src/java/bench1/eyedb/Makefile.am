EYEDB_BINDIR=@EYEDB_BINDIR@
EYEDB_LIBDIR=@EYEDB_LIBDIR@
EYEDB_JAR=@EYEDB_JAR@

EYEDBODLJAVA = $(EYEDB_BINDIR)/eyedbodl --gencode=java
EYEDBODLJAVAFLAGS= --no-rootclass --package=person

packagedir=$(pkglibdir)/java/classes/bench1/eyedb/

JAVA_ODL_FILES=$(addprefix person/, Database.java Person.java)

dist_package_JAVA =\
EyedbBench1.java \
$(JAVA_ODL_FILES)

JAVAROOT=$(top_builddir)/src/java/bench1/eyedb
CLASSPATH_ENV= CLASSPATH=$(JAVAROOT):$(top_srcdir)/src/java:$(EYEDB_JAR)

noinst_DATA=runit.sh

EDIT = sed \
	-e 's,@EYEDB_BINDIR\@,$(EYEDB_BINDIR),g' \
	-e 's,@EYEDB_LIBDIR\@,$(EYEDB_LIBDIR),g' \
	-e 's,@EYEDB_JAR\@,$(EYEDB_JAR),g' \
	-e 's,@JAVA\@,$(JAVA),g' 

$(JAVA_ODL_FILES): person.odl
	$(EYEDBODLJAVA) $(EYEDBODLJAVAFLAGS) $<

runit.sh: Makefile $(srcdir)/runit.sh.in
	rm -f $@ $@.tmp
	$(EDIT) $(srcdir)/$@.in >$@.tmp
	mv $@.tmp $@

clean-local:
	-rm -f $(JAVA_ODL_FILES)
	-rm -f person/*.class