/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaarchivos2;

import javax.swing.JOptionPane;


/**
 *
 * @author SebastianR
 */
public class TareaArchivos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String fileName = "";
    String text = "";
    
    do{
        fileName = JOptionPane.showInputDialog("Ingrese el nombre del archivo");     
        
        } while(fileName.equals (""));
        String nomValido = fileName + ".txt";

    do{
        text = JOptionPane.showInputDialog("Ingrese el texto");        
        } while(text.trim().equalsIgnoreCase(""));
        
        
     archivo a1 = new archivo(fileName);   
     
     a1.setText(text);
     a1.writeFile(nomValido);
     a1.readFile(nomValido);
     
    }
}
        
      