package game.main;

import javax.swing.JFrame;

import game.panel.GamePanel;

/**
 * Titik awal program.
 */
public class Main {

    public static void main(String[] args){

        JFrame window = new JFrame();

        window.setTitle("Mario Game");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setResizable(false);

        GamePanel gamePanel = new GamePanel();

        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);

        window.setVisible(true);

        gamePanel.startGameThread();

    }

}