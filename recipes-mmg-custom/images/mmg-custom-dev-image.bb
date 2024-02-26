require mmg-custom-image.bb

SUMMARY = "MMG Development Image"

LICENSE = "GPLv3"

IMAGE_FEATURES += " tools-debug debug-tweaks"

IMAGE_INSTALL += " \
	mmg-custom-packagegroup-testapps"\
"
