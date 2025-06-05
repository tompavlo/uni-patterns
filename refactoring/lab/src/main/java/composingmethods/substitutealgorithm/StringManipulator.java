package composingmethods.substitutealgorithm;

public class StringManipulator {


    public String manipulateString(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLowerCase(ch)) {
                result.append(ch);
            } else if (Character.isUpperCase(ch)) {
                result.append(ch);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
