package HomeWork_15;
//Given the line "I'm proud to learn Java! Java is the most famous programming language!!!"
// Run the tutorial with this line:
//
//Print the last character of a line.
//Find the position of the substring “Java” in a string.
//Check if the given string contains the substring “Java”.
//Replace all “o” characters with “a”.
//Convert the string to upper case.
//Convert the string to lower case.
//Cut a Java substring using the substring() method.
//Check if the string ends with the substring “!!!”.
//Check if the string begins with the substring “I'm proud”.

public class StringPraktikum {
    public static void main(String[] args) {
        String a = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println("===================Last Symbol==================================");
        //last symbol
        System.out.println(a.charAt(a.length() - 1));
        //--------------------------------------------------------------------------------------------
        System.out.println("================= the position of the substring Java =====================================");
        int buchstabe_1 = a.indexOf("Java");
        int buchstabe_2 = a.indexOf("Java", buchstabe_1 + 1);
        System.out.println(buchstabe_1 + " and " + buchstabe_2);
        //---------------------------------------------------------------------------------------------
        System.out.println("================= Check =====================================");
        String word = "Java";

        boolean checker = a.equals(word);
        System.out.println(checker);
        //----------------------------------------------------------------------------------------------------
        System.out.println("===================Replace all “o”==============================================");
        System.out.println(a.replace('o', 'a'));
        //----------------------------------------------------------------------------------------------
        System.out.println("================================Convert  to upper case =========================");
        System.out.println(a.toUpperCase());
        System.out.println("================================Convert  to lower case =========================");
        System.out.println(a.toLowerCase());
        //--------------------------------------------------------------------------------------------------
        System.out.println("=====================Cut a Java substring=======================================");
        System.out.println(a.substring(19, 29));
        //-----------------------------------------------------------------------------------------------
        System.out.println("======================== check (!!!) ==============================================");

        System.out.println();
        if (a.endsWith("!!!")) {
            System.out.println("String with (!!!)");
        }
        if (a.startsWith("I'm proud")) {
            System.out.println("String with (I'm proud)");
        }


    }//end of main
}// end of class
