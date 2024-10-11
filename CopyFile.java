package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile implements Interface{

   @Override
    public void copyFile(String fileWay, String copyWay) {
       File file = new File(fileWay);
       File copy = new File(copyWay);

       if (!fileExists(fileWay)) {
           System.out.println("Исходный файл не существует!" + fileWay);
           return;
       }

       try {
           FileInputStream fis = new FileInputStream(file);
           FileOutputStream fos = new FileOutputStream(copy);

           byte[] buffer = new byte[1024];
           int length;

           while ((length = fis.read(buffer)) > 0) {
               fos.write(buffer, 0, length);
           }
           System.out.println("Файл успешно скопирован");
       } catch (IOException e) {
           System.err.println("Ошибка при копировании файла!" + e.getMessage());
       }
   }

   @Override
    public boolean fileExists(String path) {
       File file = new File(path);
       return file.exists();
   }
}
