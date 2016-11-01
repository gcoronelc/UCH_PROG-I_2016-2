package pe.egcc.pract02.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class CursoModel {
  
  // Datos
  private String nombre;
  private String categoria;
  private int vacantes;
  // Resultado
  private double costo;
  private double pagoHora;
  private double ingresos;
  public double publicidad;
  private double logistica;
  private double material;
  private double gastos;
  private double rentabilidad;
  private double pagoProfesor;

  public CursoModel() {
  }

  public CursoModel(String nombre, String categoria, int vacantes) {
    this.nombre = nombre;
    this.categoria = categoria;
    this.vacantes = vacantes;
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

  public int getVacantes() {
    return vacantes;
  }

  public void setVacantes(int vacantes) {
    this.vacantes = vacantes;
  }

  public double getCosto() {
    return costo;
  }

  public void setCosto(double costo) {
    this.costo = costo;
  }

  public double getPagoHora() {
    return pagoHora;
  }

  public void setPagoHora(double pagoHora) {
    this.pagoHora = pagoHora;
  }

  public double getIngresos() {
    return ingresos;
  }

  public void setIngresos(double ingresos) {
    this.ingresos = ingresos;
  }

  public double getPublicidad() {
    return publicidad;
  }

  public void setPublicidad(double publicidad) {
    this.publicidad = publicidad;
  }

  public double getLogistica() {
    return logistica;
  }

  public void setLogistica(double logistica) {
    this.logistica = logistica;
  }

  public double getMaterial() {
    return material;
  }

  public void setMaterial(double material) {
    this.material = material;
  }

  public double getGastos() {
    return gastos;
  }

  public void setGastos(double gastos) {
    this.gastos = gastos;
  }

  public double getRentabilidad() {
    return rentabilidad;
  }

  public void setRentabilidad(double rentabilidad) {
    this.rentabilidad = rentabilidad;
  }

  public double getPagoProfesor() {
    return pagoProfesor;
  }

  public void setPagoProfesor(double pagoProfesor) {
    this.pagoProfesor = pagoProfesor;
  }
  
  
}
