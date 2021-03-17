/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author gatre
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};
        System.out.print("Vetor: [");
        for(int contador = 0; contador<n.length; contador++){
            System.out.print(n[contador]);
            if(contador==n.length-1){
                continue;
            }
            System.out.print(", ");
        }
        System.out.println("]");
        System.out.print("Posições: [");
        for(int contador = 0; contador<n.length; contador++){
            System.out.print(contador);
            if(contador==n.length-1){
                continue;
            }
            System.out.print(", ");
        }
        System.out.println("]");
    }
    
}
