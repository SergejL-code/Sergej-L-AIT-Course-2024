package ClassWork_025.string_builder;

public class StringBuilderAppl {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("_").append("21").append(225).append(sb);
        System.out.println(sb);

        //Revers String

        sb.reverse();
        System.out.println(sb);
     StringBuilder sbNew = new StringBuilder("Hello");
     sbNew.insert(5,"!");
        System.out.println(sbNew);
        sbNew.append(true);
        System.out.println(sbNew);

    }

}//end of class
