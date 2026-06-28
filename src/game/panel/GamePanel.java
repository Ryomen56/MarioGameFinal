package game.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Panel utama game.
 * Semua gambar nanti akan digambar di sini.
 */
public class GamePanel extends JPanel implements Runnable {

    // ===============================
    // THREAD GAME
    // ===============================

    private Thread gameThread;

    // ===============================
    // CONSTRUCTOR
    // ===============================

    public GamePanel() {

        setPreferredSize(

                new Dimension(

                        GameConfig.SCREEN_WIDTH,

                        GameConfig.SCREEN_HEIGHT));

        setBackground(new Color(92,148,252));

        setDoubleBuffered(true);

        setFocusable(true);

    }

    // ===============================
    // MEMULAI GAME
    // ===============================

    public void startGameThread() {

        gameThread = new Thread(this);

        gameThread.start();

    }

    // ===============================
    // GAME LOOP
    // ===============================

    @Override
    public void run() {

        double drawInterval =
                1000000000.0 / GameConfig.FPS;

        double delta = 0;

        long lastTime = System.nanoTime();

        long currentTime;

        while(gameThread != null){

            currentTime = System.nanoTime();

            delta += (currentTime-lastTime)/drawInterval;

            lastTime = currentTime;

            if(delta >= 1){

                update();

                repaint();

                delta--;

            }

        }

    }

    // ===============================
    // UPDATE GAME
    // ===============================

    public void update(){

    }

    // ===============================
    // GAMBAR GAME
    // ===============================

    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent(g);

    }

}