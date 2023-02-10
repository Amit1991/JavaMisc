package InterviewQues;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList {

    private final List<String> stringList;

    public ImmutableList(List<String> initParam) {

        List<String> strList = new ArrayList<>(initParam);
        stringList = List.of(strList.toArray(new String[0]));
    }

    public List<String> getStringList() {

        return stringList;
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
