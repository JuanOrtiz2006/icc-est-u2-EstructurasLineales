import controllers.Cola;
import controllers.ColaGenerica;
import controllers.Stack;
import controllers.StackGeneric;
import models.*;
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

        
        Persona p1 = new Persona("Pablo");
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
        colaPersonas.printCola();*/

        
        System.out.println("Persona encontrada: " + colaPersonas.findByName("Maria"));
        Persona personaEliminada = colaPersonas.removeByName("Maria");
        System.out.println("Persona eliminada: " + personaEliminada);

        colaPersonas.printCola();
    }
}
