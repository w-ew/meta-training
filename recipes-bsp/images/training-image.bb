SUMMARY = "A small image for the NXP i.MX6UL Training."

IMAGE_FEATURES = "debug-tweaks ssh-server-openssh"

IMAGE_INSTALL = " \
	packagegroup-core-boot \
	${ROOTFS_PKGMANAGE_BOOTSTRAP} \
	${CORE_IMAGE_EXTRA_INSTALL} \
	packagegroup-core-eclipse-debug \
	udev-extraconf \
	sthttpd \
	opus-tools \
	nodejs \
	nano \
	alsa-utils \
	vorbis-tools \
	"



IMAGE_LINGUAS = " "

LICENSE = "MIT"

IMAGE_FSTYPES = "ext3 tar.gz cpio.gz.u-boot"
IMAGE_CLASSES = "image_types_uboot"


inherit core-image

IMAGE_ROOTFS_SIZE ?= "65536"

