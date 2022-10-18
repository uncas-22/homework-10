public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Урок 10. Массивы часть 2. Задача 1");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
        System.out.println("Урок 10. Массивы часть 2. Задача 2");
        arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная трата за день " + min);
        System.out.println("Максимальная трата за день " + max);
        System.out.println();
        System.out.println("Урок 10. Массивы часть 2. Задача 3");
        arr = generateRandomArray();
    }

        int[] arr = generateRandomArray();

        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }

}