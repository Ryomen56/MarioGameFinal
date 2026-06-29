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
    // DRAW
    // ==========================================

    public void draw(Graphics g) {

        for(int row = 0;
                row < GameConfig.MAX_SCREEN_ROW;
                row++){

            for(int column = 0;
                    column < GameConfig.MAX_SCREEN_COL;
                    column++){

                int tile = map[row][column];

                if(tile == 1){

                    g.drawImage(

                            AssetManager
                            .getGroundTile()
                            .getImage(),

                            column * GameConfig.TILE_SIZE,

                            row * GameConfig.TILE_SIZE,

                            GameConfig.TILE_SIZE,

                            GameConfig.TILE_SIZE,

                            null);

                }

                if(tile == 2){

                    g.drawImage(

                            AssetManager
                            .getGroundTile()
                            .getImage(),

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

        try {

            java.io.File file =
                    new java.io.File("assets/maps/world01.txt");

            java.util.Scanner scanner =
                    new java.util.Scanner(file);

            int row = 0;

            while(scanner.hasNextLine()){

                String line = scanner.nextLine();

                String[] numbers = line.split(" ");

                for(int column = 0;
                        column < numbers.length;
                        column++){

                    map[row][column] =
                            Integer.parseInt(numbers[column]);

                }

                row++;

            }

            scanner.close();

        }

        catch(Exception e){

            e.printStackTrace();

        }

    }

}