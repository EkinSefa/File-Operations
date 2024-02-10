/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileorprint1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author EKIN
 */
public class fileprint {
   
    
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\fileorprint1\\ögrenci";
        File dosya = new File(path);
        PrintWriter yazdırma = null;

        if (!dosya.exists()) {                         // dosya var mı
            dosya.createNewFile();                    // dosya oluştur
            System.out.println("dosya oluşturuldu");
        } else {
            yazdırma = new PrintWriter(dosya);          // eğer varsa  yazdır
        }
        Scanner kılavye = new Scanner(System.in);
        for (int i = 1; 4 > i; i++) {
            System.out.println(i + " öğrenci adı soyadı numarası tc");
            String ad = kılavye.next();
            String soyad = kılavye.next();
            int numara = kılavye.nextInt();
            int tc=kılavye.nextInt();
            yazdırma.println(ad + " " + soyad + " " + numara +" " +tc);

        }
        yazdırma.close();
                                                        // 3 öğrenci  dosyaya yazdırma 

    }
}
