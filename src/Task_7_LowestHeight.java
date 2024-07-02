import java.util.Scanner;
public class Task_7_LowestHeight {
    public static void main(String[] args) {
        try{
            /*
                   * Qustion 7:
             *  Take input as height of 10 babies in cm. Now find out the 2 lowest height of babies. (Don’t use Arrays.sort() method)
               */
            Scanner input = new Scanner(System.in);
            System.out.println("\nThe answer of Question 07:");
            int [] heights= new int[10];
             System.out.print("Input heights of 10 babies in cm: ");

             for(int i=0;i<10;i++){
                 heights[i]=input.nextInt();
             }

             int minheight=Integer.MAX_VALUE;
             int secondminheight=Integer.MAX_VALUE;
              for(int i=0;i<10;i++){
                  if(heights[i]<minheight){
                      secondminheight=minheight;
                      minheight=heights[i];

                  } else if (heights[i]<secondminheight&& heights[i]>minheight) {
                      secondminheight=heights[i];
                  }
              }
              System.out.println("\nThe 2 lowest height of babies are: "+minheight+" "+secondminheight);
              /*
              Sample output:
              43 55 44 40 42 44 47 50 41 53
              */
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
