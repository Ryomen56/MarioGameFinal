package game.util;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Utility untuk membaca dan mengolah gambar.
 */
public final class UtilityTool {

    private UtilityTool() {
    }

    // ==========================================
    // LOAD IMAGE
    // ==========================================

    public static BufferedImage loadImage(String path) {

        try {

            return ImageIO.read(new File(path));

        } catch (IOException e) {

            throw new RuntimeException(
                    "Gagal membaca gambar : " + path);
        }

    }

    // ==========================================
    // SCALE IMAGE
    // ==========================================

    public static BufferedImage scaleImage(
            BufferedImage original,
            int width,
            int height) {

        BufferedImage scaledImage =
                new BufferedImage(
                        width,
                        height,
                        BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2 = scaledImage.createGraphics();

        g2.setRenderingHint(
                RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);

        g2.drawImage(
                original,
                0,
                0,
                width,
                height,
                null);

        g2.dispose();

        return scaledImage;

    }

}