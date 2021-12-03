package pl.put.poznan.transformer.logic;

import org.springframework.boot.SpringApplication;
import pl.put.poznan.transformer.app.TextTransformerApplication;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {

    private final String[] transforms;

    public TextTransformer(String[] transforms){
        this.transforms = transforms;
    }

    //GET RID OF STATIC FOR REST
    static public String transformUpper(String text){
        // of course, normally it would do something based on the transforms
        return text.toUpperCase();
    }

    static public String transformLower(String text){
        return text.toLowerCase();
    }

    static public String transformCapital(String text){
        String[] tmpArr = text.split(" ");
        String tmpString = "";
        for(int i=0 ; i< tmpArr.length ; i++){
            tmpString += tmpArr[i].substring(0, 1).toUpperCase() + tmpArr[i].substring(1) + " ";
        }
        return tmpString.substring(0, tmpString.length() - 1);
    }


    //REMEMBER TO DELETE IT
    public static void main(String[] args) {
        String sample = "here are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. " +
                "If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. " +
                "All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. " +
                "The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";


        System.out.println("Upper -> " + transformUpper(sample));
        System.out.println("Lower ->)" + transformLower(sample));
        System.out.println("Capitalize ->" + transformCapital(sample));
    }
}