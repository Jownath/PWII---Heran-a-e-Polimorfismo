package exerc_02a;
public class Exerc_02a {
    public static void main(String[] args) {
        // CLASSE PRINCIPAL
        
        Cachorro dog = new Cachorro();
        dog.setNome("Derik");
        dog.setRaca("Rottweiler");
        System.out.println(dog.toString());
        dog.late();
        dog.caminha();
        
        Gato cat = new Gato();
        cat.setNome("Luxor");
        cat.setRaca("Sphynx");
        System.out.println(cat.toString());
        cat.mia();
        cat.caminha();
        
        Animal dinossauro = new Animal();
        dinossauro.setNome("Xapuri");
        dinossauro.setRaca("Stegossaurus");
        System.out.println(dinossauro.toString());
        dinossauro.caminha();
    }
    
}
