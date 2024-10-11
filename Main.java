package IO;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CopyFile copyFile = new CopyFile();

        System.out.println("Введите путь к файлу: ");
        String fileWay = scanner.nextLine();
        System.out.println("Введите путь, куда скопировать файл:");
        String copyWay = scanner.nextLine();

        copyFile.copyFile(fileWay, copyWay);
    }
}
