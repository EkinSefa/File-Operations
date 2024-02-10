
package filereadwrite1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class readwrite1 {
     public static void main(String[] args) throws IOException {
        String path="C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\dosya\\işlemleri\\filereadwrite1\\input.txt";

        File d1=new File("C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\dosya\\işlemleri\\filereadwrite1\\integer.txt");
        File d2=new File("C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\dosya\\işlemleri\\filereadwrite1\\double.txt");
        BufferedWriter b1=new BufferedWriter(new FileWriter(d1));
        BufferedWriter b2=new BufferedWriter(new FileWriter(d2));

        File dosya=new File(path);
        Scanner okuma=new Scanner(dosya);
        while(okuma.hasNext()){
            int sayı1=okuma.nextInt();
            double sayı2=Double.parseDouble(okuma.next());
            System.out.println(sayı1 +" " + sayı2 );
              b1.write(String.valueOf(sayı1));
              b2.write(String.valueOf(sayı2));
        }



      b1.close();
      b2.close();


    }
    
}
