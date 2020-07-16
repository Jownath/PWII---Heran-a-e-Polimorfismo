package exerc_04;
public class Imovel {
    // CLASSE-MÃE
    public String endereco = "Rua Novo Parque";
    public double preco = 100000;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void impressao(){
        System.out.println("IMÓVEL" + "\n" + 
                "Endereço: " + endereco + "\n" + 
                "Preço: " + preco);
    }
    
    
}
