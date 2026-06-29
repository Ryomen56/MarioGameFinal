package game.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public final class UtilityTool {

    private UtilityTool() {
    }

    public static BufferedImage loadImage(String path) {

        try {

            return ImageIO.read(new File(path));

        } catch (IOException e) {

            throw new RuntimeException(

                    "Tidak dapat membaca file:\n" + path,

                    e);

        }

    }

}