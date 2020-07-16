package exerc_01;
public class Funcionario {
    public String nome;
    public int matricula;
    public double salario = 1000;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void Imprime() {
        System.out.println(" FUNCIONÁRIO COMUM \n"
                + "Nome: " + nome + "\n"
                + "Matricula: " + matricula + "\n"
                + "Salário: " + salario);
    }
}
