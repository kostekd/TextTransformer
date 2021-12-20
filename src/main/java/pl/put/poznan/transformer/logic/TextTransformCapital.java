package pl.put.poznan.transformer.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextTransformCapital implements TextTransform{
    private final String transforms;

    private static final Logger LOGGER = LoggerFactory.getLogger(TextTransformCapital.class.getName());

    public TextTransformCapital(String transforms) {
        this.transforms = transforms;
    }

    @Override
    public String transform() {
        LOGGER.info("Transform to capital");
        String[] tmpArr = transforms.split(" ");
        LOGGER.debug("Splited word");
        String tmpString = "";
        for(int i=0 ; i< tmpArr.length ; i++){
            tmpString += tmpArr[i].substring(0, 1).toUpperCase() + tmpArr[i].substring(1) + " ";
        }
        LOGGER.debug("return new word");
        return tmpString.substring(0, tmpString.length() - 1);
    }


}
