/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filesorting1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author EKIN
 */
public class filesorting {
    
      public static  void liste(){
       String path="C:\\Users\\EKIN\\Desktop\\nesne tabanlı";   //     dosya  açıp içerisne belge yüklersek sıralama gerçekleşir
       File dosya = new File(path);
       try {

           if (!dosya.exists()) {
               dosya.createNewFile();
               System.out.println(" klasör oluşturuldu");

           }
           else {
               System.out.println(" zaten böyle bir klasör var");

           }
           if (!dosya.isFile() ){                  //dosya değil
               File klasor=new File(path);
               String dosyalar[]= klasor.list();
               for (int i=0;dosyalar.length>i;i++){
                   System.out.println(dosyalar[i] );
               }
           }
           else {
               System.out.println(" klasörde dosya yok");
           }

       }
       catch (IOException e){
           e.getMessage();

       }




   }
}
