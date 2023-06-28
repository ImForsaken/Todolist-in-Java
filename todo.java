import java.util.Scanner;

public class todo implements TodoMethods {

    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);
        TodoMethods.addTodo();
        System.out.println("Alle Todos: " + TodoMethods.getAllTodos());

        //TodoMethods.removeTodo(todoIndex);
        TodoMethods.removeTodo();

        System.out.println("Alle Todos nach Löschung: " + TodoMethods.getAllTodos());

        returnOptions();


        int todoIndex = scannerNumber.nextInt();
        lifeCycle(todoIndex);
        System.out.println("Alle Todos: " + TodoMethods.getAllTodos());
    }

    public static void returnOptions() {
        System.out.println("Was möchtest du tun?");
        System.out.println("1 um ein Todo hinzuzufügen");
        System.out.println("2 um ein Todo zu löschen");
        System.out.println("3 Um das Programm zu Beenden");
    }

    public static void lifeCycle(int index) {
        if (index == 1) {
            System.out.println("Alle Todos: " + TodoMethods.getAllTodos());
            TodoMethods.addTodo();
        } else if(index == 2) {
            System.out.println("Alle Todos: " + TodoMethods.getAllTodos());
            TodoMethods.removeTodo();
        } else if (index == 3) {
            return;
        }
        WriteToFile.main();
        restartCycle();
    }

    public static void restartCycle() {
        System.out.println("Alle Todos: " + TodoMethods.getAllTodos());
        returnOptions();
        Scanner scannerNumber = new Scanner(System.in);
        int todoIndex = scannerNumber.nextInt();
        lifeCycle(todoIndex);
    }

}
