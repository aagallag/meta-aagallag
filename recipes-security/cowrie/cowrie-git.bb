SECTION = "core"
DESCRIPTION = "Cowrie"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://doc/COPYRIGHT;md5=f1539f56d0444ffa4b87437081654b15"

SRC_URI = " \
    git://github.com/micheloosterhof/cowrie;protocol=git;branch=master \
    file://cowrie.sh \
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
    # Copy cowrie to the target datadir
    mkdir -p ${D}${datadir}/cowrie/
    cp -r ${S}/* ${D}${datadir}/cowrie/
    rm -rf ${D}${datadir}/cowrie/.git/

    # Copy startup script to same folder
    cp ${S}/../start.sh ${D}${datadir}/cowrie/

    # Create link to startup script
    mkdir -p ${D}${bindir}
    ln -s /opt/cowrie/cowrie.sh ${D}${bindir}/cowrie
}

FILES_${PN} += "/usr/share/cowrie/*"
