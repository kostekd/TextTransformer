package pl.put.poznan.transformer.logic;

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
