package ClassWork_019.compare_string;

// равенство строк - как понять?
public class CompareStringAppl {
    public static void main(String[] args) {

        int x = 5;//Stack
        int y = 5;//Stack
        boolean checker = x==y;
        System.out.println(checker);// true

        String str1 = "Europe";//str1 -Stack =>(link) Europe - Heap
        String str2 = "Europe";//str2 -Stack =>(link) Europe - Heap
        System.out.println("=======================================================================================");
        checker = str1 == str2;//compare string
        System.out.println(checker);
        String str3 = new String("Europe");// create new object
        checker = str1 == str3;//false, because  links not equals!
        System.out.println("=======================================================================================");
        System.out.println(checker);
        System.out.println("=======================================================================================");
        checker = str1.equals(str3);//compare Strings with method equals
        System.out.println(checker);

    }//end of main


}//end of class
