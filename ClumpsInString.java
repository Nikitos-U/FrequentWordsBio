import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClumpsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Genome = scanner.nextLine();
        int k = scanner.nextInt();
        List<String> frequent = FrequentWords.frequentWords(Genome,k);
        for (int i = 0; i < frequent.size(); i++) {
            System.out.println(frequent.get(i));
        }
//        int k = scanner.nextInt();
//        int L = scanner.nextInt();
//        int t = scanner.nextInt();
    }
}



