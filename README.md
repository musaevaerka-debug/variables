import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        count();
    }
    public static void count() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" "); // разделяет строку на слова
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
