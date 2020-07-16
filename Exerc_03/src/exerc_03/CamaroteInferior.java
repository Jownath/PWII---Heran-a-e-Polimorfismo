package exerc_03;
public class CamaroteInferior extends Vip{
    public String local;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    @Override
    public void imprimeValor() {
        System.out.println("Ingresso Vip de Camarote Inferior" + "\n" +
                "Adicional de VIP: R$ " + adicional + "\n" +
                "Valor Final: R$ " + valor + "\n" 
                + "Aumento de 50% em Comparação ao Normal");
    }
}
