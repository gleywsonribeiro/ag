/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import modelo.AlgoritmoGenetico;
import modelo.Selecao;
import modelo.TipoCrossover;

/**
 *
 * @author Gleywson
 */
public class Main {
    public static void main(String[] args) {
        AlgoritmoGenetico ag = new AlgoritmoGenetico();
        ag.setTamanhoCromossomo(10);
        ag.setTamanhoPopulacao(50);
        ag.setNumeroGeracoes(100);
        ag.setTaxaDeCruzamento(0.95f);
        ag.setTaxaDeMutacao(0.01f);
        ag.setTipoCrossover(TipoCrossover.UM_PONTO);
        ag.setSelecao(Selecao.ROLETA);
        ag.run();
    }
}
