package pe.adcb.catalogo.model;

public class Producto {

    private int idProducto;
    private String nombre;
    private String categoria;
    private int precio;
    private int precioMayor;
    private int stock;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, String categoria, int precio, int precioMayor, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.precioMayor = precioMayor;
        this.stock = stock;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecioMayor() {
        return precioMayor;
    }

    public void setPrecioMayor(int precioMayor) {
        this.precioMayor = precioMayor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}