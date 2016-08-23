package pe.egcc.prueba;

import pe.egcc.model.Producto;

public class Prueba05 {

  public static void main(String[] args) {
    
    Producto bean = new Producto();
    
    System.out.println("Nombre: " + bean.getNombre());
    System.out.println("Precio: " + bean.getPrecio());
    System.out.println("Stock: " + bean.getStock());
    System.out.println("Activo: " + bean.isActivo());
    
    bean.setNombre("Coca Cola");
    bean.setPrecio(3.50);
    bean.setStock(100);
    bean.setActivo(true);
    
    System.out.println("-------------------");
    System.out.println("Nombre: " + bean.getNombre());
    System.out.println("Precio: " + bean.getPrecio());
    System.out.println("Stock: " + bean.getStock());
    System.out.println("Activo: " + bean.isActivo());
    
    
    
  }
  
}
