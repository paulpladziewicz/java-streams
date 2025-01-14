import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Family {
    private List<String> members = List.of("Paul", "Aubree", "Harvest", "Ocean", "Everest");

    public ArrayList<String> getParents() {
        return members.stream()
            .filter(member -> member.equals("Paul") || member.equals("Aubree"))
            .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<String> getChildren() {
        return members.stream()
            .filter(member -> !member.equals("Paul") && !member.equals("Aubree"))
            .toList();
    }

    public int getNumberOfMembers() {
        return members.size();
    }
}
