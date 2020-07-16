package exerc_02a;
public class Cachorro extends Animal{
    
    public void late(){
        System.out.println(" O Cachorro está latindo - (Aauuu aau au) ");
    }
    
    @Override
    public void caminha(){
        System.out.println(" O Cachorro está caminhando ");
    }
    
    @Override
    public String toString() {
        return "Cachorro(a) {" + "nome = " + this.getNome() + " , raca = " + this.getRaca() + '}';
    }
}
