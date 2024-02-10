/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileread2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author EKIN
 */
public class fileread {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\fileread2\\Oğrenci";
        File dosya=new File(path);
        Scanner okuma=new Scanner(dosya);                        // dosya okuma işlemi
        while (okuma.hasNext()){
            String ad=okuma.next();
            String soyad=okuma.next();
            int no=okuma.nextInt();
            System.out.println(ad +" "+ soyad +" "+ no);
        }
        okuma.close();
    }
    
}
