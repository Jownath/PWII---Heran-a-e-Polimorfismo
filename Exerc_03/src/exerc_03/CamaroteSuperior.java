package exerc_03;
public class CamaroteSuperior extends Vip{
    public double adicionalSuperior;

    public double getAdicionalSuperior() {
        return adicionalSuperior;
    }

    public void setAdicionalSuperior(double adicionalSuperior) {
        this.adicionalSuperior = adicionalSuperior;
        valor = valor + this.adicionalSuperior;
    }
    
    @Override
    public void imprimeValor() {
        System.out.println("Ingresso Vip de Camarote Superior" + "\n" +
                "Adicional de VIP: R$ " + adicional + "\n" +
                "Adicional de Camarote Superior: R$ " + adicionalSuperior + "\n" + 
                "Valor Final: R$ " + valor + "\n" 
                + "Aumento de 100% em Comparação ao Normal");
    }
    
}
