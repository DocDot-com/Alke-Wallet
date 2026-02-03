
package alkewallet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    @Test
    public void testIngresarDinero() {
        Cuenta cuenta = new Cuenta();
        cuenta.ingresar(500);
        assertEquals(500, cuenta.getSaldo());
    }

    @Test
    public void testRetirarDinero() {
        Cuenta cuenta = new Cuenta();
        cuenta.ingresar(1000);
        cuenta.retirar(300);
        assertEquals(700, cuenta.getSaldo());
    }
}
