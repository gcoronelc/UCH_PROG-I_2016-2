package pe.egcc.model;

public class Clase2 extends Clase1 implements IDemo3{

  @Override
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }
  
  public int restar(int n1, int n2){
    return (n1 - n2);
  }
}
