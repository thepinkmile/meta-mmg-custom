SUMMARY = "MMG Development Image"

LICENSE = "GPLv3"

inherit tdx-reference-minimal-image
require mmg-custom-image.bb

IMAGE_FEATURES += " tools-debug debug-tweaks"

CORE_IMAGE_EXTRA_INSTALL = "mmg-custom-packagegroup-testapps"
