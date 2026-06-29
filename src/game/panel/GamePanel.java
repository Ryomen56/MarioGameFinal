package game.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import game.config.GameConfig;
import game.entity.Player;
import game.input.KeyHandler;
import game.tile.TileManager;

public class GamePanel extends JPanel implements Runnable {

    // ==========================================
    // ATTRIBUTE
    // ==========================================

    private Thread gameThread;

    private final KeyHandler keyHandler;

    private final Player player;

    private final TileManager tileManager;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public GamePanel() {

        // Ukuran Window
        setPreferredSize(new Dimension(
                GameConfig.SCREEN_WIDTH,
                GameConfig.SCREEN_HEIGHT));

        // Background
        setBackground(new Color(92, 148, 252));

        setDoubleBuffered(true);

        setFocusable(true);

        // Keyboard
        keyHandler = new KeyHandler();

        addKeyListener(keyHandler);

        // Tile
        tileManager = new TileManager(this);

        // Player
        player = new Player(this, keyHandler);

    }

    // ==========================================
    // START GAME
    // ==========================================

    public void startGameThread() {

        gameThread = new Thread(this);

        gameThread.start();

    }

    // ==========================================
    // GAME LOOP
    // ==========================================

    @Override
    public void run() {

        double drawInterval = 1000000000.0 / GameConfig.FPS;

        double delta = 0;

        long lastTime = System.nanoTime();

        while (gameThread != null) {

            long currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;

            lastTime = currentTime;

            if (delta >= 1) {

                update();

                repaint();

                delta--;

            }

        }

    }

    // ==========================================
    // UPDATE
    // ==========================================

    public void update() {

        player.update();

    }

    // ==========================================
    // DRAW
    // ==========================================

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        // Gambar Map
        tileManager.draw(g);

        // Gambar Player
        player.draw(g);

        g.dispose();

    }

    // ==========================================
    // GETTER
    // ==========================================

    public Player getPlayer() {

        return player;

    }

    public TileManager getTileManager() {

        return tileManager;

    }

    public KeyHandler getKeyHandler() {

        return keyHandler;

    }

}