SUMMARY = "the blessed package to manage your versions by scm tags"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"
I_SWEAR_TO_MIGRATE_TO_PYTHON3 = "yes"

SRC_URI[md5sum] = "50b2199082fe808d032ec1710c9d7415"
SRC_URI[sha256sum] = "bd25e1fb5e4d603dcf490f1fde40fb4c595b357795674c3e5cb7f6217ab39ea5"

PYPI_PACKAGE = "setuptools_scm"

inherit pypi setuptools

RDEPENDS_${PN}_class-target = "${PYTHON_PN}-py ${PYTHON_PN}-setuptools ${PYTHON_PN}-debugger ${PYTHON_PN}-json"
RDEPENDS_${PN}_class-native = "${PYTHON_PN}-setuptools-native"

RDEPENDS_${PN} += "${PYTHON_PN}-argparse"

BBCLASSEXTEND = "native"
