package game.entity;

import java.awt.Rectangle;

/**
 * Parent class untuk semua object yang ada di dalam game.
 *
 * Semua object seperti:
 * - Player
 * - Enemy
 * - Coin
 * - NPC
 * - Object
 *
 * akan mewarisi class ini.
 */
public abstract class Entity {

    // ==========================================
    // POSITION
    // ==========================================

    protected int x;
    protected int y;

    // ==========================================
    // SIZE
    // ==========================================

    protected int width;
    protected int height;

    // ==========================================
    // MOVEMENT
    // ==========================================

    protected int speed;

    protected int velocityY;

    protected boolean onGround;

    // ==========================================
    // COLLISION
    // ==========================================

    protected Rectangle solidArea;

    protected boolean collisionOn;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public Entity() {

        solidArea = new Rectangle();

    }

    // ==========================================
    // GETTER
    // ==========================================

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSpeed() {
        return speed;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public Rectangle getSolidArea() {
        return solidArea;
    }

    public boolean isCollisionOn() {
        return collisionOn;
    }

    // ==========================================
    // SETTER
    // ==========================================

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public void setOnGround(boolean onGround) {
        this.onGround = onGround;
    }

    public void setSolidArea(Rectangle solidArea) {
        this.solidArea = solidArea;
    }

    public void setCollisionOn(boolean collisionOn) {
        this.collisionOn = collisionOn;
    }

}