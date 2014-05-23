/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testes;

import java.util.Scanner;

/**
 *
 * @author gleywson
 */
public class Harmonico {
    public static void main(String[] args) {
        System.out.println("Entre com um valor:");
        Scanner scanner = new Scanner(System.in);
        
        int parametro = scanner.nextInt(); //numero do qual quero saber a harmonica
        int harmonica = 0;  //harmonica -> vai dar o resultado no final
        //por exemplo a harmonica de 10 eh 55
        
        for(int i = 1; i <= parametro; i++) {
            harmonica = harmonica + i;
        }
        
        System.out.println("A harmonica de " + parametro +" eh " + harmonica);
    }
}
