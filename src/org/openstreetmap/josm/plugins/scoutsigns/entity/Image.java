package org.openstreetmap.josm.plugins.scoutsigns.entity;


/**
 * Defines the image business entity.
 *
 * @author Beata
 * @version $Revision: 137 $
 */
public class Image {

    private final int width;
    private final int height;
    private final String data;


    /**
     * Builds a new object with the given arguments.
     *
     * @param width the width of the image in pixels
     * @param height the height of the image in pixels
     * @param data the binary data of the image, encoded as a BASE64 text
     */
    public Image(final int width, final int height, final String data) {
        this.width = width;
        this.height = height;
        this.data = data;
    }


    public String getData() {
        return data;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}