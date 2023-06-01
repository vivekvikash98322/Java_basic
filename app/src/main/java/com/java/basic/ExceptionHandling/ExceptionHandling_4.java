package com.java.basic.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;

public class ExceptionHandling_4 {

    /**
     * This method will help to you to understand exception chaining.
     * 
     * @param args
     */
    public static void main(String[] args) {

        ExceptionHandling_4 exceptionHandling_4 = new ExceptionHandling_4();
        int value = 0;
        try {
            value = exceptionHandling_4.readFile();
        } catch (URISyntaxException | NullPointerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        int z = 20 / value;

    }

    public int readFile() throws URISyntaxException {
        int value = 0;
        Path path = Path.of("");

        try (FileReader fr = new FileReader(path.toFile());
                BufferedReader br = new BufferedReader(fr)) {
            return Integer.parseInt(br.readLine());
        } catch (IOException ioException) {
            System.out.println("This is come");
        }
        return value;
    }
}
