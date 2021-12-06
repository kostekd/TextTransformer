package pl.put.poznan.transformer.logic;

import org.springframework.boot.SpringApplication;
import pl.put.poznan.transformer.app.TextTransformerApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {

    private final String transforms;

    public TextTransformer(String transforms){
        this.transforms = transforms;
    }

    //GET RID OF STATIC FOR REST
    static public String transformUpper(String text){
        // of course, normally it would do something based on the transforms
        return text.toUpperCase();
    }

    public String transformLower(String text){
        return text.toLowerCase();
    }

    public String transformCapital(String text){
        String[] tmpArr = text.split(" ");
        String tmpString = "";
        for(int i=0 ; i< tmpArr.length ; i++){
            tmpString += tmpArr[i].substring(0, 1).toUpperCase() + tmpArr[i].substring(1) + " ";
        }
        return tmpString.substring(0, tmpString.length() - 1);
    }

    public String transformShort(String text){
        String[] tmpArr = text.split(" ");
        String[] shorted = {"np.","itp."};
        String[] extend = {"na przyklad", "i tym podobne"};
        String tmpString = "";

        Pattern p;
        Matcher m;

        for(int j=0 ; j< tmpArr.length ; j++) {
            for (int i = 0; i < shorted.length; i++) {
                p = Pattern.compile(shorted[i]);
                m = p.matcher(tmpArr[j]);
                if(m.find()){
                    tmpArr[j] = extend[i];
                }
            }
        }
        for(int i=0 ; i< tmpArr.length ; i++){
            tmpString += tmpArr[i] + " ";
        }


        return tmpString.substring(0, tmpString.length());
    }

    public String transformExtend(String text){
        String[] shorted = {"np.","itp."};
        String[] extend = {"na przyklad", "i tym podobne"};

        for(int i=0; i< extend.length;i++) {
            String regex = extend[i];
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            while(matcher.find()){

                text = text.substring(0,matcher.start())+shorted[i]+text.substring(matcher.end(),text.length());
                matcher = pattern.matcher(text);
            }
        }
        return text;
    }

    public String eliminateDuplicates(String text){
        String[] tmpArr = text.split(" ");
        List<String> list = Arrays.asList(tmpArr);
        boolean finish = false;
        List<Integer> tmpIdx = new ArrayList<Integer>();
        for(int i = 0; i < list.size()-1;i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                    tmpIdx.add(i);

            }
        }
        String tmpString = "";
        for(int i=0 ; i< tmpArr.length ; i++){
            if(tmpIdx.contains(i)){
                continue;
            }
            else{
                tmpString += tmpArr[i] + " ";
            }

        }

        return tmpString.substring(0, tmpString.length());

    }

}