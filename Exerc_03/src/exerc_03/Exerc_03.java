package exerc_03;

import javax.swing.JOptionPane;

public class Exerc_03 {
    public static void main(String[] args) {
        // PRINCIPAL CLASSE
        
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESSO" + "\n" 
                 + "Digite 1 para Normal e 2 para VIP"));
        
        
        
         if (num == 1){
            Normal regular = new Normal();
            regular.imprimeNormal();
            
        }else if (num == 2){
            int opc;
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESSO VIP" + "\n" 
                 + "Digite 1 para Camarote Superior" + "\n " 
                    + " OU" + "\n" + 
                    "2 para Camarote Inferior"));
            
            
                        if (opc == 1){
                            CamaroteSuperior upper = new CamaroteSuperior();
                            upper.setAdicional(50);
                            upper.setAdicionalSuperior(50);
                            upper.imprimeValor();
                            
                            
                        } else if (opc == 2){
                            CamaroteInferior down = new CamaroteInferior();
                            down.local = ("Seção B");
                            down.setAdicional(50);
                            down.imprimeValor();
                            
                        }else{
                           System.out.println("Número Inválido");
                        }              
            
        }else{
            System.out.println("Número Inválido");
        }
    }
    
}
