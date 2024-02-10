/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filenew1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author EKIN
 */
public class filenew {
     public  static  void dosyakontro()  {

        try {
            File dosya = new File("C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\filenew1\\dosya");
            if (!dosya.exists()) {
                dosya.createNewFile();
                System.out.println(" dosya oluşturuldu");

            }                                                                               // dosya oluşturma
            else {
                System.out.println(" zaten böyle bir dosya var");

            }
        }
        catch (IOException e){
            e.getMessage();

        }
    }


    public static void main(String[] args) {
        dosyakontro();

    }
    
}
