package InterviewQues;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList {

    private final List<String> stringList = new ArrayList<>();

    public ImmutableList(List<String> initParam) {

        this.stringList.addAll(initParam);
    }

    public List<String> getStringList() {

        List<String> tempList = new ArrayList<>();
        tempList.addAll(stringList);
        return tempList;
    }

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("Amit");
        name.add("Tiwary");

        ImmutableList il = new ImmutableList(name);
        System.out.println(il.getStringList());

        name.add(1,"Kumar");
        System.out.println(il.getStringList());

        ImmutableList il2 = new ImmutableList(name);
        System.out.println(il2.getStringList());

        il2.getStringList().add("Whatever");
        System.out.println(il2.getStringList());
    }
}
