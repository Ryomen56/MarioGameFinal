package game.entity;

import java.awt.Rectangle;
/**
 * Class induk untuk semua objek yang dapat muncul di dalam game.
 * Semua entity mempunyai posisi, ukuran, dan kecepatan.
 */
public class Entity {
    
    // ===============================
    // COLLISION
    // ===============================

    private Rectangle solidArea;

    private boolean collisionOn = false;

    // ===========================
    // POSITION
    // ===========================

    private int x;
    private int y;

    // ===========================
    // SIZE
    // ===========================

    private int width;
    private int height;

    // ===========================
    // SPEED
    // ===========================

    private int speed;

    // ===========================
    //  CONSTRUCTOR
    // ===========================

    public Entity() {

    solidArea = new Rectangle();

    }

    // ===========================
    // GETTER
    // ===========================

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

    public Rectangle getSolidArea() {

        return solidArea;

    }

    public boolean isCollisionOn() {

        return collisionOn;

    }

    // ===========================
    // SETTER
    // ===========================

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

    public void setSolidArea(Rectangle solidArea) {

        this.solidArea = solidArea;

    }

    public void setCollisionOn(boolean collisionOn) {

        this.collisionOn = collisionOn;

    }

}