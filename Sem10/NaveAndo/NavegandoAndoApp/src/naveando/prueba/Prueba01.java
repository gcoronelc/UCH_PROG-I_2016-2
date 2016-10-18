package naveando.prueba;

import java.util.List;
import naveando.Model.Item;
import naveando.Service.NaveAndoService;

public class Prueba01 {

  public static void main(String[] args) {
    double consumo = 10.5;
    NaveAndoService service = new NaveAndoService();
    List<Item> lista = service.procesar(consumo);
    for (Item i : lista) {
      System.out.println(i.toString());
    }
  }
  
}
