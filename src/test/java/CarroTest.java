import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertNotNull;

public class CarroTest {

    @Test
    public void deveRetornarCarroValido() {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder.setNome("Carro1").setMarca("Marca1").build();

        assertNotNull(carro);

    }

}
