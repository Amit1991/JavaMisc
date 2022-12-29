package general;

public final class ImmutableClass {

    private final String property1;
    private final int property2;
    private final Boolean property3;

    public ImmutableClass(String property1, int property2, Boolean property3) {
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
    }

    public String getProperty1() {
        return property1;
    }

    public int getProperty2() {
        return property2;
    }

    public Boolean getProperty3() {
        return property3.booleanValue();
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "property1='" + property1 + '\'' +
                ", property2=" + property2 +
                ", property3=" + property3 +
                '}';
    }

    public static void main(String[] args) {

        ImmutableClass ic = new ImmutableClass("Amit", 30, false);
        System.out.println(ic);

        ImmutableClass ic2 = new ImmutableClass("Amita", 300, true);
        System.out.println(ic2);
    }
}
