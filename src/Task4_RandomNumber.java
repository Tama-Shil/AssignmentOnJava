public class Task4_RandomNumber {
    public static void main(String[] args) {
        try {
            /*
             * Qustion 4:
             * Generate random 10 integer numbers in an array and print out all the numbers from the array and also print the max and min number from the array.
             * */
            System.out.println("\nThe answer of Question 04:");
            System.out.print("The array with 10 random numbers: ");
            int max=100, min =1;
            int[] numbers = new int[10];
            int maxnumber=Integer.MIN_VALUE;
            int minnumber=Integer.MAX_VALUE;
            for(int i=0;i<10;i++)
            {
                int random = (int) (Math.random() * (max - min + min));
                numbers[i]=random;
                System.out.print(numbers[i]+" ");
                if(numbers[i]<minnumber){
                    minnumber=numbers[i];
                }
                else if(numbers[i]>maxnumber){
                    maxnumber=numbers[i];
                }
            }
            System.out.println("\nThe maximum number is: "+maxnumber);
            System.out.println("The minimum number is: "+minnumber);

        }catch (Exception e){

        }
    }
}
