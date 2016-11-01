package pe.egcc.pract02.prueba;

import pe.egcc.pract02.model.CursoModel;
import pe.egcc.pract02.service.CursoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    CursoModel model = new CursoModel();
    model.setNombre("Spring Framework");
    model.setCategoria(CursoService.CAT_AVANZADO);
    model.setVacantes(20);
    // Proceso
    CursoService service = new CursoService();
    service.procesar(model);
    // Reporte
    System.out.println("Curso: " + model.getNombre());
    System.out.println("Categoría: " + model.getCategoria());
    System.out.println("Vacantes: " + model.getVacantes());
    System.out.println("Ingresos: " + model.getIngresos());
    System.out.println("Gastos: " + model.getGastos());
    System.out.println("    Publicidad: " + model.getPublicidad());
    System.out.println("    Logistica: " + model.getLogistica());
    System.out.println("    Materiales: " + model.getMaterial());
    System.out.println("    Profesor: " + model.getPagoProfesor());
    System.out.println("Rentabilidad: " + model.getRentabilidad());
    
  }
  
}
