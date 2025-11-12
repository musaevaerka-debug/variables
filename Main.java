import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt('i') == 'a')
                count++;
        String result = s.replace   ('a', 'b');
        System.out.println(result);
        System.out.println(count);
    }
}