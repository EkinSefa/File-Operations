/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileread1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class read1 {
    
     public void okuma(String dosya) throws IOException {


        File f=new File(dosya);
        Scanner oku=new Scanner(f);
        for(int i=0;3>i;i++){
            int not1=0;
            int not2=0;
            String isim=oku.nextLine();
            for (int j=0;2>j;j++){
                not1=oku.nextInt();
                not2=oku.nextInt();
            }
            double ortalama= (not1+not2) / 2.0;
            System.out.println("öğrenci  adı " + isim + " ortalama =" + ortalama );
            oku.nextLine();
        }

        }
    
                                                                           // satır işlemleri devam etmeli 
     public static void main(String[] args) throws IOException {
        read1 ok =new read1();                                                            
        ok.okuma("C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\fıleread1\\notlar");
    }
}
