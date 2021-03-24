package myver;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Texts {
    private File file;
    private String gameName;
    private String introduce;
    private String rosolve;

    public Texts(File file) {
    }

    public void readTexts() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        gameName = scanner.nextLine();
        introduce = scanner.nextLine();
        rosolve = scanner.nextLine();
        scanner.close();
    }
}
