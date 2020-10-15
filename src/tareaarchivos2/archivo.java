/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaarchivos2;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SebastianR
 */
public class archivo {
    
      
    //private int i;
    private String fileName, text;

    
    public archivo() {
    }
    public archivo(String fileName) {
        this.fileName = fileName;
    }

    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getFileName() {
        return fileName;
    }
    public String getText() {
        return text;
    }

    

           
 public void writeFile(String nomValido){   
             
          File f = new File(nomValido);    
    try  {
            //String nomValido = fileName + ".txt";
            FileWriter fw=new FileWriter(f);
            PrintWriter pw=new PrintWriter(fw);
            pw.print(getText());
            
    fw.close();
    JOptionPane.showMessageDialog(null, "ARCHIVO CREADO.");

         }  
     catch(IOException e) {
         JOptionPane.showMessageDialog(null, "Se produjo un error", "Error", JOptionPane.ERROR_MESSAGE);
         }       
      }   
 
 public void readFile( String nomValido){
 
            File f = new File(nomValido);    
     try{
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            while(linea!=null)
            {
                System.out.println(linea); 
                linea=br.readLine();
                 
            
         }
            fr.close();
      }
      catch(IOException e){
                JOptionPane.showMessageDialog(null, "Se produjo un error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
         }
       } 
     }
   

