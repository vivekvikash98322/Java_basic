package com.java.basic.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.common.io.Files;

public class ExceptionHandling_3 {
    

    public static void main(String[] args) throws URISyntaxException {
        ExceptionHandling_3 exceptionHandling_3 = new ExceptionHandling_3();
        exceptionHandling_3.readFile();
    }

    public void readFile() throws URISyntaxException  {

        Path path = Paths.get(this.getClass().getClassLoader().getResource("ExceptionTestFile.txt").toURI());;
        try (FileReader fr = new FileReader(path.toFile());
	         BufferedReader br = new BufferedReader(fr)) {
	        System.out.println(br.readLine());
	    }catch(IOException ioException){
            System.out.println("This is come");
        }
    }
}
