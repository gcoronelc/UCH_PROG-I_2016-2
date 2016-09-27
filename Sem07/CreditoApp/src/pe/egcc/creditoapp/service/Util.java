package pe.egcc.creditoapp.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Util {
  
  public static double redondear(double valor){
    valor *= 100.0;
    valor = Math.rint(valor) / 100.0;
    return valor;
  }
}
