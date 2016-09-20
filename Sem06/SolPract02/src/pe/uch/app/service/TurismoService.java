package pe.uch.app.service;

import pe.uch.app.model.Turismo;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class TurismoService {

  // Ciudades
  public final String CIU01 = "CUZCO";
  public final String CIU02 = "AYACUCHO";
  public final String CIU03 = "IQUITOS";
  // Paquetes cuzco 
  public final String PAQ0101 = "Turismo Cultural";
  public final String PAQ0102 = "Turismo Aventurero";
  public final String PAQ0103 = "Turismo Religioso";
  // Paquetes de AYACUCHO
  public final String PAQ0201 = "Turismo Religioso";
  public final String PAQ0202 = "Turismo de Salud";
  public final String PAQ0203 = "Turismo Rural";
  // Paquetes de IQUITOS
  public final String PAQ0301 = "Turismo de Naturaleza";
  public final String PAQ0302 = "Turismo de Diversión";
  public final String PAQ0303 = "Turismo Aventurero";

  public String[] getCiudades() {
    String[] c = {CIU01, CIU02, CIU03};
    return c;
  }
  
  public String[] getPaquetes(String ciudad){
    String p[] = null;
    switch(ciudad){
      case CIU01:
        p = new String[]{PAQ0101,PAQ0102,PAQ0103};
        break;
      case CIU02:
        p = new String[]{PAQ0201,PAQ0202,PAQ0203};
        break;
      case CIU03:
        p = new String[]{PAQ0301,PAQ0302,PAQ0303};
        break;
    }
    return p;
  }
  
  
  public double getPrecio(String ciudad, String paquete){
    double precio = 0.0;
    String clave = ciudad + paquete;
    switch(clave){
      case CIU01 + PAQ0101:
        precio = 1450.0;
        break;
      case CIU01 + PAQ0102:
        precio = 1880.0;
        break;
      case CIU01 + PAQ0103:
        precio = 1260.0;
        break;
      case CIU02 + PAQ0201:
        precio = 1300.0;
        break;
      case CIU02 + PAQ0202:
        precio = 950.0;
        break;
      case CIU02 + PAQ0203:
        precio = 1500.0;
        break;
      case CIU03 + PAQ0301:
        precio = 1450.0;
        break;
      case CIU03 + PAQ0302:
        precio = 1880.0;
        break;
      case CIU03 + PAQ0303:
        precio = 1260.0;
        break;
    }
    return precio;
  }
  
  
  public void procesar(Turismo bean){
    // Variables
    double precio, importe, impuesto, total;
    // Proceso
    precio = getPrecio(bean.getCiudad(), bean.getPaquete());
    total = precio * bean.getPersonas();
    importe = total / 1.18;
    impuesto = total - importe;
    // Reporte
    bean.setPrecio(precio);
    bean.setImporte(importe);
    bean.setImpuesto(impuesto);
    bean.setTotal(total);
  }
  
  

}
