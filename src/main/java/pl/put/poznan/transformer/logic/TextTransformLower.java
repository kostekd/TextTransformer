package pl.put.poznan.transformer.logic;

public class TextTransformLower implements TextTransform{
    private final String transforms;

    public TextTransformLower(String transforms) {
        this.transforms = transforms;
    }

    @Override
    public String transform() {
        return transforms.toLowerCase();
    }
}
