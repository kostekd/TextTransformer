package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.put.poznan.transformer.logic.*;
import pl.put.poznan.transformer.rest.TextTransformerController;

import javax.swing.*;
import java.util.Scanner;


@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class TextTransformerApplication {

    public static void main(String[] args) {

        String tekst;
        TextTransform textTransformer;
        int option;
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        SpringApplication.run(TextTransformerApplication.class, args);
        TextTransformerController rest = new TextTransformerController();

        do {
            System.out.println("Podaj napis:");
            tekst = scan.nextLine();
            System.out.println("Podaj co chcesz zrobic:");
            System.out.println("1.Duze litery");
            System.out.println("2.Male litery");
            System.out.println("3.Kapitalizacja");
            System.out.println("4.Skrot");
            System.out.println("5.Rozwiniecie");
            System.out.println("6.Duplikaty");
            System.out.println("7.Znaki specjalne");

            System.out.println("Wybor:");
            option = scanInt.nextInt();
            //Test Test
            switch (option) {

                case 1:
                    textTransformer = new TextTransformUpper(tekst);
                    System.out.println("Rest zwraca-> " + rest.getUpper(tekst, textTransformer));
                    break;

                case 2:
                    textTransformer = new TextTransformLower(tekst);
                    System.out.println("Rest zwraca-> " + rest.getLower(tekst, textTransformer));
                    break;

                case 3:
                    textTransformer = new TextTransformCapital(tekst);
                    System.out.println("Rest zwraca-> " + rest.getCapital(tekst, textTransformer));
                    break;

                case 4:
                    textTransformer = new TextTransformShorts(tekst);
                    System.out.println("Rest zwraca-> " + rest.getShort(tekst, textTransformer));
                    break;

                case 5:
                    textTransformer = new TextTransformExtend(tekst);
                    System.out.println("Rest zwraca-> " + rest.getExtend(tekst, textTransformer));
                    break;

                case 6:
                    textTransformer = new TextTransformEliminateDuplicates(tekst);
                    System.out.println("Rest zwraca-> " + rest.getDuplicates(tekst, textTransformer));
                    break;


                case 7:
                    textTransformer = new TextTransformSpecialSigns(tekst);
                    System.out.println("Rest zwraca-> " + rest.getSpecialSigns(tekst, textTransformer));

            }
        }while(tekst != "koniec");
    }
}
