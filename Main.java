import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Family family = new Family();
        ArrayList<String> parents = family.getParents();
        List<String> children = family.getChildren();

        Collections.sort(parents);

        for (String parent : parents) {
            System.out.println(parent);
        }

        children.forEach(System.out::println);

        System.out.println(family.getNumberOfMembers());
    }
}
