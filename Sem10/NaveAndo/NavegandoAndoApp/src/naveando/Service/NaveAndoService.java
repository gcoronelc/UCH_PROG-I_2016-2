package naveando.Service;

import java.util.ArrayList;
import java.util.List;
import naveando.Model.Item;

public class NaveAndoService {

  public List<Item> procesar(double consumo) {

    List<Item> lista;
    lista = generaLista();
    distribuirConsumo(lista, consumo);
    calcularSubtotales(lista);
    lista = eliminarFilas(lista);
    calcularTotal(lista);

    return lista;

  }

  private List<Item> generaLista() {
    List<Item> lista = new ArrayList<>();
    lista.add(new Item(1, 4, 10));
    lista.add(new Item(2, 4, 8));
    lista.add(new Item(3, 4, 6));
    lista.add(new Item(4, 4, 4));
    return lista;
  }

  private void distribuirConsumo(List<Item> lista, double consumo) {
    for (Item item : lista) {
      if (consumo <= item.getIntervalo()) {
        item.setConsumo(consumo);
        break;
      } else {
        item.setConsumo(item.getIntervalo());
        consumo -= item.getIntervalo();
      }
    }
  }

  private void calcularSubtotales(List<Item> lista) {
    for (Item item : lista) {
      item.setSubtotal(item.getConsumo() * item.getCosto());
    }
  }

  private List<Item> eliminarFilas(List<Item> lista) {
    List<Item> listax = new ArrayList<>();
    for (Item item : lista) {
      if(item.getSubtotal() > 0){
        listax.add(item);
      }
    }
    return listax;
  }

  private void calcularTotal(List<Item> lista) {
    double total = 0.0;
    for (Item item : lista) {
      total += item.getSubtotal();
    }
    Item i = new Item();
    i.setSubtotal(total);
    lista.add(i);
  }

}
