import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Family {
    private List<FamilyMember> members = List.of(
            new FamilyMember.FamilyMemberBuilder("Paul")
                .setAge(33)
                .setIsAdult(true)
                .build(),
            new FamilyMember.FamilyMemberBuilder("Aubree")
                .setAge(33)
                .setIsAdult(true)
                .build(),
            new FamilyMember.FamilyMemberBuilder("Harvest")
                .setAge(6)
                .setIsAdult(false)
                .build(),
            new FamilyMember.FamilyMemberBuilder("Ocean")
                .setAge(3)
                .setIsAdult(false)
                .build(),
            new FamilyMember.FamilyMemberBuilder("Everest")
                .setAge(1)
                .setIsAdult(false)
                .build()
            );

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
