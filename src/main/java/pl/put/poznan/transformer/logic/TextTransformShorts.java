package pl.put.poznan.transformer.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextTransformShorts implements TextTransform {
    private final String text;

    public TextTransformShorts(String text) {
        this.text = text;
    }

    @Override
    public String transform() {
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
}
