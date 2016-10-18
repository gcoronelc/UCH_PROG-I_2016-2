package pe.egcc.pagotrabajador.service;

public abstract class Trabajador {
  
  public static final String CARGO_COORDINADOR = "COORDINADOR";
  public static final String CARGO_ASISTENTE = "ASISTENTE";
  public static final String CARGO_SECRETARIA = "SECRETARIA";
  
  public static final double CARGO_COORDINADOR_SUELDO = 5000.0;
  public static final double CARGO_ASISTENTE_SUELDO = 4000.0;
  public static final double CARGO_SECRETARIA_SUELDO = 3000.0;
  
  public static final double DOCENTE_PAGO_HORA = 120.0;
  
  public abstract double calSueldo();
  
  
}
