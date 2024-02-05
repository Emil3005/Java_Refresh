import java.util.Stack;

public class Task2 {

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        int i = 0;
        String currentString = "";

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                // Extract the count of repetition
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(count);
            } else if (ch == '[') {
                // Push current result and reset currentString
                resultStack.push(currentString);
                currentString = "";
                i++;
            } else if (ch == ']') {
                // Pop count and previous result, repeat the currentString and append
                StringBuilder temp = new StringBuilder(resultStack.pop());
                int count = countStack.pop();
                for (int j = 0; j < count; j++) {
                    temp.append(currentString);
                }
                currentString = temp.toString();
                i++;
            } else {
                // Accumulate characters
                currentString += ch;
                i++;
            }
        }

        return currentString;
    }

    public static void main(String[] args) {
        String input = "3[b2[ca]]";
        String output = decodeString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
