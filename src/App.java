import controllers.StackGeneric;
import ejercicio_01_sign.*;
import ejercicio_02_sorting.StackSorter;
public class App {
    public static void main(String[] args) throws Exception {
        /*StackGeneric<Integer> stackGeneric = new StackGeneric<Integer>();
    
        stackGeneric.push(1);
        stackGeneric.push(4);
        stackGeneric.printStack();
        System.out.println("Length: " + stackGeneric.length);

        StackGeneric<String> stackGenericString = new StackGeneric<String>();
        stackGenericString.push("Uno");
        stackGenericString.push("Cuatro");
        stackGenericString.printStack();
        */

        
        /*Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        ColaGenerica<Persona> colaPersonas = new ColaGenerica<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);   
        colaPersonas.add(p3);
        System.out.println("Size: " + colaPersonas.size());
        colaPersonas.printCola();
        /*System.out.println("Atienes a la persona => " + colaPersonas.remove());
        System.out.println("Size: " + colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("Persona encontrada: " + colaPersonas.findByName("Maria"));
        Persona personaEliminada = colaPersonas.removeByName("Maria");
        System.out.println("Persona eliminada: " + personaEliminada);

        colaPersonas.printCola();
        */

        String texto = "()[]{}";

        System.out.println("Texto:" + texto);
        SignValidator validar = new SignValidator();
        boolean respuesta = validar.isValid(texto);

        System.out.println("El texto \"" + texto + "\" es : " + respuesta);
        
        StackGeneric<Integer> stack = new StackGeneric<>();
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(1);
        stack.push(4);
        System.out.println("Pila original:");
        stack.printStack();
        StackSorter sorter = new StackSorter();
        sorter.sortStack(stack);
        System.out.println("Pila ordenada:");
        stack.printStack();

    }
}
