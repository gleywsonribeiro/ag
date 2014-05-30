/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gleywson
 */
public class CasalTest {

    public CasalTest() {
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
     * Test of getPai method, of class Casal.
     */
    @Test
    public void testGetPai() {
        System.out.println("getPai");

        int tamanho = 10;
        Cromossomo pai = new Cromossomo(tamanho);
        Cromossomo mae = new Cromossomo(tamanho);
        Casal instance = new Casal(pai, mae, TipoCrossover.UM_PONTO);

        Cromossomo result = instance.getPai();
        assertEquals(pai, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPai method, of class Casal.
     */
    @Test
    public void testSetPai() {
        System.out.println("setPai");
        int tamanho = 10;
        Cromossomo pai = new Cromossomo(tamanho);
        Cromossomo mae = new Cromossomo(tamanho);
        Casal instance = new Casal(pai, mae, TipoCrossover.UM_PONTO);

        Cromossomo novoPai = new Cromossomo(tamanho);
        instance.setPai(novoPai);

        assertEquals(novoPai, instance.getPai());
    }

    /**
     * Test of getMae method, of class Casal.
     */
    @Test
    public void testGetMae() {
        System.out.println("getMae");
        int tamanho = 10;
        Cromossomo pai = new Cromossomo(tamanho);
        Cromossomo mae = new Cromossomo(tamanho);
        Casal instance = new Casal(pai, mae, TipoCrossover.UM_PONTO);

        Cromossomo result = instance.getMae();
        assertEquals(mae, result);
    }

    /**
     * Test of setMae method, of class Casal.
     */
    @Test
    public void testSetMae() {
        System.out.println("setMae");
        int tamanho = 10;
        Cromossomo pai = new Cromossomo(tamanho);
        Cromossomo mae = new Cromossomo(tamanho);
        Casal instance = new Casal(pai, mae, TipoCrossover.UM_PONTO);

        Cromossomo novaMae = new Cromossomo(tamanho);
        instance.setMae(novaMae);

        assertEquals(novaMae, instance.getMae());
    }

    /**
     * Test of getTipoCrossover method, of class Casal.
     */
    @Test
    public void testGetTipoCrossover() {
        System.out.println("getTipoCrossover");
        Casal instance = new Casal(new Cromossomo(10), new Cromossomo(10), TipoCrossover.UM_PONTO);

        assertEquals(TipoCrossover.UM_PONTO, instance.getTipoCrossover());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoCrossover method, of class Casal.
     */
    @Test
    public void testSetTipoCrossover() {
        System.out.println("setTipoCrossover");
        Casal instance = new Casal(new Cromossomo(10), new Cromossomo(10), TipoCrossover.UM_PONTO);

        TipoCrossover tc = TipoCrossover.UNIFORME;

        instance.setTipoCrossover(tc);

        assertEquals(tc, instance.getTipoCrossover());

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cruza method, of class Casal.
     */
    @Test
    public void testCruza() {
        System.out.println("cruza");
        float taxaDeMutacao = 0.01F;
        int tamanho = 10;
        Cromossomo pai = new Cromossomo(tamanho);
        Cromossomo mae = new Cromossomo(tamanho);

        Casal instance = new Casal(pai, mae, TipoCrossover.UM_PONTO);

        //Cromossomo[] expResult = null;
        Cromossomo[] result = instance.cruza(taxaDeMutacao);

        //assertArrayEquals(instance.getConjuges(), result);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].getX().length; j++) {
                assertEquals(result[i].getX()[j] >= instance.getConjuges()[i].getLimiteInferior() && result[i].getX()[j] <= instance.getConjuges()[i].getLimiteSuperior(), true);
            }
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getConjuges method, of class Casal.
     */
    @Test
    public void testGetConjuges() {
        System.out.println("getConjuges");

        int tamanho = 10;

        Cromossomo[] cromossomos = new Cromossomo[2];

        cromossomos[0] = new Cromossomo(tamanho);
        cromossomos[1] = new Cromossomo(tamanho);

        Casal instance = new Casal(cromossomos[0], cromossomos[1], TipoCrossover.UM_PONTO);

        assertArrayEquals(cromossomos, instance.getConjuges());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
