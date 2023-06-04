public class Main {
    private static final String[] ROMAN_NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] DECIMALS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String convertToRoman(int number) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < DECIMALS.length; i++) {
            while (number >= DECIMALS[i]) {
                roman.append(ROMAN_NUMERALS[i]);
                number -= DECIMALS[i];
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        int years = 1234;
        String romanYears = convertToRoman(years);
        System.out.println(years + " В римских = " + romanYears);
    }
}
