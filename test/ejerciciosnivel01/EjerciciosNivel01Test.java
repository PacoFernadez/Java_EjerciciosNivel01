/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paco2
 */
public class EjerciciosNivel01Test {
    
    public EjerciciosNivel01Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of numeroMaximo method, of class EjerciciosNivel01.
     */
    @Test
    public void testNumeroMaximo() {
        System.out.println("numeroMaximo");
        int[] lista = null;
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        int expResult = 0;
        int result = instance.numeroMaximo(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maximos method, of class EjerciciosNivel01.
     */
    @Test
    public void testMaximos() {
        System.out.println("maximos");
        int[] lista = null;
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        int[] expResult = null;
        int[] result = instance.maximos(lista);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esPalindromo method, of class EjerciciosNivel01.
     */
    @Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        
        assertEquals(true, instance.esPalindromo("Acaso hubo buhos aca"));
        assertEquals(true, instance.esPalindromo("Aca"));
        assertEquals(false, instance.esPalindromo("feo cara culo"));
        assertEquals(false, instance.esPalindromo("ligar es agil"));
        assertEquals(true, instance.esPalindromo("Allí ves a sevilla"));
        assertEquals(true, instance.esPalindromo("Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida"));
        
    }

    /**
     * Test of esIsograma method, of class EjerciciosNivel01.
     */
    @Test
    public void testEsIsograma() {
        System.out.println("esIsograma");
        String palabra = "";
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        boolean expResult = false;
        boolean result = instance.esIsograma(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esIsogramaJorge method, of class EjerciciosNivel01.
     */
    @Test
    public void testEsIsogramaJorge() {
        System.out.println("esIsogramaJorge");
        EjerciciosNivel01 instance = new EjerciciosNivel01();

        assertEquals(true, instance.esIsogramaJorge("murcielago"));
        assertEquals(false, instance.esIsogramaJorge("cocreta"));
        assertEquals(false, instance.esIsogramaJorge("casa"));
        assertEquals(false, instance.esIsogramaJorge("supercalifragilisticoespialidoso"));
        assertEquals(false, instance.esIsogramaJorge("Cocreta"));
        assertEquals(false, instance.esIsogramaJorge("isódroma"));
        assertEquals(true, instance.esIsogramaJorge("pita"));
        assertEquals(false, instance.esIsogramaJorge("pájaro"));
        assertEquals(true, instance.esIsogramaJorge("MURCIELAGO"));
        assertEquals(false, instance.esIsogramaJorge("COCRETA"));
        assertEquals(true, instance.esIsogramaJorge("CETYS"));
        assertEquals(true, instance.esIsogramaJorge("CETYS"));
        assertEquals(true, instance.esIsogramaJorge("UFV"));
    }

    /**
     * Test of main method, of class EjerciciosNivel01.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjerciciosNivel01.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
