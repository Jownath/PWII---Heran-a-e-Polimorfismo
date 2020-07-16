package exerc_02b;
public class Exerc_02b {
    public static void main(String[] args) {
        
        Rica rich = new Rica();
        rich.setNome("Daniela");
        rich.setIdade(32);
        rich.setDinheiro(333750);
        System.out.println(rich.toString());
        rich.fazCompras();
        
        System.out.println("----------------------------------");
        
        Pobre poor = new Pobre();
        poor.setNome("Antônio");
        poor.setIdade(47);
        System.out.println(poor.toString());
        poor.trabalha();
        
        System.out.println("----------------------------------");
        
        Miseravel miserable = new Miseravel();
        miserable.setNome("Cleisson");
        miserable.setIdade(26);
        System.out.println(miserable.toString());
        miserable.mendiga();
        
        System.out.println("----------------------------------");
        
        Pessoa people = new Pessoa();
        people.setNome("Maria");
        people.setIdade(19);
        System.out.println(people.toString());
       
   }
    
}
