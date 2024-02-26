require mmg-custom-image.bb

SUMMARY = "MMG Development Image"

IMAGE_FEATURES += " tools-debug debug-tweaks"

IMAGE_INSTALL += " \
	packagegroup-mmg-testapps \
	packagegroup-devel-tdx-cli \
"
