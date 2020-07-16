package exerc_02a;
public class Gato extends Animal{
    
    public void mia(){
        System.out.println(" O Gato está miando - (Miiauu) ");
    }
    
    @Override
    public void caminha(){
        System.out.println(" O Gato está caminhando ");
    }
    
    @Override
    public String toString() {
        return "Gato(a) {" + "nome = " + this.getNome() + " , raca = " + this.getRaca() + '}';
    }
}
