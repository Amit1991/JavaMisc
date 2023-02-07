package designPatterns.builder;

public class Tea {

    public Boolean milk;
    public Boolean sugar;
    public Boolean cardamom;
    public Boolean ginger;

    public Tea(ModernTeaBuilder builder) {

        this.milk = builder.milk;
        this.sugar = builder.sugar;
        this.ginger = builder.ginger;
        this.cardamom = builder.cardamom;
    }

    public Boolean getMilk() {
        return milk;
    }

    public Boolean getSugar() {
        return sugar;
    }

    public Boolean getCardamom() {
        return cardamom;
    }

    public Boolean getGinger() {
        return ginger;
    }

    public Tea() {

    }

    public Tea(Builder builder) {

        this.milk = builder.milk;
        this.sugar = builder.sugar;
        this.ginger = builder.ginger;
        this.cardamom = builder.cardamom;
    }

    public static class Builder {

        public Boolean milk;
        public Boolean sugar;
        public Boolean cardamom;
        public Boolean ginger;

        public Builder() {

        }

        public Builder milk(Boolean milk) {

            this.milk = milk;
            return this;
        }

        public Builder sugar(Boolean sugar) {

            this.sugar = sugar;
            return this;
        }

        public Builder ginger(Boolean ginger) {

            this.ginger = ginger;
            return this;
        }

        public Builder cardamom(Boolean cardamom) {

            this.cardamom = cardamom;
            return this;
        }

        public Tea build() {

            return new Tea(this);
        }
    }

    @Override
    public String toString() {
        return "Tea{" +
                "milk=" + milk +
                ", sugar=" + sugar +
                ", cardamom=" + cardamom +
                ", ginger=" + ginger +
                '}';
    }
}
