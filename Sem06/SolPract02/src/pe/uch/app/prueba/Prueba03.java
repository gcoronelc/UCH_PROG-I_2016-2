package pe.uch.app.prueba;

import pe.uch.app.model.Turismo;
import pe.uch.app.service.TurismoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    // Variables
    Turismo bean = new Turismo();
    TurismoService service = new TurismoService();
    // Datos
    bean.setCiudad(service.CIU02);
    bean.setPaquete(service.PAQ0202);
    bean.setPersonas(3);
    // Proceso
    service.procesar(bean);
    // Reporte
    System.out.println("Ciudad: " + bean.getCiudad());
    System.out.println("Paquete: " + bean.getPaquete());
    System.out.println("Precio: " + bean.getPrecio());
    System.out.println("Personas: " + bean.getPersonas());
    System.out.println("Importe: " + bean.getImporte());
    System.out.println("Impuesto: " + bean.getImpuesto());
    System.out.println("Total: " + bean.getTotal());

    
  }
  
  
}
