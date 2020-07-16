package exerc_02b;
public class Miseravel extends Pessoa{
    
    
    public void mendiga(){
        System.out.println("O Senhor tem uma esmola ou uns trocados?");
    }
    
    @Override
    public String toString() {
        return "Miserável{" + "Nome = " + this.getNome() + ", Idade = " + this.getIdade() + '}';
    }
}
