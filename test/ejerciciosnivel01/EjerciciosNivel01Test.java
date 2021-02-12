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
     * Test of quitaAcentos method, of class EjerciciosNivel01.
     * 
     * Solo quita los acentos, no cambia las mayúsculas
     */
    /*@Test
    public void testEsIsogramaJorge() {
        System.out.println("esIsogramaJorge");
        EjerciciosNivel01 instance = new EjerciciosNivel01();

        assertEquals(true, instance.esIsogramaJorge("murciélago"));
        assertEquals(false, instance.esIsogramaJorge("cocreta"));
        assertEquals(false, instance.esIsogramaJorge("cámar"));
        assertEquals(false, instance.esIsogramaJorge("casa"));
        assertEquals(true, instance.esIsogramaJorge("MURICÉLAGO"));
        assertEquals(false, instance.esIsogramaJorge("isodrima"));
        assertEquals(false, instance.esIsogramaJorge("supercalifragilisticoespialidoso"));

    }*/   
    
  
    /**
     * Test of quitaAcentos method, of class EjerciciosNivel01.
     * 
     * Solo quita los acentos, no cambia las mayúsculas
     */
    /*@Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        EjerciciosNivel01 instance = new EjerciciosNivel01();

        assertEquals(true, instance.esPalindromo("Acaso hubo buhos aca"));
        assertEquals(true, instance.esPalindromo("Aca"));
        assertEquals(false, instance.esPalindromo("feo cara culo"));
        assertEquals(false, instance.esPalindromo("ligar es agil"));
        assertEquals(true, instance.esPalindromo("Allí ves a Sevilla"));
        assertEquals(false, instance.esPalindromo("isodrima"));
    }*/    

    /**
     * Test of quitaAcentos method, of class EjerciciosNivel01.
     * 
     * Solo quita los acentos, no cambia las mayúsculas
     */
    /*@Test
    public void testQuitaAcentos() {
        System.out.println("quitaAcentos");
        EjerciciosNivel01 instance = new EjerciciosNivel01();

        assertEquals("pajaro", instance.quitaAcentos("pájaro"));
        assertEquals("Andale", instance.quitaAcentos("Ándale"));
        assertEquals("Cigueña", instance.quitaAcentos("Cigüeña"));
        assertEquals("perro", instance.quitaAcentos("perro"));
        assertEquals("pajaro", instance.quitaAcentos("pájáró"));
        assertEquals("pristino", instance.quitaAcentos("pristino"));
        assertEquals("murcielago", instance.quitaAcentos("murciélago"));
        assertEquals("atun", instance.quitaAcentos("atún"));
        assertEquals("camion", instance.quitaAcentos("camión"));
        
        assertEquals("PAJARO", instance.quitaAcentos("PÁJARO"));
        assertEquals("PRISTINO", instance.quitaAcentos("PRÍSTINO"));
        assertEquals("MURCIELAGO", instance.quitaAcentos("MURCIÉLAGO"));
        assertEquals("ATUN", instance.quitaAcentos("ATÚN"));
        assertEquals("CAMION", instance.quitaAcentos("CAMIÓN"));
    }*/

    /**
     * Test of quitaAcentosV2 method, of class EjerciciosNivel01.
     */
    /*@Test
    public void testQuitaAcentosV2() {
        System.out.println("quitaAcentosV2");
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        
        assertEquals("pajaro", instance.quitaAcentosV2("pájaro"));
        assertEquals("Andale", instance.quitaAcentosV2("Ándale"));
        assertEquals("Cigueña", instance.quitaAcentosV2("Cigüeña"));
        assertEquals("perro", instance.quitaAcentosV2("perro"));
        assertEquals("pajaro", instance.quitaAcentosV2("pájáró"));
        assertEquals("pristino", instance.quitaAcentosV2("pristino"));
        assertEquals("murcielago", instance.quitaAcentosV2("murciélago"));
        assertEquals("atun", instance.quitaAcentosV2("atún"));
        assertEquals("camion", instance.quitaAcentosV2("camión"));
        
        assertEquals("PAJARO", instance.quitaAcentosV2("PÁJARO"));
        assertEquals("PRISTINO", instance.quitaAcentosV2("PRÍSTINO"));
        assertEquals("MURCIELAGO", instance.quitaAcentosV2("MURCIÉLAGO"));
        assertEquals("ATUN", instance.quitaAcentosV2("ATÚN"));
        assertEquals("CAMION", instance.quitaAcentosV2("CAMIÓN"));
    }*/

    /**
     * Test of numeroMaximo method, of class EjerciciosNivel01.
     */
    /*@Test
    public void testNumeroMaximo() {
        System.out.println("numeroMaximo");
        int[] lista = null;
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        int expResult = 0;
        int result = instance.numeroMaximo(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of maximos method, of class EjerciciosNivel01.
     */
    /*@Test
    public void testMaximos() {
        System.out.println("maximos");
        int[] lista = null;
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        int[] expResult = null;
        int[] result = instance.maximos(lista);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of esIsograma method, of class EjerciciosNivel01.
     */
    /*@Test
    public void testEsIsograma() {
        System.out.println("esIsograma");
        String palabra = "";
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        boolean expResult = false;
        boolean result = instance.esIsograma(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of divideFrase method, of class EjerciciosNivel01.
     */
    @Test
    public void testDivideFrase() {
        System.out.println("divideFrase");
        String frase = "";
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        String[] expResult = null;
        String[] result = instance.divideFrase(frase);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acronimo method, of class EjerciciosNivel01.
     */
    @Test
    public void testAcronimo() {
        System.out.println("acronimo");
        EjerciciosNivel01 instance = new EjerciciosNivel01();

        assertEquals("AVE", instance.acronimo("Alta Velocidad Española"));
        //assertEquals("CdETyS", instance.acronimo("Centro de Estudios Tecnológcos y Sociales"));
        assertEquals("CETS", instance.acronimo("Centro de Estudios Tecnológcos y Sociales"));
        assertEquals("UFV", instance.acronimo("Universidad Francisco de Vitoria"));
        assertEquals("OMS", instance.acronimo("Organización Mundial de la Salud"));
        assertEquals("ESO", instance.acronimo("educación secundaria obligatoria"));
        assertEquals("ITV", instance.acronimo("Inspección técnica de vehículos"));
        assertEquals("OTAN", instance.acronimo("organización tratado atlántico norte"));
        assertEquals("ACNUR", instance.acronimo("alto comisionado de las naciones unidas  refugiado"));
    }

    /**
     * Test of numeroMaximo method, of class EjerciciosNivel01.
     */
    /*@Test
    public void testNumeroMaximo() {
        System.out.println("numeroMaximo");
        int[] lista = null;
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        int expResult = 0;
        int result = instance.numeroMaximo(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of maximos method, of class EjerciciosNivel01.
     */
    /*@Test
    public void testMaximos() {
        System.out.println("maximos");
        int[] lista = null;
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        int[] expResult = null;
        int[] result = instance.maximos(lista);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of esPalindromo method, of class EjerciciosNivel01.
     */
    /*@Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        String frase = "";
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        boolean expResult = false;
        boolean result = instance.esPalindromo(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of esIsograma method, of class EjerciciosNivel01.
     */
    /*@Test
    public void testEsIsograma() {
        System.out.println("esIsograma");
        String palabra = "";
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        boolean expResult = false;
        boolean result = instance.esIsograma(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of esIsogramaJorge method, of class EjerciciosNivel01.
     */
    /*@Test
    public void testEsIsogramaJorge() {
        System.out.println("esIsogramaJorge");
        String palabra = "";
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        boolean expResult = false;
        boolean result = instance.esIsogramaJorge(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of quitaAcentos method, of class EjerciciosNivel01.
     */
    @Test
    public void testQuitaAcentos() {
        System.out.println("quitaAcentos");
        String cadena = "";
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        String expResult = "";
        String result = instance.quitaAcentos(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitaAcentosV2 method, of class EjerciciosNivel01.
     */
    @Test
    public void testQuitaAcentosV2() {
        System.out.println("quitaAcentosV2");
        String cadena = "";
        EjerciciosNivel01 instance = new EjerciciosNivel01();
        String expResult = "";
        String result = instance.quitaAcentosV2(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



    /**
     * Test of anagrama method, of class EjerciciosNivel01.
     */
    @Test
    public void testAnagrama() {
        System.out.println("anagrama");
        EjerciciosNivel01 instance = new EjerciciosNivel01();

        assertEquals(true, instance.anagrama("roma", "amor"));
        assertEquals(false, instance.anagrama("", ""));
        assertEquals(true, instance.anagrama("Claudia", "licuada"));
        assertEquals(true, instance.anagrama("Helios", "hielos"));
        assertEquals(true, instance.anagrama("nacionalista ", "Altisonancia"));
        assertEquals(false, instance.anagrama("kike", "suspenso"));
    }


}
