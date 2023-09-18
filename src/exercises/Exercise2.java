package exercises;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        List<String> fileNames = insertFiles();
        printOutSizeOfFiles(fileNames);
    }

    private static void printOutSizeOfFiles(List<String> fileNames) {
        System.out.println("Tamanhos dos arquivos:");
        for (String name : fileNames) {
            printFileNameAndSize(name);
        }
    }

    private static List<String> insertFiles() {
        Scanner scanner = new Scanner(System.in);
        List<String> fileNames = new ArrayList<>();

        System.out.println("Digite os nomes dos arquivos, e 'parar' para finalizar:");

        while (true) {
            String fileName = scanner.nextLine();

            if ("parar".equalsIgnoreCase(fileName)) {
                break;
            }

            fileNames.add(fileName);
        }
        return fileNames;
    }

    private static void printFileNameAndSize(String fileName) {
        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            long sizeInBytes = file.length();
            System.out.printf("Tamanho do arquivo %s: %d bytes%n", fileName, sizeInBytes);
        } else {
            System.out.printf("O arquivo %s não foi encontrado.%n", fileName);
        }
    }

}
