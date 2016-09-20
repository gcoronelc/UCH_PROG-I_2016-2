package pe.egcc.app.prueba;

import pe.egcc.app.model.Clase1;
import pe.egcc.app.model.Clase2;
import pe.egcc.app.model.Clase3;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    Clase1 a = new Clase2();
    
    Object b = a;
    
    Clase2 c = (Clase2) a;
    
    if(a instanceof Clase3){
      Clase3 d = (Clase3) a;
      System.out.println("Compatible con Clase3");
    } else {
      System.out.println("No compatible con Clase3");
    }
    
    if(Clase3.class.isInstance(a)){
      Clase3 d = (Clase3) a;
      System.out.println("Compatible con Clase3");
    } else {
      System.out.println("No compatible con Clase3");
    }
    
    System.out.println("Chau");
    
  }
  
}
