import java.util.Scanner;

/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{

    private static Scanner input = new Scanner(System.in);
    

    public static void main(String[] args) {

        TodoList todoList = new TodoList();
        String option;
               
        do {
            System.out.println("\n0) exit\n1) dsiplay list\n2) add item\n3) mark item\n4) unmark item\n5) archive done");
            
            option = input.nextLine();
            if (option.equals("1")) {
                todoList.displayList();
            } else if (option.equals("2")) {
                todoList.addItem();
            } else if (option.equals("3")) {
                todoList.displayList();
                int index = chooseItem();
                todoList.getTodoList().get(index).mark();
            } else if (option.equals("4")) {
                todoList.displayList();
                int index = chooseItem();
                todoList.getTodoList().get(index).unmark();
            } else if (option.equals("5")) {
                todoList.archiveDone();
            }
        } while (!option.equals("0"));
      
        input.close();
    }

    private static int chooseItem() {
        System.out.println("Choose number");
        
        int index = input.nextInt()-1;
        
        return index;
    }
}
