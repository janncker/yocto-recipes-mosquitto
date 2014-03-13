SUMMARY = "Open source MQTT v3.1 implemention"
DESCRIPTION = "Mosquitto is an open source (BSD licensed) message broker that implements the MQ Telemetry Transport protocol version 3.1. MQTT provides a lightweight method of carrying out messaging using a publish/subscribe model. "
HOMEPAGE = "http://mosquitto.org/"
SECTION = "console/network"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=89aa5ea5f32e4260d84c5d185ee3add4"

SRC_URI = "http://mosquitto.org/files/source/mosquitto-1.2.3.tar.gz"
SRC_URI += "file://disable_memory_tracking.patch"

SRC_URI[md5sum] = "0874beeff51b3c64d4a7b2d5f9498288"
SRC_URI[sha256sum] = "79b0c498b21294e310a2f88f28882f3633920245ff80f38d6879adfe9548580f"

PV = "1.2.3"
PN = "mosquitto"

inherit autotools

PACKAGES = "${PN} ${PN}-clients ${PN}-doc ${PN}-dev"

FILES_${PN} = "${sbindir}/mosquitto ${sysconfdir}"

FILES_${PN}-clients = "${bindir}/mosquitto_pub \
                       ${bindir}/mosquitto_sub \
                       ${libdir}/libmosquitto.so.1"

FILES_${PN}-doc = "${docdir} ${mandir}"

FILES_${PN}-dev = "${includedir} ${libdir}/lib*.so"
