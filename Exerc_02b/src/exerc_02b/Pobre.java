package exerc_02b;
public class Pobre extends Pessoa{
    
    
    public void trabalha(){
        System.out.println("O pobre está trabalhando");
    }
    
    @Override
    public String toString() {
        return "Pobre{" + "Nome = " + this.getNome() + ", Idade = " + this.getIdade() + '}';
    }
    
}
