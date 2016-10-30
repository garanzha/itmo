import java.util.Random;

/**
 * домашнее задание по второму занятию
 */
public class lesson03 {
    public static void main(String[] args) {

        //=======================МАССИВЫ==============================
        /*1) Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
        Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20*/
        int mas[] = new int[10];
        for (int i = 1; i <= mas.length; i++) {
            mas[i - 1] = i * 2;
            System.out.print(mas[i - 1] + " ");
        }
        System.out.println();
        System.out.println("------------------------");

        /*2) Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив
        выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).*/
        int mas2[] = new int[50];
        for (int i = 1; i <= mas2.length; i++) {
            mas2[i - 1] = i * 2 - 1;
            System.out.print(mas2[i - 1] + " ");
        }
        System.out.println();
        for (int i = mas2.length - 1; i >= 0; i--)
            System.out.print(mas2[i] + " ");
        System.out.println();
        System.out.println("------------------------");

        /*3) Создайте массив из 15 случайных целых чисел из отрезка [0;9].
        Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.*/
        int mas3[] = new int[15];
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < mas3.length; i++) {
            mas3[i] = random.nextInt(10);
            System.out.print(mas3[i] + " ");
            if (mas3[i] % 2 == 0) count = count + 1;
        }
        System.out.println();
        System.out.println("Кол-во четных элементов: " + count);
        System.out.println("------------------------");

        /*4) Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
        Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.*/
        int mas4[] = new int[8];
        for (int i = 0; i < mas4.length; i++) {
            mas4[i] = random.nextInt(10) + 1;
            System.out.print(mas4[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas4.length; i++) {
            if (i % 2 != 0)
                mas4[i] = 0;
            System.out.print(mas4[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------");

        /*5) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в
        двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
        из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).*/
        int mas51[] = new int[5];
        int mas52[] = new int[5];
        double avg51 = 0;
        double avg52 = 0;
        for (int i = 0; i < mas51.length; i++) {
            mas51[i] = random.nextInt(6);
            mas52[i] = random.nextInt(6);
            avg51 = avg51 + mas51[i];
            avg52 = avg52 + mas52[i];
        }
        avg51 = avg51 / (double) mas51.length;
        avg52 = avg52 / (double) mas52.length;
        printMas(mas51);
        printMas(mas52);
        if (avg51 == avg52)
            System.out.println("Средние арифметические двух массивов равны " + avg51);
        else if (avg51 > avg52)
            System.out.println("Средние арифметическое первого массива(" + avg51 + ") больше второго(" + avg52 + ").");
        else
            System.out.println("Средние арифметическое второго массива(" + avg52 + ") больше первого(" + avg51 + ").");
        System.out.println("------------------------");

        /*6) Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
        Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.*/
        int mas6[] = new int[4];
        mas6[0] = random.nextInt(90) + 10;
        boolean isMasIncreased = true;
        for (int i = 1; i < mas6.length; i++) {
            mas6[i] = random.nextInt(90) + 10;
            if (mas6[i] < mas6[i - 1])
                isMasIncreased = false;
        }
        printMas(mas6);
        if (isMasIncreased)
            System.out.println("данный массив являетя строго возрастающей последовательностью");
        else
            System.out.println("данный массив НЕ являетя строго возрастающей последовательностью");
        System.out.println("------------------------");

        /*7) Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый
        и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.*/
        int masF[] = new int[20];
        masF[0] = 1;
        masF[1] = 1;
        System.out.print(masF[0] + " " + masF[1] + " ");
        for (int i = 2; i < masF.length; i++) {
            masF[i] = masF[i - 2] + masF[i - 1];
            System.out.print(masF[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------");

        /*8) Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом
        массиве максимальным и сообщите индекс его последнего вхождения в массив.*/
        int mas8[] = new int[12];
        Integer maxValue = -16;
        Integer maxIndex = 0;
        for (int i = 0; i < mas8.length; i++) {
            mas8[i] = random.nextInt(31) - 15;
            if (mas8[i] >= maxValue) {
                maxValue = mas8[i];
                maxIndex = i;
            }
        }
        printMas(mas8);
        System.out.println("максимальный эдемент " + maxValue + ", индекс последнего вхождения " + maxIndex);
        System.out.println("------------------------");

        /*9) Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
        Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым
        индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке),
        затем вывести количество целых элементов в третьем массиве.*/
        int mas91[] = new int[10];
        int mas92[] = new int[10];
        double mas93[] = new double[10];
        Integer numCount = 0;
        for (int i = 0; i < mas91.length; i++) {
            mas91[i] = random.nextInt(9) + 1;
            mas92[i] = random.nextInt(9) + 1;
            mas93[i] = (double) mas91[i] / (double) mas92[i];
            if (mas93[i] % 2 == 0) numCount++;
        }
        printMas(mas91);
        printMas(mas92);
        printMasD(mas93);
        System.out.println("Кол-во целых элементов в третьем массиве " + numCount);
        System.out.println("------------------------");

        /*10) Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
        Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.*/
        int mas10[] = new int[11];
        int mas10C[] = new int[3];
        for (int i = 0; i < mas10C.length; i++)
            mas10C[i] = 0;
        for (int i = 0; i < mas10.length; i++) {
            mas10[i] = random.nextInt(3) - 1;
            switch (mas10[i]) {
                case -1:
                    mas10C[0]++;
                    break;
                case 0:
                    mas10C[1]++;
                    break;
                case 1:
                    mas10C[2]++;
                    break;
            }
        }
        printMas(mas10);
        if (mas10C[0] != mas10C[1] && mas10C[0] != mas10C[2] && mas10C[1] != mas10C[2]) {
            maxIndex = 0;
            for (int i = 1; i < mas10C.length; i++)
                if (mas10C[i] > mas10C[maxIndex])
                    maxIndex = i;
            System.out.println("элемент " + (maxIndex - 1) + " встречается максимальное число раз: " + mas10C[maxIndex]);
        }
        System.out.println("------------------------");

        /*11) Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив
        указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа
        должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше: левой или правой,
        либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число, то программа должна
        требовать повторного ввода до тех пор, пока не будет указано корректное значение.
        Boolean isNumCorrect=false;
        while (isNumCorrect=false){

        }*/

        //=======================МНОГОМЕРНЫЕ МАССИВЫ==============================
        /*1) Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.*/
        int masMNG[][] = new int[8][5];
        for (int i = 0; i < masMNG.length; i++) {
            for (int j = 0; j < masMNG[i].length; j++) {
                masMNG[i][j] = 10 + (int) (Math.random() * 90);
                System.out.print(masMNG[i][j] + " ");
            }
            System.out.println();
        }
    }

    //метод вывода на экран одномерного массива int
    public static void printMas(int mas[]) {
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }

    //метод вывода на экран одномерного массива double
    public static void printMasD(double mas[]) {
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }
}
