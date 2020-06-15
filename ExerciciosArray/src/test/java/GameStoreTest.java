import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Cristian
 * @version 1.0.0
 * @since 05/06/2020 - 01:05
 * @category Test
 */
class GameStoreTest {

    GameStore game = new GameStore();

    /**
     * Tests the value have on stock of this game about 1 hour
     */
    @org.junit.jupiter.api.Test
    void valueInStock() {
        game.setAmount(5);
        game.setPrice(5);
        assertEquals(25.0,game.valueInStock(),0.0);
    }

    /**
     * Tests the price the client will pay for rent a game for determined hour
     */
    @org.junit.jupiter.api.Test
    void priceToPay() {
        game.setPrice(10);
        assertEquals(100.0,game.priceToPay(10),0.0);
    }
}