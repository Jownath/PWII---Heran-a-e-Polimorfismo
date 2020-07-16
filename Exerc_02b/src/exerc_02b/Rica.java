package exerc_02b;
public class Rica extends Pessoa{
    private double dinheiro;

    
    public void fazCompras(){
        System.out.println(" O rico está fazendo compras");
    }
    
    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "Rico{" + "Nome = " + this.getNome() + ", Idade = " + this.getIdade() 
                + ", Dinheiro = US$ " + this.getDinheiro() + '}';
    }
}
