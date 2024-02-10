
package filereadwrite2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class readwrite {
    
public static void main(String[] args) {


        try {

            File f1 = new File("C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\filereadwrite2\\not1.txt");
            File f2 = new File("C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\filereadwrite2\\not2.txt");
            Scanner scanner = new Scanner(f1);
            BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
            while (scanner.hasNextLine()){
                bw.write(scanner.next() + "\t");
                double not1=Double.parseDouble((scanner.next()));
                double not2=Double.parseDouble(scanner.next());
                bw.write(String.valueOf(not1) + "\t");
                bw.write(String.valueOf(not2) + "\t");
                bw.write(String.valueOf((not1 + not2)/2));
                bw.newLine();
            }
            scanner.close();
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

}
     
            
        
    
    

