require tdx-reference-minimal-image.bb

SUMMARY = "MMG Production Image"

#Prefix to the resulting deployable tarball name
export IMAGE_BASENAME = "MMG-Image"

IMAGE_LINGUAS = "en-gb"

IMAGE_FEATURES += " \
	ssh-server-openssh \
"

IMAGE_INSTALL += " \
	packagegroup-mmg-base \
	packagegroup-fsl-gstreamer1.0-full \
	packagegroup-base-tdx-cli \
"

# Going to use networkmanager instead of conman
IMAGE_INSTALL:remove = " ${CONMANPKGS}"

# Add NetworkManager
IMAGE_INSTALL:append = " networkmanager"
IMAGE_INSTALL:append = " modemmanager"
