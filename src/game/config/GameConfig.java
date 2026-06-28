package game.config;

/**
 * Seluruh konfigurasi game.
 * Jika ingin mengubah ukuran layar,
 * gravitasi, kecepatan player,
 * cukup ubah file ini.
 */
public final class GameConfig {

    private GameConfig() {
    }

    // ===============================
    // TILE
    // ===============================

    public static final int ORIGINAL_TILE_SIZE = 16;

    public static final int SCALE = 3;

    public static final int TILE_SIZE =
            ORIGINAL_TILE_SIZE * SCALE;

    // ===============================
    // SCREEN
    // ===============================

    public static final int MAX_SCREEN_COL = 16;

    public static final int MAX_SCREEN_ROW = 12;

    public static final int SCREEN_WIDTH =
            TILE_SIZE * MAX_SCREEN_COL;

    public static final int SCREEN_HEIGHT =
            TILE_SIZE * MAX_SCREEN_ROW;

    // ===============================
    // FPS
    // ===============================

    public static final int FPS = 60;

    // ===============================
    // PLAYER
    // ===============================

    public static final int PLAYER_WIDTH = TILE_SIZE;

    public static final int PLAYER_HEIGHT = TILE_SIZE;

    public static final int PLAYER_SPEED = 4;

    // ===============================
    // PHYSICS
    // ===============================

    public static final int GRAVITY = 1;

    public static final int JUMP_POWER = -16;

    // ===============================
    // GROUND
    // ===============================

    public static final int GROUND_Y = 200;

}