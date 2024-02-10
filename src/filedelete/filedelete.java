/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filedelete;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author EKIN
 */                                                               // dosya silme ,delete isimli dosyayı dilme
public class filedelete {
    public static void delete()throws IOException {
        String path="C:\\Users\\EKIN\\Documents\\NetBeansProjects\\dosya işlemleri\\src\\filedelete\\delete";
        File dosya=new File(path);
        if (dosya.exists()){
            dosya.delete();
            System.out.println(" dosya silindi");
        }
        else{
            System.out.println(" böyle bir dosya yok");
        }


    }
    public static void main(String[] args) throws IOException {
delete();
    }
    
}
