package pl.put.poznan.transformer.logic;

public class TextTransformSpecialSigns implements TextTransform{

    private  String text;
    public TextTransformSpecialSigns(String text) {
        this.text = text;
    }
    @Override
    public String transform() {
        String tmpString = "";
        String[] SpecialSigns = {"$", "&"};
        String[] tmpArr = text.split(" ");
        for(int i = 0; i< tmpArr.length; i++){
            for(int j = 0; j < SpecialSigns.length; j++){
                if(tmpArr[i].equals(SpecialSigns[j])){
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
