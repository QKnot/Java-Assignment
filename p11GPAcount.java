import java.util.Scanner;

interface Quark {
    double count(double[] data);
}

public class p11GPAcount {
    public static void main(String[] args) {
        Quark totalMarks = (data) -> {
            double total = 0.0;
            for (int i = 0; i < data.length; i++) {
                total += data[i];
            }
            return total;
        };

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numberOfSubjects = scan.nextInt();

        double[] data = new double[numberOfSubjects];
        System.out.print("Enter Marks for each subject: ");
        for (int i = 0; i < numberOfSubjects; i++) {
            data[i] = scan.nextDouble();
        }

        double sum = totalMarks.count(data);
        double average = sum / numberOfSubjects;

        System.out.println("Total Marks = " + sum);
        System.out.println("Average = " + average);
        System.out.println("GPA = " + calculateGPA(average));
        
        scan.close();
    }

    public static double calculateGPA(double average) {
        if (average >= 90) {
            return 4.0;
        } else if (average >= 80) {
            return 3.0;
        } else if (average >= 70) {
            return 2.0;
        } else if (average >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
