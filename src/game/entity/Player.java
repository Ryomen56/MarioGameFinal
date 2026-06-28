package game.entity;

/**
 * Class Player.
 * Player mewarisi semua atribut dari Entity.
 */
public class Player extends Entity {

    // ===========================
    // CONSTRUCTOR
    // ===========================

    public Player() {

        // Posisi awal player
        setX(100);
        setY(200);

        // Ukuran player
        setWidth(48);
        setHeight(48);

        // Kecepatan player
        setSpeed(4);

    }

    // ===========================
    // UPDATE PLAYER
    // ===========================

    public void update() {

        // Belum ada logika.
        // Nanti keyboard akan diproses di BAB berikutnya.

    }

}