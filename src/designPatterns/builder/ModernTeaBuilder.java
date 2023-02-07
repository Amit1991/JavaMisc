package designPatterns.builder;

public class ModernTeaBuilder {

    public Boolean milk;
    public Boolean sugar;
    public Boolean cardamom;
    public Boolean ginger;

    public ModernTeaBuilder() {

    }

    public ModernTeaBuilder milk(Boolean milk) {

        this.milk = milk;
        return this;
    }

    public ModernTeaBuilder sugar(Boolean sugar) {

        this.sugar = sugar;
        return this;
    }

    public ModernTeaBuilder ginger(Boolean ginger) {

        this.ginger = ginger;
        return this;
    }

    public ModernTeaBuilder cardamom(Boolean cardamom) {

        this.cardamom = cardamom;
        return this;
    }

    public Tea build() {

        return new Tea(this);
    }

}
