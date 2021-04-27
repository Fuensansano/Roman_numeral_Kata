public class DecimalToRoman {

    public String convert(int number) {
        String romanNumber = "";
        if(number >= 5) {
            romanNumber += "V";
            number -= 5;
        } else if (number == 4) {
            return "IV";
        }

        for (int i = 0; i < number; i++) {
            romanNumber += "I";
        }
        return romanNumber;
    }
}
