package com.company;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //task1();//вывести четные числа от 1 до 99
        //task2(in);//Дано число n при помощи цикла for посчитать факториал n!
        //task3(in);//Перепишите программы с использованием цикла while.
        //task4(in);//Перепишите программы с использованием цикла do - while.
        //task5(in);//Даны переменные x и n вычислить x^n.
        //task6();//Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        //task7(args[0]);//Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
        //task8();//Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку,// разделяя запятой.
        //task9(args);//Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).
        //task10(args);//В массиве из задания 9. найти наибольший элемент.
        //task11();// Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
        //task12();//Найти среднее арифметическое всех элементов массива.
        //task13();//(*)Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)

    }

    private static void task13() {
        String [][] chessBoard = new String[8][8];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task12() {
        int[] numbers = {4, -5, 0, 6, 8 };
        double result = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            result  = sum / numbers.length;
        }
        System.out.println(result);
    }

    private static void task11() {
        int a[] = { 4, -5, 0, 6, 8 }; // набиваем массив каким нибудь хламом
        int max = a[0];
        int imax = 0;
        int min = a[0];
        int imin = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                imax = i;
            }
            if (a[i] < min) {
                min = a[i];
                imin = i;
            }
        }
        a[imin] = max;
        a[imax] = min;
        for (int i = 0; i < a.length; i++) {
            System.out.println("i=" + i + " a[" + i + "]=" + a[i]);
        }
    }

    private static void task10(String[] args) {
        int[] nums = new int[] {2,31,4,1,5,6,2,7,8,1,11 };
        int max=-2147483646;
        for (int i=0;i< nums.length;i++) {

            if (nums[i]>max)
            {
                max=nums[i];
            }

        }
        System.out.println("Максимальное число:"+max);
    }

    private static void task9(String[] args) {
        int[] nums = new int[] { 2,31,4,1,5,6,2,7,8,1,11 };


        int min=2147483646;
        int much=0;

        for (int i=0;i< nums.length;i++) {

            if (nums[i]<min)
            {
                min=nums[i];
                much=1;
            }
            else if(nums[i]==min)
            {
                much++;
            }
        }
        System.out.println("Минимальные числа:");
        for (int i=0; i<much;i++)
        {
            System.out.println(min);

        }
    }

    private static void task8() {
        int[] A = new int[10];
        for(int i = 0; i < 10; i++)
            A[i] = 2*i;
        System.out.print(Arrays.toString(A));
    }


    private static void task7(String arg) {
        int value =Integer.parseInt(arg);
        for (int i=0;i<10;i++)
        {
            System.out.println((i+1)+") "+i*value);
        }
    }

    private static void task6() {
        int count=1;
        for(int i=0;count<=10;i-=5)
        {
            System.out.println(i);
            count++;
        }
    }

    private static void task5(Scanner in) {
        double x, n;
        System.out.println("Введите значения х и n:");
        x = in.nextDouble();
        n = in.nextDouble();
        System.out.println("x^n: "+ Math.pow(x,n));
    }

    private static void task4(Scanner in) {
        int n = in.nextInt();
        int result = 1;
        int i=1;
        do
            {
                result = result * i;
                i++;
            } while (i <=n);
        System.out.println("n!= " + result);


        int j=2;
        do {
            System.out.println(j);
            j+=2;
        }
        while (j<99);



    }

    private static void task3(Scanner in) {
        int n = in.nextInt();//2
        int result = 1;
        int i=1;
        while(i <=n) {
           result = result * i;
           i++;
        }
        System.out.println("n!= " + result);

        int j=2;
        while (j<99)
        {
            System.out.println(j);
            j+=2;
        }

    }

    private static void task2(Scanner in) {
        int n = in.nextInt();
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        System.out.println("n!= "+ result );
    }

    private static void task1() {
        for (int i=2;i<99;i+=2)
        {
            System.out.println(i);
        }
    }
}
