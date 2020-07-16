package exerc_04;
public class Novo extends Imovel{
    public double adicional;
    public double pnovo;
    
    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
        pnovo = preco + this.adicional;
    }

    @Override
    public void impressao(){
        System.out.println("IMÓVEL" + "\n" + 
                "Endereço: " + endereco + "\n" + 
                "Preço Original: R$ " + preco + "\n" + 
                "Adicinal de Novo: R$ " + adicional + "\n" +
                "Preço Final: R$ " + pnovo);
    }
    
}
