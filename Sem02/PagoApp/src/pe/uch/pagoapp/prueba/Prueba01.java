package pe.uch.pagoapp.prueba;

import pe.uch.pagoapp.dto.PagoDto;
import pe.uch.pagoapp.service.PagoService;

public class Prueba01 {


  public static void main(String[] args) {
    // Datos
    PagoDto dto = new PagoDto();
    dto.setDiasTrab(20);
    dto.setHorasDia(6);
    dto.setPagoHora(120.0);
    // Proceso
    PagoService service = new PagoService();
    service.procesar(dto);
    // Reporte
    System.out.println("Ingresos: " + dto.getIngresos());
    System.out.println("Renta: " + dto.getRenta());
    System.out.println("Neto: " + dto.getNeto());
  }
  
}
