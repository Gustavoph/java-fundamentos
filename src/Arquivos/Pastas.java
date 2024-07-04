package Arquivos;

import java.io.File;

public class Pastas {
  public static void main(String[] args) {
    File path = new File(new File("src/Arquivos").getAbsolutePath());
    File[] folders = path.listFiles(File::isDirectory);
    System.out.println("FOLDERS:");
    
    for (File folder : folders) {
      System.out.println(folder);
    }
    
    File[] files = path.listFiles(File::isFile);
    System.out.println("FILES:");
    for (File file : files) {
      System.out.println(file);
    }
    
    boolean success = new File(path + "\\subdir").mkdir();
    System.out.println("Directory created successfully: " + success);
  }
}
