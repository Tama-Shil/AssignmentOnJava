import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_8_10_Stringtasks {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            /*
             * Qustion 8:
             * Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
                    Input: I am a SQA Engineer
                    Output:
                    Words: 5
                    Chars: 15
                    Vowel: 8
                    Consonant: 7
             * */
            System.out.println("\nThe answer of Question 08:");
            String inputstr="I am a SQA Engineer";
            System.out.println("Input: "+inputstr);
            String[] wordstr = inputstr.split(" ");
            System.out.println("Words: "+wordstr.length);
            int count1=0, count2=0,count3=0;
            for(int i=0;i<inputstr.length();i++){
                char temp= inputstr.charAt(i);
                temp=Character.toLowerCase(temp);
                if(temp!=' '){
                    count1++;
                    if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
                    {
                        count2++;
                    }
                    else{
                        count3++;
                    }
                }
            }
            System.out.println("Chars: "+count1);
            System.out.println("Vowel: "+count2);
            System.out.println("Consonant: "+count3);
            /*
             * Qustion 9:
             *  Find the number of occurrences of characters in a String
                        String: I live in Dhaka
                        Output:
                        i 3
                        l 1
                        v 1
                        e 1
                        d 1
                        h 1
                        a 2
                        k 1
              */
            System.out.println("\nThe answer of Question 09:");
            String string = "I live in Dhaka";
            System.out.print("Input: ");

            string=input.nextLine();
            string=string.toLowerCase();
            Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

            for(char ch: string.toCharArray()){
                if(Character.isLetter(ch)){
                    map.put(ch, map.getOrDefault(ch,0)+1);

                }
            }
            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }

            /*
             * Qustion 10:
             *  A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]
             */
            System.out.println("\nThe answer of Question 10:");

            String str="A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
            str = str.replaceAll("[^\\d]", " ");
            str = str.trim();
            str = str.replaceAll(" +", " ");

            String[] arr = str.split(" ");
           

            double laptop_price = Double.parseDouble(arr[1]);
            double mouse_price = Double.parseDouble(arr[2]);

            double total=laptop_price+mouse_price;
            double discount = 0.15;
            double finalPrice = total * (1 - discount);

            System.out.println("Total price "+finalPrice);

        }catch(Exception e){
        System.out.println(e);}
    }
}
