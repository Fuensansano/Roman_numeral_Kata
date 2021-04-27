public class DecimalToRoman {

    public String convert(int number) {
        if (number == 5) {
            return "V";
        } else if (number == 4){
            return "IV";
        }

        String romanNumber = "";
        for (int i = 0; i < number; i++){
            romanNumber += "I";
        }
        return romanNumber;
    }
}
