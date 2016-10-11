package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;

public class Prueba02 {
  
  public static void main(String[] args) {
    Object o = new Clase2();
    
    System.out.println("Con Object: " + (Object.class.isInstance(o)?"SI":"NO"));
    System.out.println("Con Clase1: " + (Clase1.class.isInstance(o)?"SI":"NO"));
    System.out.println("Con Clase2: " + (Clase2.class.isInstance(o)?"SI":"NO"));
    System.out.println("Con Clase3: " + (Clase3.class.isInstance(o)?"SI":"NO"));
    System.out.println("Con Clase4: " + (Clase4.class.isInstance(o)?"SI":"NO"));
    
  }
}
