package exerc_01;
public class Administrativo extends Assistente{
    String turno;
    double adicionalDaNoite;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void adicionalNoturno(){
        if (turno == "DIURNO"){
            adicionalDaNoite = salario;
        } else if (turno == "NOTURNO"){
            adicionalDaNoite = salario + (salario * 0.3);
        }      
    }
    
    @Override
    public void Imprime() {
        System.out.println(" ASSISTENTE ADMINISTRATIVO \n"
                + "Nome: " + nome + "\n"
                + "Matricula: " + matricula + "\n"
                + "Salário: " +  adicionalDaNoite + "\n"
                + "Turno: " + turno + "\n"
                + "SE TURNO NOTURNO AUMENTO DE 30%");
    }

}
