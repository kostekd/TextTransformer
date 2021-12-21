package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.put.poznan.transformer.logic.*;
import pl.put.poznan.transformer.rest.TextTransformerController;

import java.sql.SQLOutput;
import java.util.Scanner;


@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class TextTransformerApplication {

    public static void main(String[] args) {

        String tekst;
        TextTransform textTransformer;
        int option;
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        ConfigurableApplicationContext ctx = SpringApplication.run(TextTransformerApplication.class, args);
        TextTransformerController rest = new TextTransformerController();

        do {
            System.out.println("\nJeśli chcesz zakończyć działanie programu wpisz 'koniec'");
            System.out.println("Podaj napis:");
            tekst = scan.nextLine();
            if(!tekst.equals("koniec")) {
                System.out.println("Podaj co chcesz zrobic:");
                System.out.println("1.Zmien napis na duze litery");
                System.out.println("2.Zmien napis na male litery");
                System.out.println("3.Dokonaj kapitalizacji slow");
                System.out.println("4.Rozwin skroty");
                System.out.println("5.Zwim do skrotu");
                System.out.println("6.Wyeliminuj duplikaty");
                System.out.println("7.Oznacz znaki speclajne do LateX'a");

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
                        break;
                    default:
                        System.out.println("Nie ma takiego rozwiązania");
                        break;
                }
            }
        }while(!tekst.equals("koniec"));


        System.out.println("Aplikacja zostanie zamknięta...");
        ctx.close();
    }
}
