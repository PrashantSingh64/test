package testing;



public class Calculation {
    public static void main(String[] args) {
       
        int numSubjects = 3;

        

        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter student name: ");
        String name = scanner.next();

        int[] marks = new int[numSubjects];
        double totalMarks = 0;

        for (int i = 0; i < numSubjects; ++i) {
            do {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                if (marks[i] < 0 || marks[i] > maxMarks) {
                    System.out.println("Invalid marks. Marks should be between 0 and " + maxMarks);
                }
            } while (marks[i] < 0 || marks[i] > maxMarks);
            totalMarks += marks[i];
        }

        double percentage = (totalMarks / (numSubjects * maxMarks)) * 100;

        System.out.println("\nTotal Marks: " + totalMarks + " out of " + (numSubjects * maxMarks));
        System.out.println("Percentage: " + percentage + "%");

        if (percentage < 45) {
            System.out.println("Result: FF");
        } else if (percentage >= 45 && percentage < 60) {
            System.out.println("Result: Second Class");
        } else if (percentage >= 60 && percentage < 75) {
            System.out.println("Result: First Class");
        } else if (percentage >= 75 && percentage < 90) {
            System.out.println("Result: Distinction");
        } else {
            System.out.println("Result: Merit");
        }

        scanner.close();
    }
}

