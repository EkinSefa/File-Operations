/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileread3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author EKIN
 */
public class fileread {
     public static void main(String[] args) throws IOException {
        String path="C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\fileread2\\Oğrenci";             //  dosya okuma
        Scanner okuma=new Scanner(new File(path));
        String dosyaiçeriği=okuma.useDelimiter("\\A"). next();    // tümünü okuma
        System.out.println(dosyaiçeriği);
        okuma.close();

    }
    
}
