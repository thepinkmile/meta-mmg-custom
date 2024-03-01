do_configure:append() {
    # Remove exisiting fdtfile, if there is one
    sed -i '/"fdtfile=.*\\0" \\/d' ${S}/include/configs/verdin-imx8mp.h
    # Add new fdtfile, "my-custom-devicetree.dtb" should be replaced with your device tree binary file
    sed -i 's/\("fdt_board=.*\\0" \\\)/\0\n      "fdtfile=imx8mp-verdin-mmg-custom.dtb\\0" \\/' ${S}/include/configs/verdin-imx8mp.h
}