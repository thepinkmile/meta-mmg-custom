FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# Prevent the use of in-tree defconfig
unset KBUILD_DEFCONFIG

CUSTOM_DEVICETREE = "imx8mp-verdin-mmg-custom.dts"
CUSTOM_DEVICETREE_INCLUDE = "imx8mp-verdin-mmg-custom.dtsi"

SRC_URI += " \
    file://${CUSTOM_DEVICETREE} \
    file://${CUSTOM_DEVICETREE_INCLUDE} \
    "

do_configure:append() {
    # For arm32 bit freescale/NXP devices
    # cp ${WORKDIR}/${CUSTOM_DEVICETREE} ${S}/arch/arm/boot/dts/freescale
    # cp ${WORKDIR}/${CUSTOM_DEVICETREE_INCLUDE} ${S}/arch/arm/boot/dts/freescale
    # For arm64 bit freescale/NXP devices
    cp ${WORKDIR}/${CUSTOM_DEVICETREE} ${S}/arch/arm64/boot/dts/freescale
    cp ${WORKDIR}/${CUSTOM_DEVICETREE_INCLUDE} ${S}/arch/arm64/boot/dts/freescale
}
