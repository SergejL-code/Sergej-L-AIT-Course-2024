package Fremd;

// Дано предложение:
//"В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку,
// ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена,
// когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой,
// пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи,
// освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично,
// когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно
// и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков,
// когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей,
// Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";
//
//Напишите метод, который отвечает на вопрос сколько слов в этом предложении. Обратите внимание, что тире не является словом. Подсчитайте,
// сколько букв (не символов!) в этом предложении.

public class HA_task03 {
    public static void main(String[] args) {

        String str = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";

        // Метод, который отвечает на вопрос сколько слов в этом предложении.
        // удаляем начальные и конечные пробелы и разбиваем строку на слова
        String[] words = str.trim().split("\\s+");
        // Переменная для подсчета слов
        int wordCount = 0;
        // проходим по каждому элементу массива слов
        for (String word : words) {
            // учитываем только те элементы, которые не являются тире
            if (!word.equals("-") && !word.isEmpty()) {  // !word.equals("-"): Исключаем элементы, которые равны тире.
                wordCount++;                             // !word.isEmpty(): Проверяем, что слово не пустое, если есть двойные пробелы.

            }
        }
        System.out.println("Количество слов в строке (без учета тире): " + wordCount);

        // Сколько букв (не символов!) в этом предложении.
        // Переменная для подсчета букв
        int letterCount = 0;

        // Проходим по каждому символу строки
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Проверяем, является ли символ буквой
            if (Character.isLetter(ch)) {
                letterCount++;
            }
        }
        // Выводим количество букв
        System.out.println("Количество букв (не символов) в строке: " + letterCount);

    }
}
