package exerc_03;
public class Ingresso {
    //Classe Mãe
    public double valor = 100;

    public void imprimeValor() {
        System.out.println("Ingresso - {" + "Valor: R$" + valor + '}');
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
