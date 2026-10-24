package com.gqs.aula.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotaTest {
@Test
void deveRejeitarA1MaiorQue30() {
    CalculadoraNota calc = new CalculadoraNota();
    assertThrows(IllegalArgumentException.class,
        () -> calc.calcularNotaFinal(35, 20, 30));

}
}