require tdx-reference-minimal-image.bb

SUMMARY = "MMG Production Image"

LICENSE = "GPLv3"

#Prefix to the resulting deployable tarball name
export IMAGE_BASENAME = "MMG-Image"

IMAGE_LINGUAS = "en-gb"

IMAGE_INSTALL += " \
	ethtool \
	inotify-tools"\
"
