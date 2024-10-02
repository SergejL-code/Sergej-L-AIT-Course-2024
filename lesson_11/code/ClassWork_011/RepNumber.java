package ClassWork_011;

//Задача о "вкраплениях".
//Имеется массив целых чисел, в котором несколько раз встречается число X.
//Выясните, сколько раз это число встречается в массиве? На каких местах массива оно стоит

public class RepNumber {
    public static void main(String[] args) {
        int[] array = {75, 34, -145, -15, -123, 57, -145, 86, 77, 48, -59,-145};
        int[] arrayOfIndex = new int[array.length];

        int x = -145;
        int count = 0;

        int indexForArray = 0; //index for the 2nd array

        for (int i = 0; i < array.length; i++) {

            if (array[i] == x) {
                count++; //Counting how many such elements
                System.out.print(i + " "); //Print immediately (сразу)
                arrayOfIndex[indexForArray] = i; //Put the index in the 2nd array
                indexForArray++; //Increase*(увелечение) the index of the 2nd array
                System.out.print(count +"   ");  //counter
            }                                                                                            //array 1
        }
        System.out.println();
        System.out.println(count ); //Ptinting of counter

        //Printing an array of indexes
        for (int k = 0; k < indexForArray; k++) {
            System.out.print(arrayOfIndex[k] + " " );
        }                                                                                               //array 2
    }
}
