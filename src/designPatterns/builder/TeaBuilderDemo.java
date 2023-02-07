package designPatterns.builder;

public class TeaBuilderDemo {

    public static void main(String[] args) {

        Tea.Builder teaBuilder = new Tea.Builder();
        Tea tea = teaBuilder.milk(true).ginger(true).sugar(true).cardamom(false).build();

        System.out.println(tea);

        ModernTeaBuilder modernTeaBuilder = new ModernTeaBuilder();
        Tea teaTwo = modernTeaBuilder.milk(true).ginger(true).sugar(true).cardamom(false).build();

        System.out.println(teaTwo);
    }
}
