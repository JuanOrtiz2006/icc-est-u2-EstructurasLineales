package ejercicio_01_sign;

import controllers.StackGeneric;

public class SignValidator {

    public SignValidator(){

    }

    public boolean isValid(String s){
        StackGeneric<Character> stack = new StackGeneric<>();
        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                stack.push(caracter);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if ((caracter == ')' && top == '(') ||
                    (caracter == ']' && top == '[') ||
                    (caracter == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
}
