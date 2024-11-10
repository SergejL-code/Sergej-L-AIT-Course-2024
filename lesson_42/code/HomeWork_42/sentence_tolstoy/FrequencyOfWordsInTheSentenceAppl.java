package HomeWork_42.sentence_tolstoy;
/*  Count the frequency of words in the sentence by L. N. Tolstoy: "In the 1800s, in those days when there were no railroads, no highways, no gas or stearin lights, no low spring sofas, no furniture without varnish, no disappointed young men with glass, no liberal female philosophers, no lovely camellia ladies, of whom there are so many in our time - in those naive times when from days along a soft, dusty or dirty road and believed in Pozharsky   cutlets, in Valdai bells and bagels - when tallow candles burned on long autumn evenings, illuminating family circles of twenty and thirty people, wax and spermaceti candles were inserted into candelabra at balls, when furniture was arranged symmetrically, when our fathers were still young not only because of the absence of wrinkles and gray hair, but they shot for women and rushed from the other corner of the room to pick up accidentally or not accidentally dropped handkerchiefs, our mothers wore short waists and huge sleeves and decided family matters by taking out tickets, when lovely camellia ladies hid from daylight - in the naive times of Masonic lodges, Martinists, Tugendbund, in the times of Miloradoviches, Davydovs, Pushkins - in the provincial town of K. there was a congress of landowners, and the noble elections were ending."

// Removing punctuation marks and converting to lower case text = text.replaceAll("[^a-zA-Z0-9\s]", "").toLowerCase();*/


import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWordsInTheSentenceAppl {
    public static void main(String[] args) {


        String text2 = "In the 1800s, in those days when there were no railroads, no highways, no gas or stearin lights, no low spring sofas, no furniture without varnish, no disappointed young men with glass, no liberal female philosophers, no lovely camellia ladies, of whom there are so many in our time - in those naive times when from days along a soft, dusty or dirty road and believed in Pozharsky   cutlets, in Valdai bells and bagels - when tallow candles burned on long autumn evenings, illuminating family circles of twenty and thirty people, wax and spermaceti candles were inserted into candelabra at balls, when furniture was arranged symmetrically, when our fathers were still young not only because of the absence of wrinkles and gray hair, but they shot for women and rushed from the other corner of the room to pick up accidentally or not accidentally dropped handkerchiefs, our mothers wore short waists and huge sleeves and decided family matters by taking out tickets, when lovely camellia ladies hid from daylight - in the naive times of Masonic lodges, Martinists, Tugendbund, in the times of Miloradoviches, Davydovs, Pushkins - in the provincial town of K. there was a congress of landowners, and the noble elections were ending.";

        String text1 = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";


        // print wordCount
        System.out.println("Частота использования слов на русском языке:");
        countWordFrequency(text1);

        System.out.println("*************************************************");
        System.out.println();
        System.out.println("Частота использования слов на английском языке:");
        countWordFrequency(text2);

    }
        private static void countWordFrequency (String text){
            // Убираем знаки препинания
            text = text.replaceAll("[^a-яa-zА-ЯA-Z0-9\s]", "").toLowerCase();
            // Текст делится на слова с помощью метода split из класса String используя regex как разделитель
            String[] words = text.split("\\s+");

            //возьмём HashMap, чтобы хранить слова и их частоту в тексте
            Map<String, Integer> wordCount = new HashMap<>();
            //проходим по всем словам в массиве words c переменной word
            for (String word : words) {
                //добавляем слово в Map<String,Integer>wordCount с word ключом заодно увеличивая счетчик , если слово есть
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            // Выводим слова и их частоту
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                System.out.println("-----------------------------------");

            }
            System.out.println("Количество слов в тексте: " + wordCount.size());
    }//end of main
}//end of class