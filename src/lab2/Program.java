package lab2;

public class Program {

    public static void main(String[] args) {
        int mark = 85;
        String result;

        if (mark < 1 || mark > 100) {
            result = "Error: marks must be between 1..100";
        } else if (mark >= 50 && mark <= 60) {
            result = "Pass";
        } else if (mark >= 61 && mark <= 70) {
            result = "Merit";
        } else if (mark >= 71 && mark <= 100) {
            result = "Distinction";
        } else {
            result = "Fail";
        }

        System.out.println(result);
    }
}