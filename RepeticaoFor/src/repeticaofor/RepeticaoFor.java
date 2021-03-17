/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author gatre
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int x=0; x<4; x++){
            for(int y=0; y<4; y++){
                System.out.println("(X,Y)= ("+x+","+y+")");
            }
        }
        /*
        int cc=0;
        while(cc<4){
            System.out.println("Cambalhota");
            cc++;
        }
        
        do{
            System.out.println("Cambalhota");
            cc++
        }while(cc<4);
        
        */
    }
    
}
