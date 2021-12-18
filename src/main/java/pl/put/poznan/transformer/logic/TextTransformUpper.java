package pl.put.poznan.transformer.logic;
/**
 * Klasa TextTransformUpper służy do zamiany wszystkich liter z małych na duże.
 * TextTransformUpper implementuje interfejs TextTransform.
 * Na przykład gdy na wejściu pojawi się tekst "inzynieria oprogramowania" na
 * wyjściu otrzymamy tekst "INZYNIERIA OPROGRAMOWANIA".
 *
 * @author Me
 * @version 1.0
 */
public class TextTransformUpper implements TextTransform {

    private final String transforms;

    public TextTransformUpper(String transforms) {
        this.transforms = transforms;
    }

    @Override
    public String transform() {
        return transforms.toUpperCase();
    }
}
