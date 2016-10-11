package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;

public class Prueba01 {
  
  public static void main(String[] args) {
    Object o = new Clase2();
    
    System.out.println("Con Object: " + ((o instanceof Object)?"SI":"NO"));
    System.out.println("Con Clase1: " + ((o instanceof Clase1)?"SI":"NO"));
    System.out.println("Con Clase2: " + ((o instanceof Clase2)?"SI":"NO"));
    System.out.println("Con Clase3: " + ((o instanceof Clase3)?"SI":"NO"));
    System.out.println("Con Clase4: " + ((o instanceof Clase4)?"SI":"NO"));
    
  }
}
