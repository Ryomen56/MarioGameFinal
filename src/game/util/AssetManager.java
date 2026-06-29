package game.util;

import java.awt.image.BufferedImage;

import game.tile.Tile;

/**
 * Mengelola seluruh asset game.
 */
public final class AssetManager {

    private AssetManager() {
    }

    // =====================================================
    // PLAYER
    // =====================================================

    private static BufferedImage playerIdle;
    private static BufferedImage playerWalk1;
    private static BufferedImage playerWalk2;
    private static BufferedImage playerJump;
    private static BufferedImage playerDuck;

    // =====================================================
    // TILE
    // =====================================================

    private static final Tile[] tiles = new Tile[50];

    // =====================================================
    // LOAD
    // =====================================================

    public static void loadAll() {

        loadPlayer();

        loadTiles();

    }

    // =====================================================
    // PLAYER
    // =====================================================

    private static void loadPlayer() {

        playerIdle = UtilityTool.loadImage(
                "assets/player/player_idle.png");

        playerWalk1 = UtilityTool.loadImage(
                "assets/player/player_walk1.png");

        playerWalk2 = UtilityTool.loadImage(
                "assets/player/player_walk2.png");

        playerJump = UtilityTool.loadImage(
                "assets/player/player_jump.png");

        playerDuck = UtilityTool.loadImage(
                "assets/player/player_duck.png");

    }

    // =====================================================
    // TILE
    // =====================================================

    private static void loadTiles() {

        tiles[0] = new Tile();

        tiles[0].setCollision(false);

        tiles[1] = new Tile();

        tiles[1].setImage(

                UtilityTool.loadImage(

                        "assets/tile/ground.png"));

        tiles[1].setCollision(true);

    }

    // =====================================================
    // PLAYER GETTER
    // =====================================================

    public static BufferedImage getPlayerIdle() {
        return playerIdle;
    }

    public static BufferedImage getPlayerWalk1() {
        return playerWalk1;
    }

    public static BufferedImage getPlayerWalk2() {
        return playerWalk2;
    }

    public static BufferedImage getPlayerJump() {
        return playerJump;
    }

    public static BufferedImage getPlayerDuck() {
        return playerDuck;
    }

    // =====================================================
    // TILE GETTER
    // =====================================================

    public static Tile getTile(int index) {

        if (index < 0 || index >= tiles.length) {

            return null;

        }

        return tiles[index];

    }

}