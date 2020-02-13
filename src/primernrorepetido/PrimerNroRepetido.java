/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primernrorepetido;

/**
 *
 * @author redes1
 */
public class PrimerNroRepetido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] repetidosArray=new Integer[]{3,5,7,3,6,8,1,3,4,5};
        
       int NroRepetido=repetidosArray.length;
       
        for (int i=0; i < NroRepetido; i++) {
            boolean repetido=false;
            System.out.println(repetidosArray[i]);
            
            for (int j = 0; j < NroRepetido; j++) {
                
                if (repetidosArray[i]== repetidosArray[j] && j!=i) {
                    repetido=true;
                   // System.out.println("Es repetido "+ repetidosArray[i]+" en la posicion "+j );
                   
                    break; 
                }
               
            }
            if (!repetido) {
                System.out.println("no es repetido "+ repetidosArray[i]+" en la posicion "+i);
              break;
            }
          
        }
        
    }
    
}
