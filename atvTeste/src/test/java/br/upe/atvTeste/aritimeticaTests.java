package br.upe.atvTeste;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class aritimeticaTests {
    @Test
    void testAdd( ) {
        assertEquals(8,aritimetica.add(5,3));
    }
    @Test
    void testSubtract( ) {
        assertEquals(2,aritimetica.subtract(5,3));
    }
}
