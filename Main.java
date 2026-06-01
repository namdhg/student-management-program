import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== 학생 성적 관리 프로그램 =====");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 목록 조회");
            System.out.println("3. 평균 점수 조회");
            System.out.println("4. 최고 점수 학생 조회");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("학생 이름: ");
                    String name = sc.nextLine();

                    System.out.print("점수: ");
                    int score = sc.nextInt();

                    manager.addStudent(name, score);
                    System.out.println("학생 등록 완료!");
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.printf("평균 점수: %.2f\n",
                            manager.calculateAverage());
                    break;

                case 4:
                    Student top = manager.getTopStudent();

                    if (top == null) {
                        System.out.println("등록된 학생이 없습니다.");
                    } else {
                        System.out.println("최고 점수 학생: "
                                + top.getName()
                                + " (" + top.getScore() + "점)");
                    }
                    break;

                case 5:
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
