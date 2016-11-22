package pe.adcb.catalogo.controller;

import java.util.List;
import pe.adcb.catalogo.model.Producto;
import pe.adcb.catalogo.service.ProductoService;

public class ProductoController {

    public List<Producto> obtenerLista(String nombre, String categoria) {
        ProductoService service = new ProductoService();
        return service.getLista(nombre,categoria);
    }

    public void add(Producto bean) {
        ProductoService service = new ProductoService();
        service.add(bean);
    }
}