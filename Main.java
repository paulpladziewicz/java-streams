import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Family family = new Family();
        ArrayList<String> parents = family.getParents();

        for (String parent : parents) {
            System.out.println(parent);
        }
    }
}
