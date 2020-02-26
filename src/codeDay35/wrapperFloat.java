package codeDay35;

public class wrapperFloat {
    public static void main(String[] args) {




        // calculate price of your grocery from this sentence

        String sentence = "I bought 3 tomato and the price 3.14 each";
        // How much is your final checkout price
        // Hint :
        // the count is always 3rd word
        // the price is always at 2nd word from the last



        // LOGIC : split by space, parse count and price , do calculation

        String [] AllWords = sentence.split(" ");
        int count = Integer.parseInt((AllWords[2]));
        double price = Double.parseDouble(AllWords[AllWords.length-2]);

        System.out.println("Total price is "+(count*price));



    }
}
