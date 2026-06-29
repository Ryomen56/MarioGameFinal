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

    private static final Tile[] tiles = new Tile[20];

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
                "assets/AssetManager/player/player_idle.png");

    }

    private static void loadTiles() {

    // ==========================================
    // GROUND
    // ==========================================

        tiles[1] = new Tile();

        tiles[1].setImage(

                UtilityTool.loadImage(

                        "assets/AssetManager/tile/ground.png"));

        tiles[1].setCollision(true);

    }

    // ==========================================
    // GETTER
    // ==========================================

    public static BufferedImage getPlayerIdle() {

        return playerIdle;

    }

    // ==========================================
    // GET TILE
    // ==========================================

    public static Tile getTile(int index){

    return tiles[index];

    }

}