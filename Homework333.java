import com.sun.tools.hat.internal.util.ArraySorter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Homework333 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* Задание 1
        int size = scanner.nextInt();
        int[] a=new int[size];
        */

        /* Задание 2
        int size=scanner.nextInt();
        int[] a=new int[size];
        for(int i=0; i<size;i++){
            a [i]=scanner.nextInt();
        */


        /* Задание 3

        double[] myList = {5.1, 6.9, 3.7, 9.2, 3.5};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");

            }

            double min = myList[0];
            for (int i = 1; i < myList.length; i++) {
                if (myList[i] < min) min = myList[i];
            }
            System.out.println("Наименьший элемент: " + min);

            */


        /* Задание 4

        double[] myList = {5.1, 6.9, 3.7, 9.2, 3.5};
            double max = myList[0];
            for (int i = 1; i < myList.length; i++) {
                if (myList[i] > max) max = myList[i];
            }
            System.out.println("Наибольший элемент: " + max);

            */

            /* Задание 5

            int[] array = new int[] {5,6,43,65,3,5,6,5,2,13, 3};

            int x = 5;
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if(array[i]==x){
                    count++;
                }
            }

            System.out.println("Кол-во повторений = " + count);
            */

            /* Задание 6
            int[] a = new int[]{5, 6, 3, 2, 7, 3, 9, 5, 6};
            for (int j = 0; j < a.length; j++) {
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < a.length; i++)
                System.out.println("a[" + i + "]=" + a[i]);
           */

            /* Задание 7
        int[] array = new int[]{5, 6, 43, 5, 3, 5, 6, 5, 2, 13, 5};
        int x=5;
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == x){
                j++;
            }
        }
        System.out.println("Максимальное кол-во повторений" + j);
          */

            /* Задание 8
        int[] array = new int[]{5, 6, 43, 4, 3, 43, 6, 5, 2, 13, 13};
        int q=2;
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == q){
                j++;
            }
        }
        System.out.println("Минимальное кол-во повторений" + j);
        */


            /* Задание 9
        Scanner input = new Scanner(System.in);
        System.out.println("Размер массив: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Размер массива:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);}
            */



        }
    }

















