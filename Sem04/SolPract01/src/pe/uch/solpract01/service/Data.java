package pe.uch.solpract01.service;

import java.util.ArrayList;
import java.util.List;
import pe.uch.solpract01.model.Operacion;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public final class Data {

  private Data() {
  }
  
  static double saldoTN;
  static double saldoTP;
  
  static List<Operacion> movTN;
  static List<Operacion> movTP;
  
  static {
    saldoTN = 5000.0;
    saldoTP = 10000.0;
    movTN = new ArrayList<>();
    movTP = new ArrayList<>();
  }
  
}
