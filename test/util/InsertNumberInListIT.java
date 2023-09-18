package util;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InsertNumberInListIT {

    @Test
    public void testInsertNumbersOfList() {
        String input = "5\n10\nparar\n";
        ByteArrayInputStream inStream = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        List<Integer> result = InsertNumberInList.insert();

        System.setOut(originalOut);

        assertEquals(Arrays.asList(5, 10), result);
        assertTrue(outStream.toString().contains("Digite um número inteiro ou 'parar' para encerrar:"));
    }

    @Test
    public void testInvalidInput() {
        String input = "abc\n5\nparar\n";
        ByteArrayInputStream inStream = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        List<Integer> result = InsertNumberInList.insert();

        System.setOut(originalOut);

        assertEquals(List.of(5), result);
        assertTrue(outStream.toString().contains("Entrada inválida! Por favor, digite um número inteiro ou 'parar'."));
    }
}
