/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author gatre
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, soma=0, total=0, pares=0, impares=0, acima = 0;
        int media;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um Número: <br><em>(Valor 0 interompe)</em></html>"));
            soma+=numero;
            total++;
            if(numero%2==0){
                pares++;
            }
            else{
                impares++;
            }
            if(numero>100){
                acima++;
            }
        }while(numero!=0);
        media = soma/total;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr>"
                + "Somatório Vale: "+soma
                + "<br>Total de Valores: "+total
                + "<br>Total de Pares: "+pares
                + "<br>Total de Ímpares: "+impares
                + "<br>Valores Acima de 100: "+acima
                + "<br>Média Final: "+media
                + "</html>");
    }
    
}
