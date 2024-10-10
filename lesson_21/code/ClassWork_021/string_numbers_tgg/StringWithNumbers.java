package ClassWork_021.string_numbers_tgg;

public class StringWithNumbers {
    //fields
    private String string;

    //methods

//constructor
    public StringWithNumbers(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringWithNumbers{" +
                "string='" + string + '\'' +
                '}';
    }

    //123 456 987 333    вводимая строка

    public  int sumOfNumbersInString(String string) {
        int sum = 0;
        String[] numbers = string.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }


}//end of class
