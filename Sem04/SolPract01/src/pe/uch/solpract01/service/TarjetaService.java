package pe.uch.solpract01.service;

import java.util.List;
import pe.uch.solpract01.model.Operacion;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class TarjetaService {
  
  // Tipo tarjeta
  public static final String T_NORMAL = "N";
  public static final String T_PREMIUM = "P";
  // Tipo Operación
  public static final String O_CONSUMO = "C";
  public static final String O_RETIRO = "R";
  // Origen de Operación
  public static final String O_CAJERO = "C";
  public static final String O_VENTANILLA = "V";
  public static final String O_OTRO = "O";
  
  /**
   * 
   * @param operacion
   * @return 1: Proceso ok  -1: Error en el proceso
   */
  public int procesarOperacion(Operacion operacion){
    int rpta = 1;
    double costoOpera = 0.0;
    Operacion costo = null;
    String clave = operacion.getTarjeta() + operacion.getTipo() ;
    // Verificar tipo de tarjeta
    if(!operacion.getTarjeta().equals(T_NORMAL) 
            && !operacion.getTarjeta().equals(T_PREMIUM)){
      return -1;
    }
    // Condición 1: El consumo se realiza por ejemplo en tienda
    if(operacion.getTipo().equals(O_CONSUMO) 
            && !operacion.getOrigen().equals(O_OTRO)){
      rpta = -1;
    }
    // Retiro en efectivo solo es por cajero para TN
    if(clave.equals("NR") && !operacion.getOrigen().equals(O_CAJERO)){
      rpta = -1;
    }
    // Retiro en efectivo solo en cajero o ventanilla pora TP
    if(clave.equals("PR") && operacion.getOrigen().equals(O_OTRO)){
      rpta = -1;
    }
    // Costo de Operación
    if(operacion.getTipo().equals(O_RETIRO)){
      if(operacion.getTarjeta().equals(T_NORMAL)){
        costoOpera = 20.0;
        costo = new Operacion(T_NORMAL, O_RETIRO, O_OTRO, costoOpera);
      } else {
        costoOpera = 10.0;
        costo = new Operacion(T_PREMIUM, O_RETIRO, O_OTRO, costoOpera);
      }
    }
    // Verificar Saldo
    double total = costoOpera + operacion.getImporte();
    if(operacion.getTarjeta().equals(T_NORMAL)){
      if( total > Data.saldoTN){
        rpta = -1;
      }
    } else {
      if(total > Data.saldoTP){
        rpta = -1;
      }
    }
    if(rpta == -1){
      return rpta;
    }
    // Registrar Operación
    if(operacion.getTarjeta().equals(T_NORMAL)){
      Data.movTN.add(operacion);
      Data.saldoTN -= (operacion.getImporte() + costoOpera);
      if(costo != null){
        Data.movTN.add(costo);
      }
    } else {
      Data.movTP.add(operacion);
      Data.saldoTP -= (operacion.getImporte() + costoOpera);
      if(costo != null){
        Data.movTP.add(costo);
      }
    }
    return 1;
  }
  
  public double obtenerSaldo(String tarjeta){
    double saldo = 0;
    if(tarjeta.equals(T_NORMAL)){
      saldo = Data.saldoTN;
    } else if(tarjeta.equals(T_PREMIUM)){
      saldo = Data.saldoTP;
    }
    return saldo;
  }
  
  
  public List<Operacion> obtenerMovs(String tarjeta){
    List<Operacion> lista = null;
    if(tarjeta.equals(T_NORMAL)){
      lista = Data.movTN;
    } else if(tarjeta.equals(T_PREMIUM)){
      lista = Data.movTP;
    }
    return lista;
  }
  
  
}
