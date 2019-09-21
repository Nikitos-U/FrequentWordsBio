public class PatternCount {
    public static int patternCount(String text, String pattern) {
        int count = 0;
        for (int i = 0; i <= text.length() - pattern.length(); i++)
            if (text.regionMatches(true,i,pattern,0,pattern.length())){
                count++;
            }
        return count;
    }
}

