/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filenew2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author EKIN
 */
public class filenew {
    public static void main(String[] args) throws IOException {
        String dosya="dosya";
        PrintWriter yazdırma=new PrintWriter(new FileOutputStream(dosya,true));
        Scanner klavye=new Scanner(System.in);                                             // dosyaya sonradan ekleme  yapma
        String cümle=klavye.nextLine();
        yazdırma.print(cümle);
        yazdırma.close();
    }
    
}
