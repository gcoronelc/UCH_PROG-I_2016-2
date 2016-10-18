package naveando.Service;

public class Util {
    public static double redondear(double valor){
    valor *= 100.0;
    valor = Math.rint(valor) / 100.0;
    return valor;
  }
}
