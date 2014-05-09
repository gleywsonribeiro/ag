/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.LineChartSeries;
/**
 *
 * @author gleywson
 */
@Named(value = "grafico")
@RequestScoped
public class GraficoController {

    private CartesianChartModel modeloGrafico;
    
    public GraficoController() {
        modeloGrafico = new CartesianChartModel();
        LineChartSeries serie = new LineChartSeries("Queda Exponencial");
        
        for(int i = 0; i <= 40; i++) {
            serie.set(i, Math.cos(i)*Math.exp(-i/10));
        }
        modeloGrafico.addSeries(serie);
    }

    public CartesianChartModel getModeloGrafico() {
        return modeloGrafico;
    }

    public void setModeloGrafico(CartesianChartModel modeloGrafico) {
        this.modeloGrafico = modeloGrafico;
    }

    
    
}
