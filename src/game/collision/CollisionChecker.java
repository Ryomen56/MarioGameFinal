package game.collision;

import game.config.GameConfig;
import game.entity.Player;
import game.panel.GamePanel;
import game.util.AssetManager;

public class CollisionChecker {

    // =====================================
    // ATTRIBUTE
    // =====================================

    private final GamePanel gamePanel;

    // =====================================
    // CONSTRUCTOR
    // =====================================

    public CollisionChecker(GamePanel gamePanel) {

        this.gamePanel = gamePanel;

    }

    // =====================================
    // CHECK TILE
    // =====================================

    public void checkTile(Player player) {

        // Reset collision
        player.setCollisionOn(false);

        // ===============================
        // Posisi hitbox player
        // ===============================

        int leftWorldX =
                player.getX() + player.getSolidArea().x;

        int rightWorldX =
                player.getX()
                + player.getSolidArea().x
                + player.getSolidArea().width;

        int bottomWorldY =
                player.getY()
                + player.getSolidArea().y
                + player.getSolidArea().height;

        // ===============================
        // Hitung tile yang disentuh
        // ===============================

        int leftColumn =
                leftWorldX / GameConfig.TILE_SIZE;

        int rightColumn =
                rightWorldX / GameConfig.TILE_SIZE;

        int bottomRow =
                bottomWorldY / GameConfig.TILE_SIZE;

        // ===============================
        // Ambil tile
        // ===============================

        int[][] map =
                gamePanel.getTileManager().getMap();

        int tileLeft =
                map[bottomRow][leftColumn];

        int tileRight =
                map[bottomRow][rightColumn];

        // ===============================
        // Collision
        // ===============================

        if (AssetManager.getTile(tileLeft) != null
                && AssetManager.getTile(tileLeft).isCollision()) {

            player.setCollisionOn(true);

        }

        if (AssetManager.getTile(tileRight) != null
                && AssetManager.getTile(tileRight).isCollision()) {

            player.setCollisionOn(true);

        }

    }

}