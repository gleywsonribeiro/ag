/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.AlgoritmoGenetico;
import modelo.Selecao;
import modelo.TipoCrossover;

/**
 *
 * @author Gleywson Ribeiro
 */
@ManagedBean
@RequestScoped
public class AgController {
    private AlgoritmoGenetico ag;
    private Map valores;
    private List<TipoCrossover> crossovers;
    private List<Selecao> selecoes;
    
    
    
    public AgController() {
        this.ag = new AlgoritmoGenetico();
        crossovers = new ArrayList<>();
        crossovers.add(TipoCrossover.UM_PONTO);
        crossovers.add(TipoCrossover.DOIS_PONTOS);
        crossovers.add(TipoCrossover.UNIFORME);
        
        selecoes = new ArrayList<>();
        selecoes.add(Selecao.ROLETA);
        selecoes.add(Selecao.TORNEIO);
        
        valores = new HashMap();
        
        valores.put("p1", 1);
        valores.put("p2", 2);
    }

    public AlgoritmoGenetico getAg() {
        return ag;
    }

    public void setAg(AlgoritmoGenetico ag) {
        this.ag = ag;
    }

    public List<TipoCrossover> getCrossovers() {
        return crossovers;
    }

    public void setCrossovers(List<TipoCrossover> crossovers) {
        this.crossovers = crossovers;
    }

    public List<Selecao> getSelecoes() {
        return selecoes;
    }

    public void setSelecoes(List<Selecao> selecoes) {
        this.selecoes = selecoes;
    }

    public Map getValores() {
        return valores;
    }

    public void setValores(Map valores) {
        this.valores = valores;
    }


   
    
    
}
