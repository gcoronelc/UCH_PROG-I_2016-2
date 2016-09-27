package pe.egcc.creditoapp.service;

import pe.egcc.creditoapp.model.Credito;
import pe.egcc.creditoapp.model.Item;
import pe.egcc.creditoapp.model.Tipo;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class CreditoService {
  
  public Tipo[] getTipos(){
    Tipo[] tipos = {
      new Tipo("A", "Persona Natural", 5, 6, 36),
      new Tipo("B", "Persona Juridica", 3, 12, 48)
    };
    return tipos;
  }
  
  
  public Credito procesar(String codigo, int meses, double capital){
    Credito credito = new Credito();
    Tipo tipo = getTipo(codigo);
    validar(tipo,meses,capital);
    credito.setCodigo(tipo.getCodigo());
    credito.setDescripcion(tipo.getDescripcion());
    credito.setCapital(capital);
    credito.setInteres(tipo.getInteres());
    credito.setMeses(meses);
    generarLista(credito);
    calcularCapital(credito);
    calcularInteres(credito);
    calcularTotal(credito);
    return credito;
  }

  private Tipo getTipo(String codigo) {
    Tipo tipo = null;
    for(Tipo t: getTipos()){
      if(t.getCodigo().equals(codigo)){
        tipo = t;
        break;
      }
    }
    return tipo;
  }

  private void validar(Tipo tipo, int meses, double capital) {
    if( tipo == null){
      throw new RuntimeException("Tipo no existe.");
    }
    if( capital <= 0.0){
      throw new RuntimeException("Capital no puede ser negativo.");
    }
    if( meses < tipo.getMinMeses() || meses > tipo.getMaxMeses()){
      throw new RuntimeException("Tiempo del credito no es correcto.");
    }
  }

  private void generarLista(Credito credito) {
    for (int i = 1; i <= credito.getMeses(); i++) {
      credito.getCuotas().add(new Item(i, 0, 0, 0));
    }
  }

  private void calcularCapital(Credito credito) {
    double capital = Util.redondear(credito.getCapital() / credito.getMeses());
    for(Item i: credito.getCuotas()){
      i.setCapital(capital);
    }
    double UltimoCapital = credito.getCapital() 
            - capital * (credito.getCuotas().size() - 1);
    UltimoCapital = Util.redondear(UltimoCapital);
    credito.getCuotas().get(credito.getCuotas().size() - 1).setCapital(UltimoCapital);
  }

  private void calcularInteres(Credito credito) {
    double capital = credito.getCapital();
    for(Item i: credito.getCuotas()){
      double interes = Util.redondear(capital * credito.getInteres() / 100);
      i.setInteres(interes);
      capital -= i.getCapital();
    }
  }

  private void calcularTotal(Credito credito) {
    for(Item i: credito.getCuotas()){
      i.setTotal(i.getCapital() + i.getInteres());
    }
  }
  
}
