import java.util.Scanner;

public class Task5_6_Notes_Patterns {
    public static void main(String[] args) {
        try {
             /*
             * Qustion 5:
             * Write a program that will break down the amount and count notes for any given amount. Here is the notes in the given array:
                notes=[1000,500,200,100,50,20,10,5,2,1]
                Input: 546
                Output:
                500 1
                20 2
                5 1
                1 1
             *  */
            Scanner input = new Scanner(System.in);
            System.out.println("\nThe answer of Question 05:");

            System.out.print("Input note: ");
            int note;
            note=input.nextInt();
            System.out.println("Output:");
            int [] notes={1000,500,200,100,50,20,10,5,2,1};
            int [] notenumbers=new int[notes.length];
            for(int i=0;i<notes.length;i++){
                if(notes[i]<=note){
                    notenumbers[i]=note/notes[i];
                    note=note%notes[i];

                }
                if(notenumbers[i]!=0)
                {
                    System.out.println(notes[i]+" "+notenumbers[i]);
                }
            }
            /*
             * Qustion 6:
             *  Write a program that will give following output:
                    12345
                    1234
                    123
                    12
                    1
                    12
                    123
                    1234
                    12345
               */
            System.out.println("\nThe answer of Question 06:");
            for(int i=5;i>=2;i--){

                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            for(int i=1;i<=5;i++){

                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }



        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
