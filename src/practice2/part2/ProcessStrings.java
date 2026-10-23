package practice2.part2;

public class ProcessStrings implements StringProcessor {

    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String getOddChars(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i += 2) {
            result += s.charAt(i);
        }
        return result;
    }

    @Override
    public String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}