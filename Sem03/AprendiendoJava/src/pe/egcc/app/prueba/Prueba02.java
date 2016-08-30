package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    
    List lista = new ArrayList();
    
    lista.add(1234);
    lista.add(234.56);
    lista.add("UCH");
    
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));      
    }
    
    lista.add("Gustavo");
    
    System.out.println("-----------------");
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));      
    }
    
    lista.set(1,10000);
    
    System.out.println("-----------------");
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));      
    }
    
    lista.remove(1);
    
    System.out.println("-----------------");
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));      
    }
  }
}
