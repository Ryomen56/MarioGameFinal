package game.tile;

import java.awt.image.BufferedImage;

/**
 * Menyimpan informasi setiap tile.
 */
public class Tile {

    // ==========================================
    // ATTRIBUTE
    // ==========================================

    private BufferedImage image;

    private boolean collision;

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