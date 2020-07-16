package exerc_01;
public class Exerc_01 {
    public static void main(String[] args) {
        //CLASSE PRINCIPAL
        
        Funcionario employee = new Funcionario();
        employee.setNome("Alex");
        employee.setMatricula(1);
        employee.Imprime();
        
        System.out.println("--------------------------");
        
        Assistente assistant = new Assistente();
        assistant.setNome("Laura");
        assistant.setMatricula(2);
        assistant.Imprime();
        
        System.out.println("--------------------------");
        
        Tecnico tecnical = new Tecnico();
        tecnical.setNome("Junin");
        tecnical.setMatricula(3);
        tecnical.bonusSalarial();
        tecnical.Imprime();
        
        System.out.println("--------------------------");
        
        Administrativo administrativeone = new Administrativo();
        administrativeone.setNome("Marta");
        administrativeone.setMatricula(4);
        administrativeone.setTurno("DIURNO"); // NOTURNO ou DIURNO
        administrativeone.adicionalNoturno();
        administrativeone.Imprime();
        
        System.out.println("--------------------------");

        Administrativo administrativetwo = new Administrativo();
        administrativetwo.setNome("Marta");
        administrativetwo.setMatricula(4);
        administrativetwo.setTurno("NOTURNO"); // NOTURNO OU DIURNO
        administrativetwo.adicionalNoturno();
        administrativetwo.Imprime();
        

    }
    
}
