import java.util.ArrayList;
import java.util.List;

public class FrequentWords {
    public static List<String> frequentWords(String text, int k) {
        List<String> allFrequentPatterns = new ArrayList<>();
        int[] count = new int[text.length() - k + 1];
        int max = 0;
        for (int i = 0; i <= text.length() - k; i++) {
            String Pattern = text.substring(i, i + k);
            count[i] = PatternCount.patternCount(text, Pattern);
            allFrequentPatterns.add(Pattern);
            if (max < count[i]) {
                max = count[i];
            }
        }
        String[] frequentPatterns = new String[allFrequentPatterns.size()];
        for (int i = 0; i < text.length() - k + 1; i++) {
            if ((count[i] == max) && !(allFrequentPatterns.get(i).equals(frequentPatterns[i]))) {
                frequentPatterns[i] = (allFrequentPatterns.get(i));
            }
        }
        allFrequentPatterns.clear();
        for (int i = 0; i < frequentPatterns.length; i++) {
            for (int j = 0; j < frequentPatterns.length; j++) {
                if (frequentPatterns[i] == frequentPatterns[j]) {
                    frequentPatterns[i] = null;
                }
            }
        }
        for (int i = 0; i < frequentPatterns.length; i++) {
            if (!(frequentPatterns[i].equals(null))){
                allFrequentPatterns.add(frequentPatterns[i]);
            }
        }
        return (allFrequentPatterns);
    }
}
