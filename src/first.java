import java.util.Scanner;

public class first {
    //задача 1
    public static void main(String[] args) {
       /*  задача 2
        byte a = 1;
        int b = 2;
        short c = 3;
        double e = 4.12f;
        float  f = 5.1f;
        boolean flsg = true;
        String str = "строка";
        char d = 'a';
        */

            /* задача 3
            System.out.println(sum(2,3,4,4));
            */
            /* задача 4
            System.out.println(condition(10,20));
            */
           /* задача 5
            Scanner str = new Scanner(System.in);
            System.out.println("Введите челое число ");
            int a = str.nextInt();
            a5(a);
           */
           Scanner str = new Scanner(System.in);
           System.out.println("Введите целое число");
           int a = str.nextInt();
           System.out.println(a6(a));



    }
            /*3задача 3
            public static int sum (int a, int b , int c, int d){
              int s ;
              s = a*(b+(c/d));
              return s;
             }
             */

            /* задача 4
             public static boolean condition(int a, int c){
                if (a+c>=10 && a+c<=20)
                    return true;
                else
                    return false;
               }
            */
           /*задача 5
           public static void a5 (int a ){
                if (a >=0)
                    System.out.println(" Число " + a + " положительное");
                else if (a<0)
                    System.out.println(" Число " + a + " отрицательное");
            }
            */
           public static boolean a6(int a){
               if (a>=0)
                   return true;
               else
                   return false;
           }

}
