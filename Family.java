import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Family {
    private ArrayList<String> members = new ArrayList<>(Arrays.asList("Paul", "Aubree", "Harvest", "Ocean", "Everest"));

    public ArrayList<String> getParents() {
        return members.stream()
            .filter(member -> member.equals("Paul") || member.equals("Aubree"))
            .collect(Collectors.toCollection(ArrayList::new));
    }

}
