/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileread4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author EKIN
 */
public class fileread {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\fileread2\\Oğrenci";
        BufferedReader okuma=new BufferedReader(new FileReader(path));
        int sayaç=0;
        String satır=null;
        satır= okuma.readLine();

        while (satır!=null){                                      // Satır Satır Okuma  
            sayaç++;
            System.out.println("/" +satır + "/");
            satır=okuma.readLine();
        }

           okuma.close();

    }
    
}
