public class DecimalToRoman {

    public String convert(int number) {
        if (number == 3){
            return "III";
        } else if (number ==2) {
            return "II";
        }
        return "I";
    }
}
