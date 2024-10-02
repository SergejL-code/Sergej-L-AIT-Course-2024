package Fremd;

//Task 1. Given the line "I'm proud to learn Java! Java is the most famous programming language!!!" Run the tutorial with this line:
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

public class Task_1_Tutorial {

    public static void main(String[] args) {

        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(str);

        //Print the last character of a line.
        System.out.println("The last character of a line: " + str.charAt(str.length() - 1));

        //Find the position of the substring “Java” in a string.
        int javaIndex1 = str.indexOf("Java");
        System.out.println("The position of the first substring “Java” in a string: " + javaIndex1);

        int javaIndex2 = str.lastIndexOf("Java");
        System.out.println("The position of the second substring “Java” in a string: " + javaIndex2);

        int javaIndex3 = str.indexOf("Java", javaIndex1 + 1);
        System.out.println("The position of the second substring “Java” in a string: " + javaIndex3);

        //Check if the given string contains the substring “Java”.
        //variant with method 'contains'
        boolean checker = str.contains("Java");
        System.out.println("The string contains the substring 'Java': " + checker);

        //variant with cycle for
        checker = false;
        String[] strArray = str.split("\\s+"); // \\s+ skips any free space elements of a string: spaces, tabs, newlines
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("Java")){
                checker = true;
            }
        }
        System.out.println("The string contains the substring 'Java': " + checker);

        //Replace all “o” characters with “a”.
        String replaceO = str.replace("o", "a");
        System.out.println(replaceO);

        //Convert the string to upper case.
        String convertUpper = str.toUpperCase();
        System.out.println(convertUpper);

        //Convert the string to lower case.
        String convertLower = str.toLowerCase();
        System.out.println(convertLower);

        //Cut a Java substring using the substring() method.
        //starting index for Java - 19
        String substringJava = str.substring(19, 23); // end index + 1
        System.out.println(substringJava);

        //Check if the string ends with the substring “!!!”.
        checker = str.endsWith("!!!"); //method checks if the input symbols are the last in a string
        System.out.println("The string ends with the substring '!!!': " + checker);

        //Check if the string begins with the substring “I'm proud”.
        checker = str.startsWith("I'm proud"); //method checks if the input symbols are the first in a string
        System.out.println("The string starts with the substring 'I'm proud': " + checker);

    }//end of main

}//end of class
