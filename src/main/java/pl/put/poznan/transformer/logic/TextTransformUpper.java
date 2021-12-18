package pl.put.poznan.transformer.logic;
/**
 * Klasa TextTransformUpper służy do zamiany wszystkich liter z małych na duże.
 * TextTransformUpper implementuje interfejs TextTransform.
 * Na przykład gdy na wejściu pojawi się tekst "inzynieria oprogramowania" na
 * wyjściu otrzymamy tekst "INZYNIERIA OPROGRAMOWANIA".
 *
 *
 * @version 1.0
 */
public class TextTransformUpper implements TextTransform {

    private final String transforms;
    /**
     *
     *Konstruktur klasy przyjmuje tekst który ma zostać zmieniony na wielkie litery.
     * @param transforms tekst wejściowy
     *
     *
     */
    public TextTransformUpper(String transforms) {
        this.transforms = transforms;
    }
    /**
     * @return zwraca tekst ze zmienionymi małymi literami na duże
     */
    @Override
    public String transform() {
        return transforms.toUpperCase();
    }
}
