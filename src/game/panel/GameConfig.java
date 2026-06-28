package game.panel;

/**
 * Menyimpan seluruh konfigurasi game.
 * Jika suatu hari ukuran game berubah,
 * cukup ubah di file ini.
 */
public class GameConfig {

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

}