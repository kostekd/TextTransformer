package pl.put.poznan.transformer.logic;

public class TextTransformCapital implements TextTransform{
    private final String transforms;

    public TextTransformCapital(String transforms) {
        this.transforms = transforms;
    }

    @Override
    public String transform() {
        String[] tmpArr = transforms.split(" ");
        String tmpString = "";
        for(int i=0 ; i< tmpArr.length ; i++){
            tmpString += tmpArr[i].substring(0, 1).toUpperCase() + tmpArr[i].substring(1) + " ";
        }
        return tmpString.substring(0, tmpString.length() - 1);
    }
}
