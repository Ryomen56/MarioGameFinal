package game.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Bertugas membaca input keyboard.
 * Class ini TIDAK menggerakkan Player.
 */
public class KeyHandler implements KeyListener {

    // ===============================
    // STATUS TOMBOL
    // ===============================

    public boolean leftPressed;
    public boolean rightPressed;

    // ===============================
    // TIDAK DIGUNAKAN
    // ===============================

    @Override
    public void keyTyped(KeyEvent e) {

    }

    // ===============================
    // TOMBOL DITEKAN
    // ===============================

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_A) {

            leftPressed = true;

        }

        if (code == KeyEvent.VK_D) {

            rightPressed = true;

        }

    }

    // ===============================
    // TOMBOL DILEPAS
    // ===============================

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_A) {

            leftPressed = false;

        }

        if (code == KeyEvent.VK_D) {

            rightPressed = false;

        }

    }

}