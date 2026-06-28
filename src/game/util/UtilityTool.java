package game.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public final class UtilityTool {

    private UtilityTool() {
    }

    /**
     * Membaca gambar dari folder assets.
     *
     * @param path lokasi file
     * @return BufferedImage
     */
    public static BufferedImage loadImage(String path) {

        try {

            return ImageIO.read(new File(path));

        } catch (IOException e) {

            throw new RuntimeException(

                    "Gagal membaca gambar : " + path,

                    e);

        }

    }

}