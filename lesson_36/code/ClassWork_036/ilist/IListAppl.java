package ClassWork_036.ilist;

import ClassWork_036.ilist.model.IList;
import ClassWork_036.ilist.model.IListImpl;

public class IListAppl {
    public static void main(String[] args) {
        //список с целыми числами
        IList<Integer> listOfAge = new IListImpl<>();
        listOfAge.add(61);
        listOfAge.add(38);
        listOfAge.add(37);
        listOfAge.add(35);
        listOfAge.add(27);
        listOfAge.add(37);
        listOfAge.add(48);
        listOfAge.add(27);
        listOfAge.add(46);
        listOfAge.add(23);
        listOfAge.add(45);
        listOfAge.add(18);
        listOfAge.add(63);
        listOfAge.add(33);
        System.out.println("=====================================================");
        System.out.println(listOfAge.size());
        System.out.println("=====================================================");
        System.out.println(listOfAge.indexOf(61));
        System.out.println("=====================================================");
        System.out.println(listOfAge.indexOf(63));
        System.out.println("=====================================================");
        System.out.println(listOfAge.indexOf(27));
        System.out.println("=====================================================");
        System.out.println(listOfAge);
        System.out.println("=====================================================");

        int index = 0;
        for (Integer i : listOfAge) {
            System.out.println(index++ + ": " + i);
        }
        System.out.println("=============================================================================================================");

//        for (int i = 0; i < listOfAge.size(); i++) {
//            if(listOfAge.get(i) == 37){
//            System.out.println(i + ": 37 ");
//            }
//        }
//        int indexNew=0;
//        for (Integer i : listOfAge) {
//            if(listOfAge.get(indexNew) == 37){
//                System.out.println(indexNew);
//                indexNew++;
//            }
//        }
        int sum = 0;
        for (Integer i : listOfAge) {
            sum += i;
        }
        System.out.println("=====================================================");
        System.out.println(sum);
        double avgA = (double) sum / listOfAge.size();
        System.out.println(avgA);

        //
        System.out.println("=====================================================");
        IList<String> listOfName = new IListImpl<>();
        listOfName.add("Leonid");
        System.out.println(listOfName.size());
        listOfName.add("L1");
        listOfName.add("L2");
        listOfName.add("L3");
        listOfName.add("L4");
        listOfName.add("L5");
        listOfName.add("L6");
        listOfName.add("L2");
        listOfName.add("L6");
        listOfName.add("L10");
        listOfName.add("L1");
        listOfName.add("null");
        System.out.println(listOfName.size());
        index = 0;
        for (String str : listOfName) {
            System.out.println(index++ + ": " + str);
        }
        String strTotal="";
        for (String s : listOfName) {
            strTotal += s;
        }
        System.out.println(strTotal);
        System.out.println("=====================================================");
//        listOfName.remove(6);
//        listOfName.remove("Leonid");
//        index = 0;
//        for (String str : listOfName) {
//            System.out.println(index++ + ": " + str);
//        }
//        System.out.println();
//
//        System.out.println("=====================================================");
//
//        System.out.println("=====================================================");
//

    }//end of main
}//end of class
