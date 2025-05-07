package Tests;

import org.junit.jupiter.api.Test;

import Logica.Parcial;

import static org.junit.jupiter.api.Assertions.*;

public class testParcial {




    @Test
    void testPotenciaBasePositivaExponentePositivo() {
        assertEquals(32, Parcial.potencia(2, 5));
        assertEquals(1, Parcial.potencia(5, 0));
        assertEquals(5, Parcial.potencia(5, 1));
        assertEquals(625, Parcial.potencia(5, 4));
        assertEquals(1, Parcial.potencia(1, 100));
    }

    @Test
    void testPotenciaBaseNegativaExponentePositivo() {
        assertEquals(-8, Parcial.potencia(-2, 3));
        assertEquals(16, Parcial.potencia(-2, 4));
        assertEquals(-1, Parcial.potencia(-1, 3));
        assertEquals(1, Parcial.potencia(-1, 4));
    }

    @Test
    void testPotenciaBaseCero() {
        assertEquals(0, Parcial.potencia(0, 5));
        assertEquals(1, Parcial.potencia(0, 0)); 
    }

    @Test
    void testPotenciaExponenteNegativo() {
        assertEquals(0, Parcial.potencia(2, -1)); 
        assertEquals(0, Parcial.potencia(5, -3)); 
    }

    @Test
    void testPotenciaOverflowPositivo() {
        assertEquals(0, Parcial.potencia(2, 31));
        assertEquals(0, Parcial.potencia(3, 20));
    }

    @Test
    void testPotenciaOverflowNegativo() {
        assertEquals(0, Parcial.potencia(-10, 31));
        assertEquals(0, Parcial.potencia(-136, 19));
    }

    @Test
    void testValoresLimite() {
        assertEquals(Integer.MAX_VALUE, Parcial.potencia(Integer.MAX_VALUE, 1));
        assertEquals(1, Parcial.potencia(Integer.MAX_VALUE, 0));
        assertEquals(0, Parcial.potencia(Integer.MAX_VALUE, 2)); 
        assertEquals(Integer.MIN_VALUE, Parcial.potencia(Integer.MIN_VALUE, 1));
        assertEquals(1, Parcial.potencia(Integer.MIN_VALUE, 0));
        assertEquals(0, Parcial.potencia(Integer.MIN_VALUE, 2));
    }

}