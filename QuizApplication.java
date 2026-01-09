import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== Java Quiz Application =====");
        System.out.println("Answer by entering option number (1-4)\n");

        // Question 1
        System.out.println("1. Which keyword is used to inherit a class in Java?");
        System.out.println("1) implements");
        System.out.println("2) extends");
        System.out.println("3) inherits");
        System.out.println("4) super");
        System.out.print("Your answer: ");
        int ans1 = sc.nextInt();
        if (ans1 == 2) score++;

        // Question 2
        System.out.println("\n2. Which data type is used to create a variable that stores text?");
        System.out.println("1) int");
        System.out.println("2) char");
        System.out.println("3) String");
        System.out.println("4) boolean");
        System.out.print("Your answer: ");
        int ans2 = sc.nextInt();
        if (ans2 == 3) score++;

        // Question 3
        System.out.println("\n3. Which loop is guaranteed to execute at least once?");
        System.out.println("1) for");
        System.out.println("2) while");
        System.out.println("3) do-while");
        System.out.println("4) foreach");
        System.out.print("Your answer: ");
        int ans3 = sc.nextInt();
        if (ans3 == 3) score++;

        // Question 4
        System.out.println("\n4. Which symbol is used to access class members?");
        System.out.println("1) #");
        System.out.println("2) ::");
        System.out.println("3) .");
        System.out.println("4) ->");
        System.out.print("Your answer: ");
        int ans4 = sc.nextInt();
        if (ans4 == 3) score++;

        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Your Score: " + score + " / 4");

        if (score == 4) {
            System.out.println("Excellent performance!");
        } else if (score >= 2) {
            System.out.println("Good job! Keep practicing.");
        } else {
            System.out.println("Needs improvement. Try again!");
        }

        sc.close();
    }
}
