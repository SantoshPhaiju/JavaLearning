package CollectionFrameworks.Set;

import java.util.Objects;

public class LearningStudent {
    String name;
    int roll;

    public LearningStudent(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "\n{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LearningStudent student = (LearningStudent) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll);
    }
}
