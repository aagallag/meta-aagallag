SUMMARY = "GMP/MPIR, MPFR, and MPC interface to Python 2.6+ and 3.x"
HOMEPAGE = "http://code.google.com/p/gmpy/"

DEPENDS = "python libmpc"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " \
  https://pypi.python.org/packages/source/g/gmpy2/gmpy2-2.0.7.zip \
  "

SRC_URI[md5sum] = "b5aada3ee5afb316ea94604f45192054"
SRC_URI[sha256sum] = "7ee694b8a4c3854f27890676aa8a509a2e3f8dbdd0916fa94cbed612420b9c86"

S = "${WORKDIR}/gmpy2-2.0.7"

inherit setuptools

BBCLASSEXTEND = "native"
