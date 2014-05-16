/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testes;

import java.util.ArrayList;
import java.util.Arrays;
import modelo.Cromossomo;

/**
 *
 * @author gleywson
 */
public class TestaCromossomo {
    public static void main(String[] args) {
        //tamanho máximo do cromossomo foi de 62 genes
        //tamanho mínimo do cromossomo foi de 02 genes
        Cromossomo c = new Cromossomo(20);
        System.out.println(c);
        
        for (int i = 0; i < c.getX().length; i++) {
            System.out.println("x["+(i+1)+"]: " + c.getX()[i]);
            
        }
        System.out.println("Tamanho: " + c.getTamanho());
        System.out.println("Fitness: " + c.getFitness());
        
//        System.out.println("Testando o substring:");
//        substring();
        
    }
    
    public static void substring() {
        String texto = "Gleywson Ribeiro";
        int comprimento = texto.length();
        System.out.println(comprimento);
        int meio = comprimento/2;
        System.out.println(meio);
        String segmentos[] = new String[2];
        segmentos[0] = texto.substring(0, meio);
        System.out.println(segmentos[0]);
        segmentos[1] = texto.substring(meio, comprimento);
        System.out.println(segmentos[1]);
    }
}
