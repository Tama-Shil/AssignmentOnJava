import java.util.Scanner;

public class Task1_3_CGPA {
    public static void main(String[] args) {
        try {
            /*
             * Question: 01
             * Here is the 10 students CGPA [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]. Find out who achieved the 2nd highest score. (without sorting, use linear searching algorithm)
             */
            System.out.println("The answer of Question 01:");

            double[] CGPA = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
            double highest = Integer.MIN_VALUE;
            double second_highest = Integer.MIN_VALUE;

            for (int i = 0; i < 10; i++) {
                if (CGPA[i] > highest) {
                    second_highest = highest;
                    highest = CGPA[i];

                } else if (CGPA[i] < highest && CGPA[i] > second_highest) {
                    second_highest = CGPA[i];
                }
            }
            System.out.println("The second highest CGPA score is: " + second_highest);

            /*
             * Question:02
             * Sort the above scores from according to the order of highest CGPA (don’t use Arrays.sort() method, do it programmatically)
             * */
            System.out.println("\nThe answer of Question 02:");
            for (int i = 1; i < 10; i++) {
                double key = CGPA[i];
                int j = i - 1;
                while (j >= 0 && CGPA[j] < key) {
                    CGPA[j + 1] = CGPA[j];
                    j = j - 1;
                }
                CGPA[j + 1] = key;
            }
            System.out.print("The array in descending order: ");

            for (int i = 0; i < 10; i++) {
                System.out.print(CGPA[i] + " ");
            }

            /*
             * Question 3:
             * Take a CGPA as user input. Now from the given array find if your input CGPA is present using binary search algorithm
             */
            System.out.println("\n\nThe answer of Question 03:");
            Scanner input = new Scanner(System.in);

            System.out.print("\nInsert your CGPA: ");
            double usercgpa ;
            usercgpa= input.nextDouble();
            System.out.println();


            boolean ispresent = binarysearch(CGPA, usercgpa);
            if (ispresent) {
                System.out.println("Your input CGPA " + usercgpa + " is present.");
            } else {
                System.out.println("Your input CGPA " + usercgpa + " is not present.");
                ;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public static boolean binarysearch ( double[] CGPA, double cgpa){
            int left = 0, right = CGPA.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (CGPA[mid] == cgpa) {
                    return true;
                }
                if (CGPA[mid] > cgpa) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }
}
