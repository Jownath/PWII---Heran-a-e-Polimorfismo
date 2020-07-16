package exerc_01;
public class Assistente extends Funcionario{

    @Override
    public void Imprime() {
        System.out.println(" FUNCIONÁRIO ASSISTENTE \n"
                + "Nome: " + nome + "\n"
                + "Matricula: " + matricula + "\n"
                + "Salário: " + salario);
    }
    
}
