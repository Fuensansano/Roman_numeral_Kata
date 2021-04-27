public class DecimalToRoman {

    public String convert(int number) {
        String romanNumber = "";
        for (int i = 0; i < number; i++){
            romanNumber += "I";
        }
        return romanNumber;
    }
}
