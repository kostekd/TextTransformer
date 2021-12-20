package pl.put.poznan.transformer.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextTransformShorts implements TextTransform {
    private final String text;
    private static final Logger LOGGER = LoggerFactory.getLogger(TextTransformCapital.class.getName());

    public TextTransformShorts(String text) {
        this.text = text;
    }

    @Override
    public String transform() {
        LOGGER.debug("Shorts words");
        String[] tmpArr = text.split(" ");
        String[] shorted = {"np.","itp.","Np.", "Itp.", "dr", "Dr", "prof.", "Prof.", "itd.", "Itd."};
        String[] extend = {"na przyklad", "i tym podobne","Na przyklad", "I tym podobne", "doktor", "Doktor",
                "profesor", "Profesor", "i tak dalej", "I tak dalej"};
        String tmpString = "";

        Pattern p;
        Matcher m;
        LOGGER.debug("Looking for shorts words");
        for(int j=0 ; j< tmpArr.length ; j++) {
            for (int i = 0; i < shorted.length; i++) {
                p = Pattern.compile(shorted[i]);
                m = p.matcher(tmpArr[j]);
                if(m.find()){
                    LOGGER.debug("Changing shorted to extend words");
                    tmpArr[j] = extend[i];
                }
            }
        }
        for(int i=0 ; i< tmpArr.length ; i++){
            tmpString += tmpArr[i] + " ";
        }


        return tmpString.substring(0, tmpString.length());
    }
}
