package ejercicio_02_sorting;

import controllers.StackGeneric;

public class StackSorter {
 
    public StackSorter(){

    }

    public void sortStack(StackGeneric<Integer> stack) {
        StackGeneric<Integer> aux = new StackGeneric<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!aux.isEmpty() && (aux.peek() > temp)) {
                stack.push(aux.pop());
            }
            aux.push(temp);
        }
        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
    }
}
