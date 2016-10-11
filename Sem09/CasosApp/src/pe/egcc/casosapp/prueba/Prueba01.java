package pe.egcc.casosapp.prueba;

import pe.egcc.casosapp.view.FormularioMDI;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) throws Exception {
    FormularioMDI view;
    
    // Caso 01
    /*
    view = new FormularioMDI();
    view.setVisible(true);
    */
    
    // Caso 02
    /*
    String nombClase = "pe.egcc.casosapp.view.FormularioMDI";
    view = (FormularioMDI) Class.forName(nombClase).newInstance();
    view.setVisible(true);
    */
    
    // Caso 02
    view = (FormularioMDI) Class.forName(FormularioMDI.class.getName()).newInstance();
    view.setVisible(true);
    
  }
}
