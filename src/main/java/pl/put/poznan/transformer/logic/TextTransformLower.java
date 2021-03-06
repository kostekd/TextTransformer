package pl.put.poznan.transformer.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Klasa TextTransformLower służy do zamiany wszystkich liter z dużych na małe.
 * TextTransformLower implementuje interfejs TextTransform.
 * Przykładowo gdy na wejściu otrzymamy teksy "iNzYnIeRiAoPrOgRaMoWaNiA" to na
 * wyjściu zobaczymy teksy "inzynieria ogrogramowania".
 *
 *
 * @version 1.0
 */
public class TextTransformLower implements TextTransform{
    private final String transforms;
    private static final Logger LOGGER = LoggerFactory.getLogger(TextTransformCapital.class.getName());
    /**
     *
     *Konstruktur klasy przyjmuje tekst który ma zostać zmieniony na małe litery.
     * @param transforms tekst wejściowy
     *
     *
     */
    public TextTransformLower(String transforms) {
        this.transforms = transforms;
    }
    /**
     * @return zwraca tekst ze zmienionymi dużymi literami na małe
     */
    @Override
    public String transform() {
        LOGGER.debug("Changing word to lower");
        return transforms.toLowerCase();
    }
}
