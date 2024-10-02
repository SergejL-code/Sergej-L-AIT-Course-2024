//package HomeWork_11;
//
//import java.util.Random;
//
//public class ArrowsProba {package HomeWork_11;
//
////The shooter has 10 attempts to hit the target.
//// Simulate 10 shots using a random number sensor.
////Answer the question, how many points did the shooter score? Did he ever hit the center of the target?
////У стрелка есть 10 попыток поразить мишень.
//// Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
//// Ответьте на вопрос, сколько очков набрал стрелок? Попал ли он хоть раз в центр мишени?
//
//import java.util.Random;
//
//    public class Arrows {
//        public static void main(String[] args) {
//            Random random = new Random();
//            int[] schuss = new int[10];
//            int sum = 0;
//
//            for (int i = 0; i < schuss.length; i++) {
//                schuss[i]=random.nextInt(11);
//                sum = sum + schuss[i];
//                int n = random.nextInt(11);
//
//                System.out.print(schuss[i] + "  ");
//
//            }
//            System.out.print("res = " + sum);
//            System.out.println();
//            //boolean apple = false;
//            //if(shot[i == 10]){
//            //  apple = true;
//            for (int i = 0; i < schuss.length; i++)
//                if(schuss[i]==10){
//                    System.out.print("y");
//                }else  {
//                    System.out.print("n");
//
//                }
//
//            //System.out.println();
//
//
//        }
//    }
//
//}
