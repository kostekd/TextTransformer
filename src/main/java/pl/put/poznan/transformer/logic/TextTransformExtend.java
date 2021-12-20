package pl.put.poznan.transformer.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextTransformExtend implements TextTransform {
    private  String text;

    public TextTransformExtend(String text) {
        this.text = text;
    }

    @Override
    public String transform() {
        String[] shorted = {"np.","itp.","Np.", "Itp.", "dr", "Dr", "prof.", "Prof.", "itd.", "Itd."};
        String[] extend = {"na przyklad", "i tym podobne","Na przyklad", "I tym podobne", "doktor", "Doktor",
                "profesor", "Profesor", "i tak dalej", "I tak dalej"};

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
}
