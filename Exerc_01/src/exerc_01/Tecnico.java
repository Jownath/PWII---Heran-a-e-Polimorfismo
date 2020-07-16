package exerc_01;
public class Tecnico extends Assistente{
    double bonusDeSalario;

        
    public void bonusSalarial (){
        bonusDeSalario = salario * 0.15;
        bonusDeSalario = bonusDeSalario + salario;
    }
    
    @Override
    public void Imprime() {
        System.out.println(" ASSISTENTE TÉCNICO \n"
                + "Nome: " + nome + "\n"
                + "Matricula: " + matricula + "\n"
                + "Salário: " + bonusDeSalario  + "\n"
                + "BONUS DE 15% NO SALÁRIO");
    }
    
}
