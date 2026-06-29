package game.tile;

import java.awt.image.BufferedImage;

/**
 * Merepresentasikan satu jenis tile dalam game.
 *
 * Contoh:
 * - Ground
 * - Brick
 * - Pipe
 * - Cloud
 */
public class Tile {

    // ==========================================
    // ATTRIBUTE
    // ==========================================

    /**
     * Gambar tile.
     */
    private BufferedImage image;

    /**
     * Apakah tile dapat ditabrak.
     */
    private boolean collision;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public Tile() {

    }

    // ==========================================
    // GETTER
    // ==========================================

    public BufferedImage getImage() {
        return image;
    }

    public boolean isCollision() {
        return collision;
    }

    // ==========================================
    // SETTER
    // ==========================================

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void setCollision(boolean collision) {
        this.collision = collision;
    }

}