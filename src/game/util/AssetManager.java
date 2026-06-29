package game.util;

import java.awt.image.BufferedImage;

import game.tile.Tile;

public final class AssetManager {

    private AssetManager() {
    }

    // ==========================================
    // PLAYER
    // ==========================================

    private static BufferedImage playerIdle;

    // ==========================================
    // TILE
    // ==========================================

    private static Tile groundTile;

    // ==========================================
    // LOAD
    // ==========================================

    public static void loadAll() {

        loadPlayer();

        loadTiles();

    }

    // ==========================================
    // PLAYER
    // ==========================================

    private static void loadPlayer() {

        playerIdle = UtilityTool.loadImage(
                "assets/images/player/player_idle.png");

    }

    // ==========================================
    // TILE
    // ==========================================

    private static void loadTiles() {

        groundTile = new Tile();

        groundTile.setImage(

                UtilityTool.loadImage(

                        "assets/images/tile/ground.png"));

        groundTile.setCollision(true);

    }

    // ==========================================
    // GETTER
    // ==========================================

    public static BufferedImage getPlayerIdle() {

        return playerIdle;

    }

    public static Tile getGroundTile() {

        return groundTile;

    }

}