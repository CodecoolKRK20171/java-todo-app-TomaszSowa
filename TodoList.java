import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList {

    private ArrayList<TodoItem> todoList;
    private Scanner input = new Scanner(System.in);

    public TodoList() {
        todoList = new ArrayList<TodoItem>();
    }

    public ArrayList<TodoItem> getTodoList() {
        return todoList;
    }
    
    public void displayList() {
        String mark;
        System.out.println("\nTodo List:");
    
        int i = 1;
        for (TodoItem item : todoList) {
            mark = (item.getDone()) ? " [v]" :" [ ]";
            System.out.println(i + ") " + item.getName() + mark);
            i++;
        }
    }

    public void addItem() {
        String name = inputName();
        todoList.add(new TodoItem(name));
    }

    public void archiveDone() {
        for (TodoItem item : todoList) {
            if (item.getDone()) {
                todoList.remove(item);
            }
        }
    }

    private String inputName() {
        return input.nextLine();
    }
    
}
