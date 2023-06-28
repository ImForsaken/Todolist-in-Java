import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public interface TodoMethods {

            static ArrayList<String> todoList = new ArrayList<>(Arrays.asList("Putzen"));


             static ArrayList<String> getAllTodos() {
                return todoList;
            }

            static void removeTodo() {
                Scanner scannerNumber = new Scanner(System.in);
                System.out.println("Lösche ein Todo, gebe eine Zahl ein");
                int index = scannerNumber.nextInt();
                if (index >= 0 && index < todoList.size()) {
                    todoList.remove(index);
                } else {
                    System.out.println("Ungültiger Index");
                }
            }

            static void addTodo() {
                System.out.println("Füge ein Todo hinzu: ");
                Scanner scanner = new Scanner(System.in);
                String todoInput = scanner.nextLine();
                TodoMethods.todoList.add(todoInput);
            }


}



