public class Homework_Leson13
{
    public static void main(String[] args) {
        /*Task 1
-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
-Вывести созданный массив на экран используя цикл for.
-Заменить в созданном массиве значение первого элемента на Kiwi
-Вывести измененный массив на экран используя цикл for.
Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.*/

        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};
        int a = 0;
        for (a = 0; a < fruits.length; a++) {
            System.out.println((a + 1) + " fruit is " + fruits[a]);
        }
        System.out.println("\nThe new list of fruits:");
        fruits[0] = "Kiwi";
        for (a = 0; a < fruits.length; a++) {
            System.out.println((a + 1) + " fruit is " + fruits[a]);
        }
        System.out.println(" ");

        /*Task 2
Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
Задание можно выполнить непосредственно в методе main либо создать отдельный метод.*/

        System.out.println("Even Fruit from the list:");
        for (a = 0; a < fruits.length; a = a + 2) {
            System.out.println(fruits[a + 1]);

        }
        System.out.println(" ");

        System.out.println("Even elements from the Array:");
        for (a = 0; a< fruits.length; a++)
        {
            if (a%2 == 0)
            {
                System.out.println(fruits[a]);
            }
        }

        /*Task 3
Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
public static int findMin(int[] ints)   */

        int[] numbers = {25, 7, 2, 13, 34, 49};
        System.out.println("Minimal number of this array is " + findMinimal(numbers));
    }
        public static int findMinimal (int[]numbers)
        {
            int min = numbers[0];
            for (int b = 0; b < numbers.length; b++) {
                if (numbers[b] < min)
                    min = numbers[b];
            }

            return min;
        }
    }

