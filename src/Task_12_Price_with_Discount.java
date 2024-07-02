public class Task_12_Price_with_Discount {
    public static void main(String[] args) {
        try {
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

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
