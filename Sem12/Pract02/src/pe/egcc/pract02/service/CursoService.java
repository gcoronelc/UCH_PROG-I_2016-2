package pe.egcc.pract02.service;

import pe.egcc.pract02.model.CategoriaModel;
import pe.egcc.pract02.model.CursoModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class CursoService {
  
  public static final String CAT_BASICO = "BASICO";
  public static final String CAT_INTERMEDIO = "INTERMEDIO";
  public static final String CAT_AVANZADO = "AVANZADO";
  
  public static final Double COSTO_BASICO = 400.0;
  public static final Double COSTO_INTERMEDIO = 600.0;
  public static final Double COSTO_AVANZADO = 800.0;

  public static final Double HORA_BASICO = 50.0;
  public static final Double HORA_INTERMEDIO = 70.0;
  public static final Double HORA_AVANZADO = 100.0;
  
  
  public CategoriaModel[] getCategorias(){
    CategoriaModel[] lista = {
      new CategoriaModel(CAT_BASICO, COSTO_BASICO, HORA_BASICO),
      new CategoriaModel(CAT_INTERMEDIO, COSTO_INTERMEDIO, HORA_INTERMEDIO),
      new CategoriaModel(CAT_AVANZADO, COSTO_AVANZADO, HORA_AVANZADO)
    };
    return lista;
  }
  
  
  
  public void procesar(CursoModel model){
    // Paso 1: Costo y Pago por Hora
    switch(model.getCategoria()){
      case CAT_BASICO:
        model.setCosto(COSTO_BASICO);
        model.setPagoHora(HORA_BASICO);
        break;
      case CAT_INTERMEDIO:
        model.setCosto(COSTO_INTERMEDIO);
        model.setPagoHora(HORA_INTERMEDIO);
        break;
      case CAT_AVANZADO:
        model.setCosto(COSTO_AVANZADO);
        model.setPagoHora(HORA_AVANZADO);
        break;        
    }
    // Paso 2: Ingresos
    model.setIngresos(model.getCosto() * model.getVacantes());
    // Paso 3: Gastos
    model.setPublicidad(model.getIngresos() * 0.07);
    model.setLogistica(model.getIngresos() * 0.08);
    model.setMaterial(model.getIngresos() * 0.06);
    model.setPagoProfesor(model.getPagoHora() * 24);
    model.setGastos(model.getPagoProfesor() 
            + model.getPublicidad() + model.getLogistica()
            + model.getMaterial());
    // Paso 4: Rentabilidad
    model.setRentabilidad(model.getIngresos() - model.getGastos());
  }
  
  
}
