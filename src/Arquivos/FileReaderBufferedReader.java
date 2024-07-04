package Arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderBufferedReader {
  public static void main(String[] args) {
    String path = new File("src/Arquivos/in.txt").getAbsolutePath();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      while (path != null) {
        System.out.println(path);
        path = br.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}