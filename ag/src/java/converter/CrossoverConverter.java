/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package converter;

import controller.AgController;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import modelo.TipoCrossover;

/**
 *
 * @author Gleywson Ribeiro
 */
@FacesConverter(value = "crossoverConverter")
public class CrossoverConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(value != null) {
            TipoCrossover.valueOf(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value != null && value instanceof TipoCrossover) {
            return ((TipoCrossover)value).name();
        }
        return null;
    }
    
}
