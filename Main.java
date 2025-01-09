import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static ArrayList<String> familyMembers = new ArrayList<>(Arrays.asList("Paul", "Aubree", "Harvest", "Ocean", "Everest"));

    public static void main(String[] args) {
        getParents();
    }

    public static void getParents() {
        familyMembers.stream()
            .filter(member -> member == "Paul" || member == "Aubree")
            .forEach(member -> System.out.println(member));
    }
}
