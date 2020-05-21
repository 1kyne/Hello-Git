import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 1kyne
 * @create 2019/11/6 - 15:14
 */
public class StringTest {
    public void del(String s) {
        Map map = new LinkedHashMap();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (!map.containsKey(c[i])) {
                int count = 1;
                map.put(c[i], count);
                count++;
            } else {
                Integer integer = (Integer) map.get(c[i]);
                integer++;
                map.replace(c[i], integer);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        System.out.print("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        removeMethod(str);
    }

    public static void removeMethod(String s) {
        System.out.println("去重前----:" + s);
        StringBuffer buffer = new StringBuffer(s);
        System.out.println(buffer);
            for (int j = buffer.length() - 1; j >= 0; j--) {
                for (int i = 0; i < j; i++) {
                if (buffer.charAt(i) == buffer.charAt(j)){
                    buffer.deleteCharAt(i);
                    System.out.println(i + "" + j +" "+ buffer.charAt(i) + " " + buffer.charAt(j) + " " + buffer);
                }
            }
            System.out.println(buffer);
        }
        System.out.println("去重后：" + buffer);
    }
}
