public class dz_3 {
    public static void main(String[] args) {
        double[] numbers = {8.0, 1.2, -2.5, -4.3, 2.0, 3.0, 6.0, -7.0, 0.5, -1.1, 4.2, 1.1, -3.5, 2.8, 5.5};
        boolean foundFirstNegative = false;
        double sum = 0;
        int count = 0;
        for (double num : numbers) {
            if (!foundFirstNegative) {
                if (num < 0) {
                    foundFirstNegative = true;
                }
            } else {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }
        }
        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Положительные числа после первого отрицательного не найдены.");
        }
    }
}
