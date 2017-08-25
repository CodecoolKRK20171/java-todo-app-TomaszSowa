/**
 * Class representing a single todo item.
 * 
 */
public class TodoItem{

    private String name;
    private boolean done = false;

    public TodoItem(String name) {
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public boolean getDone(){
        return done;
    }


    public void mark(){
        done = true;
    }

    public void unmark(){
        done = false;
    }
}
