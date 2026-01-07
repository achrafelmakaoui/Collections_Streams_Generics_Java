package collections_streams.maps;
import java.util.HashMap;
import java.util.Map;

public class StudentGradesApp {
    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();

        grades.put("Achraf", 20.0);
        grades.put("Amine", 16.0);
        grades.put("Zouhair", 18.5);

        display(grades);

        grades.put("Amine", grades.get("Amine") + 2);
        display(grades);

        grades.remove("Zouhair");
        display(grades);

        System.out.println("Size of map: " + grades.size());

        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double g : grades.values()) {
            sum += g;
            if (g > max) max = g;
            if (g < min) min = g;
        }

        double average = sum / grades.size();
        System.out.println("Average: " + average);
        System.out.println("Maximum grade: " + max);
        System.out.println("Minimum grade: " + min);

        boolean has20 = grades.containsValue(20.0);
        System.out.println("Contains grade equal to 20: " + has20);
    }

    private static void display(Map<String, Double> grades) {
        System.out.println("Student grades:");
        grades.forEach((name, grade) ->
                System.out.println(name + " --> " + grade)
        );
        System.out.println("--------------------");
    }
}
