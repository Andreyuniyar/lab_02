//public class Main {
//    public static void main(String[] args) {
//        int mas[] = {121, 201, 555, 456, 425, 666, 502, 800, 20, 10, 15, 13, 16, 850, 454, 232, 150, 17, 50};
//        int count = 0;
//        int summ = 0;
//        for (int i = 0; i <= 19; i++){
//            if ((mas[i] / 100) != 0){
//                if ((mas[i] / 100) != 0){
//                    count++;
//                    summ += mas[i];
//                }
//            }
//        }
//        System.out.println("Кол-во: " + count);
//        System.out.println("Сумма: " + summ);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int mas[] = {121, 201, 555, 456, 425, 666, 502, 800, 20, 10, 15, 13, 16, 850, 454, 232, 150, 17, 50};
//        int max_nam = 0;
//        for (int i = 0; i <= 19; i++){
//            if ((mas[i] % 2 == 0) && (mas[i] > max_nam)){
//                max_nam = mas[i];
//            }
//        }
//        System.out.println("Наибольшее число: " + max_nam);
//    }
//}

//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        int mas[] = {121, 201, 555, 456, 425, 666, 502, 800, 20, 10, 15, 13, 16, 850, 454, 232, 150, 17, 50};
//        Integer mas2[] = new Integer[20];
//        Arrays.fill(mas2, 0);
//        for (int i = 0; i <= 19; i++){
//            if (mas[i] % 10 == 3){
//                mas[2] = mas[i];
//            }
//        }
//        Arrays.sort(mas2, Collections.reverseOrder());
//        System.out.println(Arrays.toString(mas2));
//    }
//}

//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        String mas[] = new String[1000000];
//        Arrays.fill(mas, 'String');
//        String mas2[] = new String[];
//        String mas3[] = new String[];
//        long StartTime = System.nanoTime();
//        for (int i = 0; i < 1000000; i++){
//            mas2[i] == mas1[i]
//        }
//        long EndTime = System.nanoTime();
//        long Duration = StartTime - EndTime;
//        System.out.println("For: " + Duration);
//        StartTime = System.nanoTime();
//        System.arraycopy(mas, 0, mas3, 0, 1000000);
//        EndTime = System.nanoTime();
//        Duration = StartTime - EndTime;
//        System.out.println("System: " + Duration);
//        StartTime = System.nanoTime();
//        String[] mas4 = Arrays.copyOf(mas, 1000000);
//        EndTime = System.nanoTime();
//        Duration = StartTime - EndTime;
//        System.out.println("Arrays: " + Duration);
//    }
//}

// import static java.lang.Math.*;
// public class Main {
   
//     public static void main(String[] args) {
//         double[] mas = {16.5, 15.3, 1.3, 1.9. 100.2};
//         long output = 0
//         for (int i = 0; i < 5; i++){
//             System.out.printf(mas[i] + " ");
//         }
//         System.out.println();
//         for (int i = 0; i < 5; i++){
//             output = pow(mas[i], 2) - 10*mas[i] + 15;
//             System.out.printf(output + " ");
//         }
//         System.out.println();
//         for (int i = 0; i < 5; i++){
//             output = 2 * sin(toRadians(mas[i]) + PI / 3);
//             System.out.printf(output + " ");
//         }
//         System.out.println();
//         for (int i = 0; i < 5; i++){
//             output = exp(sqrt(mas[i]));
//             System.out.printf(output + " ");
//         }
//     }
// }


