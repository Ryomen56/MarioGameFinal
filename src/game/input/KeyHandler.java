package game.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    // ===============================
    // ATTRIBUTE
    // ===============================

    public boolean leftPressed;

    public boolean rightPressed;

    public boolean jumpPressed;

    // ===============================
    // KEY TYPED
    // ===============================

    @Override
    public void keyTyped(KeyEvent e) {

    }

    // ===============================
    // KEY PRESSED
    // ===============================

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();

        switch (code) {

            case KeyEvent.VK_A:

                leftPressed = true;

                break;

            case KeyEvent.VK_D:

                rightPressed = true;

                break;

            case KeyEvent.VK_SPACE:

                jumpPressed = true;

                break;

        }

    }

    // ===============================
    // KEY RELEASED
    // ===============================

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        switch (code) {

            case KeyEvent.VK_A:

                leftPressed = false;

                break;

            case KeyEvent.VK_D:

                rightPressed = false;

                break;

            case KeyEvent.VK_SPACE:

                jumpPressed = false;

                break;

        }

    }

}