package game.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import game.input.KeyHandler;
import game.panel.GamePanel;
import game.config.GameConfig;
import game.util.AssetManager;
import game.util.UtilityTool;

public class Player extends Entity {

    // ===============================
    // ATTRIBUTE
    // ===============================

    private final KeyHandler keyHandler;

    private final GamePanel gamePanel;

    private int velocityY = 0;

    private boolean onGround = true;

    private BufferedImage sprite;

    // ===============================
    // CONSTRUCTOR
    // ===============================

    public Player(GamePanel gamePanel, KeyHandler keyHandler) {

        this.gamePanel = gamePanel;

        this.keyHandler = keyHandler;

        setX(100);

        setY(groundLevel);

        setWidth(GameConfig.PLAYER_WIDTH);

        setHeight(GameConfig.PLAYER_HEIGHT);

        setSpeed(GameConfig.PLAYER_SPEED);

        getSolidArea().x = 8;

        getSolidArea().y = 8;

        getSolidArea().width = 48;

        getSolidArea().height = 56;

    }

    // ===============================
    // GROUND
    // ===============================

    private final int groundLevel =
            GameConfig.GROUND_Y - GameConfig.PLAYER_HEIGHT;

    // ===============================
    // UPDATE
    // ===============================

    public void update(){

        movement();

        jump();

        gamePanel
                .getCollisionChecker()
                .checkTile(this);

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

        // Tambahkan gravitasi
        velocityY += GameConfig.GRAVITY;

        // Geser posisi player
        if(!isCollisionOn()){

        setY(

                getY()

                + velocityY

        );

        }
        else{

            velocityY = 0;

            onGround = true;

        }

        // Cek apakah sudah menyentuh tanah
        if (getY() > groundLevel) {

            setY(groundLevel);

            velocityY = 0;

            onGround = true;

        }

    }

    // ===============================
    // DRAW
    // ===============================

    public void draw(Graphics g) {

        g.drawImage(

                AssetManager.getPlayerIdle(),

                getX(),

                getY(),

                getWidth(),

                getHeight(),

                null

        );

    }

}