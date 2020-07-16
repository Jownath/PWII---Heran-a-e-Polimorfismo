package exerc_04;
import javax.swing.JOptionPane;
public class Exerc_04 {
    public static void main(String[] args) {     
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 1 para novo e 2 para velho"));
        
              
        if (num == 1){
            Novo young = new Novo();
            young.setAdicional(45000);
            young.impressao();
            
        }else if (num == 2){
            Velho old = new Velho();
            old.setDesconto(30000);
            old.impressao();
            
        }else{
            System.out.println("Número Inválido");
        }
    }
    
}
