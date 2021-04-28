public class DecimalToRoman {

    public String convert(int number) {
        String romanNumber = "";
        if (number >= 10) {
            romanNumber += this.concatenate("X", number / 10);
            number = number % 10;
        } else if (number == 9) {
            return "IX";
        } else if (number >= 5) {
            romanNumber += "V";
            number -= 5;
        } else if (number == 4) {
            return "IV";
        }

        romanNumber += this.concatenate("I",number);
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
