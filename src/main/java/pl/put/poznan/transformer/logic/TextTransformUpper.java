package pl.put.poznan.transformer.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private static final Logger LOGGER = LoggerFactory.getLogger(TextTransformCapital.class.getName());
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
        LOGGER.debug("Changing word to upper");
        return transforms.toUpperCase();
    }
}
