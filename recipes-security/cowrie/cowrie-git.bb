SECTION = "core"
DESCRIPTION = "Cowrie"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://doc/COPYRIGHT;md5=f1539f56d0444ffa4b87437081654b15"

SRC_URI = " \
    git://github.com/micheloosterhof/cowrie;protocol=git;branch=master \
    "

SRCREV = "61ec8dde1f12d46d84285bb378ac2a7e8918c5d5"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "\
  python \
  python-twisted \
  python-zopeinterface \
  python-pyasn1 \
  python-pycrypto \
  python-gmpy2 \
  python-modules \
  python-stringold \
  python-pyopenssl \
  "

do_install() {
    mkdir -p ${D}${datadir}/cowrie/
    cp -r ${S}/* ${D}${datadir}/cowrie/
    rm -rf ${D}${datadir}/cowrie/.git/

    mkdir -p ${D}${bindir}
    ln -s /opt/cowrie/start.sh ${D}${bindir}/cowrie-start
    ln -s /opt/cowrie/stop.sh ${D}${bindir}/cowrie-stop
}

FILES_${PN} += "/usr/share/cowrie/*"
