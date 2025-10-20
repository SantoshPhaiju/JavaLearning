package CollectionFrameworks.Set;

import java.util.HashSet;
import java.util.Set;

public class NewStudentSetLearning {
    public static void main(String[] args) {
        Set<LearningStudent> studentSet = new HashSet<>();

        studentSet.add(new LearningStudent("Ronaldo", 3));
        studentSet.add(new LearningStudent("Messi", 2));
        studentSet.add(new LearningStudent("Santosh", 1));
        studentSet.add(new LearningStudent("Rooney", 4));
        studentSet.add(new LearningStudent("Rooney", 4));

        System.out.println(studentSet);
        for (LearningStudent student : studentSet) {
            System.out.println(student.name);
        }
    }
}
