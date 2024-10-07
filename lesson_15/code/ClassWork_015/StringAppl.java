package ClassWork_015;

public class StringAppl {
    public static void main(String[] args) {
        String str1 = "Hello,";
        char[] chars = {32, 'W', 'o', 'r', 'l', 'd', '!' }; //32 das ist Code пробел aus tabele ASCII
        String str2 = new String(chars);// str2 объект класса Strig,сделанный конструктором(тоже метод)
        // new это обращение к конструктору класса
        System.out.println(str1);//print Hello,
        System.out.println(str2);//print World!
        //concat -объединяем, складываем обьекты типа String
        String str = str1 + str2;
        System.out.println(str);

        str1.concat(str2);//конкатинация с помощью метода
        // System.out.println(str1);// str 1 не изменилась так как тип String imutable
        System.out.println(str1.concat(str2));
        //---------------------------------------------------------------------------------------------------------------
        //lenght og String
        int l = str.length();//определяем длину строки str
        System.out.println(l);
        //----------------------------------------------------------------------------------------------------------------
        //first symbol
        char ch = str.charAt(0);
        System.out.println(ch);
        //-------------------------------------------------------------------------------------------------------------
        // last symbol
        ch = str.charAt(str.length() - 1);

        System.out.println(ch);

        //------------------------------------------------------------------------------------------------------------------
        //print str with spaces
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();//переход на новую строку
        //------------------------------------------------------------------------------------------------------------------
        // check equals
        String str3 = " worLD!";
        boolean checker = str3.equals(str2);//str2 =" World!"// сравнивает регистр, место, длину
        System.out.println(checker);//false

        checker = str3.equalsIgnoreCase(str2);//str2 =" World!"// игнорирует регистр, сравнивает длину
        System.out.println(checker);
        //------------------------------------------------------------------------------------------------------------
        System.out.println("---------------------------------------------------------------------------------------");

        // symbol in position
        System.out.println(str);
        int index = str.indexOf('W');
        System.out.println(index);//7
        int index1 = str.lastIndexOf('d');//from right to left to search??? -no
       // System.out.println(index1);
        index = str.indexOf('o');
        index1 = str.lastIndexOf('o');//search from right to left,but index from left to right
        System.out.println(index + "," + index1);
        index = str.indexOf('x');
        System.out.println(index);
        //------------------------------------------------------------------------------------------------------------------
        System.out.println("---------------------------------------------------------------------------------------------");
        //substring
        System.out.println(str.substring(7)); //from 7 to end
        System.out.println(str.substring(7,10));// from 7 element to 10 element//
        //---------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------------------");
        //---------------------------------------------------------------------------------------------------------------
        //replace
        System.out.println(str.replace("o", "O-O-O"));
    //---------------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------------------------------------------------------------------");
        //----------------------------------------------------------------------------------------------------------------
        // split
        // number of words
        String str4 = "I love string in Java";
        String[]words = str4.split(" ");
        int w = words.length;
        System.out.println("Numbers of word in sentence: " + w  );
        // numbers of letters
        String[] letters = str4.split("");
        int let = letters.length;
        System.out.println("Numbers of letters in sentence: " + let);
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("---------------------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------------------------------------------





    }

}
