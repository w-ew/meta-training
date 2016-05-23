# libvorbis implies libogg

DEPENDS = "libvorbis"

# we only need oggenc
PACKAGECONFIG = "oggenc"

# specify build arguments for sub-features
PACKAGECONFIG[ogg123] = ",--disable-ogg123,libao curl,libao curl"
PACKAGECONFIG[oggdec] = ",--disable-oggdec"
PACKAGECONFIG[oggenc] = ",--disable-oggenc"
PACKAGECONFIG[ogginfo] = ",--disable-ogginfo"
PACKAGECONFIG[vcut] = ",--disable-vcut"
PACKAGECONFIG[vorbiscomment] = ",--disable-vorbiscomment"
