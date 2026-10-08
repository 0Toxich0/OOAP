package practice2.part2;

public class ProcessStrings implements StringProcessor {

    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String getOddChars(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}