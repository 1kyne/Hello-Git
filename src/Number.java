import java.util.Scanner;

/**
 * @author 1kyne
 * @create 2019/11/6 - 14:44
 */

public class Number {
    public void transform(int num) {
        int arr[] = new int[10];
        int count = 0;
        while (num != 0) {
            int remainder = num % 11;
            num = num / 11;
            arr[count] = remainder;
            count++;
        }
        show(arr, count - 1);
    }

    private void show(int[] arr, int n) {
        for (int i = n; i >= 0; i--) {
            if (arr[i] > 9) {
                System.out.print((char) (arr[i] + 55));
            } else
                System.out.print(arr[i] + "");
        }
    }

    public static void main(String[] args) {
        Number t = new Number();
        System.out.print("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        t.transform(number);
    }
}