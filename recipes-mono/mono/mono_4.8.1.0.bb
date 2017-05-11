require mono-4.xx.inc
require ${PN}-base.inc
require mono-${PV}.inc

PACKAGES += "${PN}-profiler "
FILES_${PN}-profiler += " ${datadir}/mono-2.0/mono/profiler/*"
FILES_${PN}-xbuild   += " ${libdir}/mono/xbuild-frameworks/.NETPortable ${libdir}/mono/xbuild-frameworks/.NETPortable/* "

LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=ae84b2673a35b6ff7fd3507379f9b5e5"

CFLAGS_append = " -DARM_FPU_VFP_HARD=1"