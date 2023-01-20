package InterviewQues;

class Protected {

    private class ABC {

        int a = 123;
    }

    static class XYZ {

        int b = 456;
    }

    protected class OOO {

        protected int c = 789;
    }

    public static void main(String[] args) {

        Protected p = new Protected();
        ABC abc = p.new ABC();
        XYZ xyz = new XYZ();
        OOO ooo = p.new OOO();

        System.out.println(abc.a);
        System.out.println(xyz.b);
        System.out.println(ooo.c);
    }
}
