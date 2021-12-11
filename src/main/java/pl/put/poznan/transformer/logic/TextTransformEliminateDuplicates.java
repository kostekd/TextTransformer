package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextTransformEliminateDuplicates implements TextTransform{
    private final String text;

    public TextTransformEliminateDuplicates(String text) {
        this.text = text;
    }

    @Override
    public String transform() {
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
