package Fremd;

//Task 3 (*). There is a long sentence
//
//Write a method that answers the question how many words are in this sentence.Note that the dash is not a word.
//Count how many letters (not symbols!) are in this sentence.

public class Task_3_LongSentence {

    public static void main(String[] args) {

        String longSentence = "In the 1800s, at a time when there were no railroads, no highways, no gas, no stearin light, no springy low sofas, no furniture without varnish, no disillusioned young men with glass, no liberal female philosophers, nor the lovely lady camellias, of which there are so many in our time - in those naive times when, leaving Moscow for St. Petersburg in a cart or carriage, they took with them a whole home-cooked kitchen, drove for eight days along a soft, dusty or dirty road and they believed in Pozharsky cutlets, in Valdai bells and bagels - when tallow candles burned on long autumn evenings, illuminating family circles of twenty and thirty people, at balls wax and spermaceti candles were inserted into candelabra, when furniture was placed symmetrically, when our fathers were still young not only because of the absence of wrinkles and gray hair, but they shot at women and from the other corner of the room rushed to pick up accidentally and not accidentally dropped handkerchiefs, our mothers wore short waists and huge sleeves and solved family matters by taking out tickets when the lovely camellia ladies were hiding from daylight - in the naive times of the Masonic lodges, Martinists, Tugendbund, in the times of the Miloradovichs, Davydovs, Pushkins - in the provincial city of K. there was a congress of landowners, and the noble elections ended.";
        String[] words = longSentence.split("\\s+"); // \\s+ - s - space characters (spaces, tabs, new lines), + - quantifier, one or more non-letter characters in sequence
        int w = 0;
        for (int i = 0; i < words.length; i++) {
            if(!words[i].equals("-")){
                w++;
            }
        }
        System.out.println("There are " + w + " words in the sentence.");

        String[] letters = longSentence.replaceAll("[^a-zA-Z]+", "").split(""); // [^a-zA-Z]+ - matches any character that is not a letter
        System.out.println("There are " + letters.length + " letters in the sentence.");

    }//end of main

}//end of class
