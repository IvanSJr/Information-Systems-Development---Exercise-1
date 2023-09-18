package util;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InsertNumberInList {

    public static List<Integer> insert() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersInsert = new ArrayList<>();

        while (true) {
            System.out.println("Digite um número inteiro ou 'parar' para encerrar:");
            if (scanner.hasNext("parar")) {
                scanner.next();
                return numbersInsert;
            }
            checkIfNumberIsInteger(scanner, numbersInsert);
        }
    }

    private static void checkIfNumberIsInteger(Scanner scanner, List<Integer> numbersInsert) {
        try {
            int number = scanner.nextInt();
            numbersInsert.add(number);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro ou 'parar'.");
            scanner.next();
        }
    }

}
