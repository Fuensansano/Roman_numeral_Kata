public class DecimalToRoman {
    private String symbols [] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    private int values [] =     {1000,900, 500,400, 100, 90, 50,  40,  10,  9,  5,   4,  1};
    public String convert(int number) {
        String romanNumber = "";

        for (int i = 0; i < symbols.length ; i++) {
            romanNumber += this.concatenate(symbols[i], number / values[i]);
            number %= values[i];
            if (number == 0) {
                return romanNumber;
            }
        }

        return romanNumber;
    }

    private String concatenate(String symbol, int quantity) {
        String romanNumber = "";
        for (int i = 0; i < quantity; i++) {
            romanNumber += symbol;
        }
        return romanNumber;
    }
}
