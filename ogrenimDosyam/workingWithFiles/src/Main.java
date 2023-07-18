import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
    }

    //Dosya oluşturmak.
    public static void createFile() {
        File file = new File("E:\\java_demos\\workingWithFiles\\files\\students.txt");
        try {

            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            } else {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Dosya ile çalışmak.
    public static void getFileInfo() {
        File file = new File("E:\\java_demos\\workingWithFiles\\files\\students.txt");
        if (file.exists()) {
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosyanın bellekte bulunduğu yol : " + file.getAbsoluteFile());
            System.out.println("Dosya yazılabilir mi : " + file.canWrite());
            System.out.println("Dosya okunabilir mi : " + file.canRead());
            System.out.println("Dosya boyutu (byte) : " + file.length());
        }
    }

    //Dosyayı okumak.
    public static void readFile() {
        File file = new File("E:\\java_demos\\workingWithFiles\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //Dosyaya veri yazmak.
    public static void writeFile(){
        try {
            BufferedWriter  writer = new BufferedWriter(new FileWriter("E:\\java_demos\\workingWithFiles\\files\\students.txt",true));
            writer.newLine();
            writer.write("Yeni veri");
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


