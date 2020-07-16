package exerc_04;
public class Velho extends Imovel{
    public double desconto;
    public double pvelho;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
        pvelho = this.preco - this.desconto;
    }

    @Override
    public void impressao(){
        System.out.println("IMÓVEL" + "\n" + 
                "Endereço: " + endereco + "\n" + 
                "Preço Original: R$ " + preco + "\n" + 
                "Desconto de Velho: R$ " + desconto + "\n" +
                "Preço Final: R$ " + pvelho);
    }
 
}
