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

    /**
     * Menyimpan data map yang dibaca dari world01.txt
     */
    private final int[][] map =
            new int[GameConfig.MAX_SCREEN_ROW]
                [GameConfig.MAX_SCREEN_COL];

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public TileManager(GamePanel gamePanel) {

        this.gamePanel = gamePanel;

        loadMap();

    }

    // ==========================================
    // DRAW MAP
    // ==========================================

    public void draw(Graphics g) {

        for (int row = 0; row < GameConfig.MAX_SCREEN_ROW; row++) {

            for (int column = 0; column < GameConfig.MAX_SCREEN_COL; column++) {

                // Mengambil nomor tile dari map
                int tileNumber = map[row][column];

                // Mengambil objek Tile sesuai nomor
                Tile tile = AssetManager.getTile(tileNumber);

                // Jika tile ada, gambar ke layar
                if (tile != null) {

                    g.drawImage(

                            tile.getImage(),

                            column * GameConfig.TILE_SIZE,

                            row * GameConfig.TILE_SIZE,

                            GameConfig.TILE_SIZE,

                            GameConfig.TILE_SIZE,

                            null);

                }

            }

        }

    }

    // ==========================================
    // LOAD MAP
    // ==========================================

    private void loadMap() {

        try (java.util.Scanner scanner =
                new java.util.Scanner(
                        new java.io.File("assets/maps/world01.txt"))) {

            int row = 0;

            while (scanner.hasNextLine() && row < GameConfig.MAX_SCREEN_ROW) {

                String[] numbers = scanner.nextLine().trim().split("\\s+");

                for (int column = 0;
                        column < GameConfig.MAX_SCREEN_COL
                        && column < numbers.length;
                        column++) {

                    map[row][column] =
                            Integer.parseInt(numbers[column]);

                }

                row++;

            }

        } catch (Exception e) {

            System.out.println("Gagal membaca world01.txt");

            e.printStackTrace();

        }

    }

    // ==========================================
    // GET MAP
    // ==========================================

    /**
     * Mengembalikan data map yang telah dibaca
     * dari file world01.txt.
     *
     * @return array 2 dimensi map
     */
    public int[][] getMap() {

        return map;

    }

    // ==========================================
    // GET TILE NUMBER
    // ==========================================

    public int getTileNumber(int row, int column) {

        if (row < 0 || row >= GameConfig.MAX_SCREEN_ROW) {

            return 0;

        }

        if (column < 0 || column >= GameConfig.MAX_SCREEN_COL) {

            return 0;

        }

        return map[row][column];

    }

    // ==========================================
    // GET GAME PANEL
    // ==========================================

    public GamePanel getGamePanel() {

        return gamePanel;

    }

}