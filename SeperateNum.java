import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        String inputString = args[0];
        String digitStr = "";
        List<Integer> digits = new ArrayList<Integer>();

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                digitStr += inputString.charAt(i);
            } else {
                if (!digitStr.isEmpty()) {
                    digits.add(Integer.parseInt(digitStr));
                    digitStr = "";
                }
            }
        }
        if (!digitStr.isEmpty()) {
            digits.add(Integer.parseInt(digitStr));
            digitStr = "";
        }

        for (Integer i : digits) {
            System.out.println(i);
        }
    }
}
