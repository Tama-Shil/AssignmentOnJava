import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_8_9_Stringtasks {
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
            Map<Character, Integer> map = new LinkedHashMap<>();

            for(char ch: string.toCharArray()){
                if(Character.isLetter(ch)){
                    map.put(ch, map.getOrDefault(ch,0)+1);

                }
            }
            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }


        }catch(Exception e){
        System.out.println(e);}
    }
}
