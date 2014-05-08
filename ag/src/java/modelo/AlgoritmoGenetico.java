/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gleywson-net
 */
public class AlgoritmoGenetico {
    private TipoCrossover tipoCrossover;
    private Selecao selecao;
    private float taxaDeMutacao;
    private float taxaDeCruzamento;
    private int tamanhoPopulacao;
    private int tamanhoCromossomo;
    private int numeroGeracoes;
    
    private Populacao populacao;
    private List melhores;
    private List piores;
    
    
//    public void run() {
//        File arquivo = new File("saidaFunctionBin.m");
//        FileWriter fw;
//        try {
//            fw = new FileWriter(arquivo);
//            System.out.println("Iniciando Algoritmo... ");
//            
//            populacao = new Populacao(tamanhoPopulacao, tamanhoCromossomo);
//            populacao.setTipoCrossover(this.tipoCrossover);
//            populacao.setSelecao(selecao);
//            populacao.geracao(taxaDeCruzamento, taxaDeMutacao);
//            
//            
//            fw.write("%Geracao inicial\n");
//            String melhores = "melhores = [";
//            String piores = "piores = [";
//            fw.write(populacao.saida(0) + "\n");
//            for (int i = 1; i <= numeroGeracoes; i++) {
//                populacao.geracao(taxaDeCruzamento, taxaDeMutacao);
//                melhores += populacao.getMelhorIndividuo()+",";
//                piores += populacao.getPiorIndividuo()+",";
//                fw.write("%geracao " + i + "\n");
//                
//                fw.write(populacao.saida(i) + "\n");
//                fw.write("title('Geracao: " + i + "');\n"); 
//
//            }
//            StringBuilder sb1 = new StringBuilder(melhores);
//            StringBuilder sb2 = new StringBuilder(piores);
//            melhores = sb1.deleteCharAt(melhores.length()-1).toString();
//            piores = sb2.deleteCharAt(piores.length()-1).toString();
//            
//            melhores += "];\n";
//            piores += "];\n";
//            
//            
//            fw.write(melhores);
//            fw.write(piores);
//            fw.write("pause();\n");
//            fw.write("plot(melhores);\n");
//            fw.write("hold on;\n");
//            fw.write("pause();\n");
//            fw.write("plot(piores);\n");
//            System.out.println("FIM!");
//            fw.close();
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
    
    public void run() {
       
            System.out.println("Iniciando Algoritmo... ");
            
            populacao = new Populacao(tamanhoPopulacao, tamanhoCromossomo);
            populacao.setTipoCrossover(this.tipoCrossover);
            populacao.setSelecao(selecao);
            populacao.geracao(taxaDeCruzamento, taxaDeMutacao);

            melhores = new ArrayList();
            piores = new ArrayList();
            
            for (int i = 1; i <= numeroGeracoes; i++) {
                populacao.geracao(taxaDeCruzamento, taxaDeMutacao);
                melhores.add(populacao.getMelhorIndividuo());
                piores.add(populacao.getPiorIndividuo());
            }
    }

    public int getNumeroGeracoes() {
        return numeroGeracoes;
    }

    public void setNumeroGeracoes(int numeroGerecoes) {
        this.numeroGeracoes = numeroGerecoes;
    }
    
    

    public Selecao getSelecao() {
        return selecao;
    }

    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }
    
    

    public TipoCrossover getTipoCrossover() {
        return tipoCrossover;
    }

    public void setTipoCrossover(TipoCrossover tipoCrossover) {
        this.tipoCrossover = tipoCrossover;
    }

    public float getTaxaDeMutacao() {
        return taxaDeMutacao;
    }

    public void setTaxaDeMutacao(float taxaDeMutacao) {
        this.taxaDeMutacao = taxaDeMutacao;
    }

    public float getTaxaDeCruzamento() {
        return taxaDeCruzamento;
    }

    public void setTaxaDeCruzamento(float taxaDeCruzamento) {
        this.taxaDeCruzamento = taxaDeCruzamento;
    }

    public int getTamanhoPopulacao() {
        return tamanhoPopulacao;
    }

    public void setTamanhoPopulacao(int tamanhoPopulacao) {
        this.tamanhoPopulacao = tamanhoPopulacao;
    }

    public int getTamanhoCromossomo() {
        return tamanhoCromossomo;
    }

    public void setTamanhoCromossomo(int tamanhoCromossomo) {
        this.tamanhoCromossomo = tamanhoCromossomo;
    }

    public Populacao getPopulacao() {
        return populacao;
    }

    public List getMelhores() {
        return melhores;
    }

    public List getPiores() {
        return piores;
    }
    
    
    
    
}
