DESCRIPTION = "MMG test application packagegroup"
SUMMARY = "MMG packagegroup - tools/testapps"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    evtest \
	fbset \
	i2c-tools \
	memtester \
	sudo \
"
