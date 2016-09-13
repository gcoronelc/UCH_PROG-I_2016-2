package pe.egcc.concytec.controller;

import pe.egcc.concytec.service.BecaService;

public class BecaController {
  
  private BecaService service;

  public BecaController() {
    service = new BecaService();
  }
  
  public String[] getCategorias(){
    return service.getCategorias();
  }
  
  public String[] getProductos(){
    return service.getProductos();
  }
  
  public double getImporte(String cate, String prod){
    return service.getImporte(cate, prod);
  }

  public String[] getMeses() {
    return service.getMeses();
  }
  
  
  
}
