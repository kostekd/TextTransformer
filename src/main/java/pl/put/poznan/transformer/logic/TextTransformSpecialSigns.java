package pl.put.poznan.transformer.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextTransformSpecialSigns implements TextTransform{

    private  String text;
    private static final Logger LOGGER = LoggerFactory.getLogger(TextTransformCapital.class.getName());

    public TextTransformSpecialSigns(String text) {
        this.text = text;
    }


    @Override
    public String transform() {
        LOGGER.info("Special Signs");
        String tmpString = "";
        String[] SpecialSigns = {"$", "&", "@", "#", "%"};
        String[] tmpArr = text.split(" ");
        LOGGER.debug("Looking for special signs");
        for(int i = 0; i< tmpArr.length; i++){
            for(int j = 0; j < SpecialSigns.length; j++){
                if(tmpArr[i].equals(SpecialSigns[j]) || (tmpArr[i]).equals(SpecialSigns[j] + '.') || (tmpArr[i]).equals(SpecialSigns[j] + ',')){
                    LOGGER.debug("Adding \\");
                    tmpArr[i] = "\\" + tmpArr[i];
                }
            }
        }

        for(int i=0 ; i< tmpArr.length ; i++){
            tmpString += tmpArr[i] + " ";
        }


        return tmpString.substring(0, tmpString.length());
    }
}
