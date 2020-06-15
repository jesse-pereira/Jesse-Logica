import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person = new Person();

    @BeforeEach
    void setUp() {
        person.setName("Juliano");
    }

    @org.junit.jupiter.api.Test
    void imprimirNome10x() {
        assertEquals("\nJuliano\nJuliano\nJuliano\nJuliano\nJuliano\nJuliano\nJuliano\nJuliano\nJuliano\nJuliano", person.imprimirNome10x());
    }


}