package sobrecarga;

public class CalculadoraDistanciaPonto{
  public double CalculadoraDistanciaPonto(double x1, double x2, double y1, double y2){
    return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
  }
  public double calculadoraDistanciaPonto(double x1, double x2, double y1, double z1, double y2, double z2){
    return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)+Math.pow(z2-z1,2));
  }
