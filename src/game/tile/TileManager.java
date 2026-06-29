package game.tile;

import java.awt.Graphics;

import game.config.GameConfig;
import game.panel.GamePanel;
import game.util.AssetManager;

/**
 * Bertugas menggambar seluruh tile ke layar.
 */
public class TileManager {

    // ==========================================
    // ATTRIBUTE
    // ==========================================

    private final GamePanel gamePanel;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public TileManager(GamePanel gamePanel) {

        this.gamePanel = gamePanel;

    }

    // ==========================================
    // DRAW
    // ==========================================

    public void draw(Graphics g) {

        for (int column = 0; column < GameConfig.MAX_SCREEN_COL; column++) {

            g.drawImage(

                    AssetManager.getGroundTile().getImage(),

                    column * GameConfig.TILE_SIZE,

                    GameConfig.GROUND_Y + GameConfig.TILE_SIZE,

                    GameConfig.TILE_SIZE,

                    GameConfig.TILE_SIZE,

                    null

            );

        }

    }

}