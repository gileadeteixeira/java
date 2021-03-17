/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

/**
 *
 * @author gatre
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String totalDias[] = {"31", "28 ou 29", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
        for(int contador = 0; contador<mes.length; contador++){
            System.out.println(mes[contador]+" tem "+totalDias[contador]+" dias!");
        }
    }
    
}
