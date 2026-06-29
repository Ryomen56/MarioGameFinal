package game.entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import game.config.GameConfig;
import game.input.KeyHandler;
import game.panel.GamePanel;
import game.util.AssetManager;

/**
 * Class Player.
 */
public class Player extends Entity {

    // ==========================================
    // ATTRIBUTE
    // ==========================================

    private final GamePanel gamePanel;
    private final KeyHandler keyHandler;

    private final BufferedImage idleSprite;

    private final int groundLevel;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public Player(GamePanel gamePanel, KeyHandler keyHandler) {

        this.gamePanel = gamePanel;
        this.keyHandler = keyHandler;

        width = GameConfig.PLAYER_WIDTH;
        height = GameConfig.PLAYER_HEIGHT;

        speed = GameConfig.PLAYER_SPEED;

        x = 100;

        groundLevel = GameConfig.GROUND_Y - height;

        y = groundLevel;

        onGround = true;

        velocityY = 0;

        solidArea.x = 8;
        solidArea.y = 8;
        solidArea.width = 48;
        solidArea.height = 56;

        idleSprite = AssetManager.getPlayerIdle();

    }

    // ==========================================
    // UPDATE
    // ==========================================

    public void update() {

        movement();

        jump();

        gravity();

    }

    // ==========================================
    // MOVEMENT
    // ==========================================

    private void movement() {

        moveLeft();

        moveRight();

    }

    // ==========================================
    // MOVE LEFT
    // ==========================================

    private void moveLeft() {

        if (keyHandler.leftPressed) {

            x -= speed;

        }

    }

    // ==========================================
    // MOVE RIGHT
    // ==========================================

    private void moveRight() {

        if (keyHandler.rightPressed) {

            x += speed;

        }

    }

    // ==========================================
    // JUMP
    // ==========================================

    private void jump() {

        if (keyHandler.jumpPressed && onGround) {

            velocityY = GameConfig.JUMP_POWER;

            onGround = false;

        }

    }

    // ==========================================
    // GRAVITY
    // ==========================================

    private void gravity() {

        velocityY += GameConfig.GRAVITY;

        y += velocityY;

        if (y >= groundLevel) {

            y = groundLevel;

            velocityY = 0;

            onGround = true;

        }

    }

    // ==========================================
    // DRAW
    // ==========================================

    public void draw(Graphics g) {

        g.drawImage(

                idleSprite,

                x,

                y,

                width,

                height,

                null);

    }

}