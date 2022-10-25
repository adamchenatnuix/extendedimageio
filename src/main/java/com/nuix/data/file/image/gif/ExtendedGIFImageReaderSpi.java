package com.nuix.data.file.image.gif;

import com.sun.imageio.plugins.gif.GIFImageReaderSpi;

import javax.imageio.ImageReader;
import java.util.Locale;

/**
 * GIF image reader service provider interface with fix for https://bugs.openjdk.org/browse/JDK-7132728.
 */
public class ExtendedGIFImageReaderSpi extends GIFImageReaderSpi {
    @Override
    public String getDescription(Locale locale) {
        return "Extended GIF image reader";
    }

    @Override
    public ImageReader createReaderInstance(Object extension) {
        return new ExtendedGIFImageReader(this);
    }

}
