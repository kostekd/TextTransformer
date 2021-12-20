package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Klasa TextTransformDuplicates służy do eliminacji znajdujących się koło siebie identycznych
 * słów. TextTransformDuplicates implementuje interfejs TextTransform.
 * Na przykład gdy na wejściu pojawi się tekst "inzynieria inzynieria oprogramowania oprogramowania"
 * to na wyjściu otrzymamy tekst "inzynieria oprogramowania".
 *
 *
 * @version 1.0
 */
public class TextTransformEliminateDuplicates implements TextTransform{
    private final String text;
    /**
     *
     *Konstruktur klasy przyjmuje tekst w którym mają zostać usunięte duplikaty.
     * @param text wejsciowy tekst
     *
     *
     */
    public TextTransformEliminateDuplicates(String text) {
        this.text = text;
    }
    /**
     * @return zwraca tekst z usuniętymi znajdującymi się koło siebie identycznymi słowami
     */
    @Override
    public String transform() {
        String[] tmpArr = text.split(" ");
        List<String> list = Arrays.asList(tmpArr);
        boolean finish = false;
        List<Integer> tmpIdx = new ArrayList<Integer>();
        String tmpDot = "";
        String tmpCom = "";
        String tmpNormal ="";
        for(int i = 0; i < list.size()-1;i++) {
            tmpDot = list.get(i) + '.';
            tmpCom = list.get(i) + ',';
            tmpNormal = list.get(i);
            if (tmpNormal.equals(list.get(i + 1)) || tmpDot.equals(list.get(i + 1)) || tmpCom.equals(list.get(i + 1))) {
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
