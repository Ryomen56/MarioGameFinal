package game.entity;

import java.awt.Color;
import java.awt.Graphics;

import game.input.KeyHandler;

public class Player extends Entity {

    // ===============================
    // ATTRIBUTE
    // ===============================

    private final KeyHandler keyHandler;

    private int velocityY = 0;

    private final int gravity = 1;

    private final int jumpPower = -16;

    private final int groundY = 200;

    private boolean onGround = true;

    // ===============================
    // CONSTRUCTOR
    // ===============================

    public Player(KeyHandler keyHandler) {

        this.keyHandler = keyHandler;

        setX(100);

        setY(groundY);

        setWidth(48);

        setHeight(48);

        setSpeed(4);

    }

    // ===============================
    // UPDATE
    // ===============================

    public void update() {

        movement();

        jump();

        gravity();

    }

    // ===============================
    // MOVEMENT
    // ===============================

    private void movement() {

        if (keyHandler.leftPressed) {

            setX(getX() - getSpeed());

        }

        if (keyHandler.rightPressed) {

            setX(getX() + getSpeed());

        }

    }

    // ===============================
    // JUMP
    // ===============================

    private void jump() {

        if (keyHandler.jumpPressed && onGround) {

            velocityY = jumpPower;

            onGround = false;

        }

    }

    // ===============================
    // GRAVITY
    // ===============================

    private void gravity() {

        velocityY += gravity;

        setY(getY() + velocityY);

        if (getY() >= groundY) {

            setY(groundY);

            velocityY = 0;

            onGround = true;

        }

    }

    // ===============================
    // DRAW
    // ===============================

    public void draw(Graphics g) {

        g.setColor(Color.BLACK);

        g.fillRect(

                getX(),

                getY(),

                getWidth(),

                getHeight()

        );

    }

}