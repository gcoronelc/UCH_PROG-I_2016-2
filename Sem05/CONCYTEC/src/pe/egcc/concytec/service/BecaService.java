package pe.egcc.concytec.service;

public class BecaService {

  // Categorias
  private final String CAT_01 = "ESTUDIOS";
  private final String CAT_02 = "TESIS";
  
  // Productos
  private final String PROD_01 = "PREGRADO";
  private final String PROD_02 = "MAESTRIA";
  private final String PROD_03 = "DOCTORADO";
  
  // Productos
  private final String MESES_01 = "6 MESES";
  private final String MESES_02 = "12 MESES";
  private final String MESES_03 = "18 MESES";
  
  public String[] getCategorias(){
    String[] lista = {CAT_01, CAT_02};
    return lista;
  }
  
  public String[] getProductos(){
    String[] lista = {PROD_01, PROD_02, PROD_03};
    return lista;
  }
  
  public String[] getMeses(){
    String[] lista = {MESES_01, MESES_02, MESES_03};
    return lista;
  }
  
  public double getImporte(String cat, String prod){
    double importe = 0.0;
    String key = cat + prod;
    switch(key){
      case CAT_01 + PROD_01:
        importe = 10000;
        break;
      case CAT_01 + PROD_02:
        importe = 15000;
        break;
      case CAT_01 + PROD_03:
        importe = 25000;
        break;
      case CAT_02 + PROD_01:
        importe = 5000;
        break;
      case CAT_02 + PROD_02:
        importe = 8000;
        break;
      case CAT_02 + PROD_03:
        importe = 12000;
        break;
    }
    return importe;
  }
  
}
