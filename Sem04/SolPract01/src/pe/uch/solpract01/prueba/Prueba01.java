package pe.uch.solpract01.prueba;

import pe.uch.solpract01.model.Operacion;
import pe.uch.solpract01.service.TarjetaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    TarjetaService service = new TarjetaService();
    
    System.out.println("TN Saldo: " + service.obtenerSaldo(TarjetaService.T_NORMAL));

    Operacion o = new Operacion("N", "C", "O", 100);
    int rpta = service.procesarOperacion(o);
    System.out.println("Rpta: " + rpta);
    
    o = new Operacion("N", "R", "C", 4880);
    rpta = service.procesarOperacion(o);
    System.out.println("Rpta: " + rpta);
    
    System.out.println("TN Saldo: " + service.obtenerSaldo(TarjetaService.T_NORMAL));
    
    for(Operacion x: service.obtenerMovs("N")){
      System.out.println(x.getTipo() + " | " + x.getOrigen() 
              + " | " + x.getImporte());
    }
    
  }
}
