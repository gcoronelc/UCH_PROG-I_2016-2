package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;
import pe.egcc.model.IDemo1;

public class Prueba06 {
  
  public static void main(String[] args) {

    Object o = new Clase2();
    
    Clase1 m = (Clase1) o;

    Clase2 n = (Clase2) m;
    
    
    IDemo1 p = n;
    
  }
}
