package collections_streams.sets;
import java.util.HashSet;
import java.util.Set;

public class StudentGroupsApp {
    public static void main(String[] args) {
        HashSet<String> groupA = new HashSet<>();
        HashSet<String> groupB = new HashSet<>();

        groupA.add("Achraf");
        groupA.add("Ahmad");
        groupA.add("Karim");

        groupB.add("Achraf");
        groupB.add("Anas");
        groupB.add("Amine");

        System.out.println("Group A: " + groupA);
        System.out.println("Group B: " + groupB);

        Set<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("Intersection: " + intersection);

        Set<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union: " + union);
    }
}
