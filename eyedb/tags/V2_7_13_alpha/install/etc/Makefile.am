pkgdata_DATA= eyedb.conf.sample eyedbd.conf.sample Access.sample

EDIT = sed \
        -e 's,@bindir\@,$(bindir),g' \
        -e 's,@exec_prefix\@,$(exec_prefix),g' \
        -e 's,@datadir\@,$(pkgdatadir),g' \
        -e 's,@libdir\@,$(libdir),g' \
        -e 's,@localstatedir\@,$(localstatedir),g' \
        -e 's,@prefix\@,$(prefix),g' \
        -e 's,@sysconfdir\@,$(sysconfdir),g'

eyedb.conf.sample: Makefile $(srcdir)/eyedb.conf.sample.in
eyedbd.conf.sample: Makefile $(srcdir)/eyedbd.conf.sample.in

%.conf.sample: Makefile $(srcdir)/%.conf.sample.in
	rm -f $*.conf.sample $*.conf.sample.tmp
	$(EDIT) $(srcdir)/$*.conf.sample.in >$*.conf.sample.tmp
	mv $*.conf.sample.tmp $*.conf.sample

EXTRA_DIST=eyedb.conf.sample.in eyedbd.conf.sample.in Access.sample
