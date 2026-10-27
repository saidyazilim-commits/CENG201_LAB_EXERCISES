package Exercise1;

public class BalancedBrackets {
    public static boolean isBalanced(String s) {

        // Create a stack
        BracketStack stack = new BracketStack();

        // TODO:
        // 1. Traverse the string character by character.
        // 2. If the character is an opening bracket,
        //    push it onto the stack.
        // 3. If it is a closing bracket:
        //      - Check whether the stack is empty.
        //      - Pop the top opening bracket.
        //      - Check whether the brackets match.(call isMatchingPair method)
        // 4. At the end, check whether the stack is empty.
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                // En son açılan parantezi çıkar ve eşleşiyor mu bak
                char open = stack.pop();
                if (!isMatchingPair(open, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {

        // Check: ( matches )
        if (opening == '(' && closing == ')') {
            return true;
        }
        // Check: [ matches ]
        else if (opening == '[' && closing == ']') {
            return true;
        }
        // Check: { matches }
        else if (opening == '{' && closing == '}') {
            return true;
        }
        // if check doesn't match; then return false
        else {
            return false;
        }
    }
}
