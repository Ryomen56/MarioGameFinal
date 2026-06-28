package game.entity;

import java.awt.Color;
import java.awt.Graphics;

import game.input.KeyHandler;
import game.panel.GameConfig;

public class Player extends Entity {

    // ===============================
    // ATTRIBUTE
    // ===============================

    private final KeyHandler keyHandler;

    private int velocityY = 0;

    private boolean onGround = true;

    // ===============================
    // CONSTRUCTOR
    // ===============================

    public Player(KeyHandler keyHandler) {

        this.keyHandler = keyHandler;

        setX(100);

        setY(GameConfig.GROUND_Y);

        setWidth(GameConfig.PLAYER_WIDTH);

        setHeight(GameConfig.PLAYER_HEIGHT);

        setSpeed(GameConfig.PLAYER_SPEED);

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

            velocityY = GameConfig.JUMP_POWER;

            onGround = false;

        }

    }

    // ===============================
    // GRAVITY
    // ===============================

    private void gravity() {

        velocityY += GameConfig.GRAVITY;

        setY(getY() + velocityY);

        if (getY() >= GameConfig.GROUND_Y) {

            setY(GameConfig.GROUND_Y);

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