import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int score) {
        students.add(new Student(name, score));
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        System.out.println("\n===== 학생 목록 =====");
        for (Student s : students) {
            System.out.println("이름: " + s.getName()
                    + ", 점수: " + s.getScore());
        }
    }

    public double calculateAverage() {
        if (students.isEmpty()) return 0;

        int sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }

        return (double) sum / students.size();
    }

    public Student getTopStudent() {
        if (students.isEmpty()) return null;

        Student top = students.get(0);

        for (Student s : students) {
            if (s.getScore() > top.getScore()) {
                top = s;
            }
        }

        return top;
    }
}
