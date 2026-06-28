package game.entity;

import game.input.KeyHandler;

/**
 * Player mewarisi Entity.
 */
public class Player extends Entity {

    // ===============================
    // INPUT
    // ===============================

    private KeyHandler keyHandler;

    // ===============================
    // CONSTRUCTOR
    // ===============================

    public Player(KeyHandler keyHandler) {

        this.keyHandler = keyHandler;

        setX(100);
        setY(200);

        setWidth(48);
        setHeight(48);

        setSpeed(4);

    }

    // ===============================
    // UPDATE PLAYER
    // ===============================

    public void update() {

        if (keyHandler.leftPressed) {

            setX(getX() - getSpeed());

        }

        if (keyHandler.rightPressed) {

            setX(getX() + getSpeed());

        }

    }

}