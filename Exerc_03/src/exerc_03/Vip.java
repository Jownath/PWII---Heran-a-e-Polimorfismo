package exerc_03;
public class Vip extends Ingresso{
    public double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
        valor = valor + this.adicional;
    }
    
    @Override
    public void imprimeValor() {
        System.out.println("Ingresso - {" + "Valor: R$" + valor + '}');
    }
}
