/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filesorting2;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author EKIN
 */
public class filesorting {
    public static void liste() throws IOException {
        String path = "C:\\Users\\EKIN\\Desktop\\nesne tabanlı";           // konuma dosya koyarsak  dosyaları sıralar
        File dosya = new File(path);
        if (dosya.isDirectory()) {
            File dosyalar[] = dosya.listFiles();
            for (int i = 0; dosyalar.length > i; i++) {
                System.out.println(dosyalar[i].getName());
            }

        }
        else {
            System.out.println(" klasörde dosya yok");
        }
    }

    public static void main(String[] args) throws IOException {
liste();
    }
    
}
