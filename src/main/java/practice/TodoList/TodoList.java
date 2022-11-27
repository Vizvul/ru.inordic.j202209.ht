package practice.TodoList;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<String> todolist = new ArrayList<>();


    public List<String> getTodolist() {
        return todolist;
    }

    public void setTodolist(List<String> todolist) {
        this.todolist = todolist;
    }

    public void list(){
        String result = "";
        for (int i = 0; i < todolist.size(); i++) {
            result = result + i + " - " + todolist.get(i) + System.lineSeparator();
        }
        System.out.println(result);
    }

    public void add(String inter){
        todolist.add(inter);
    }

    public void add(int value, String inter) {
        todolist.add(value,inter);
    }

    public void edit(int value, String inter){
        todolist.add(value,inter);
        todolist.remove(value+1);
    }

    public void delete(int value){
        todolist.remove(value);
    }

    public int size(){
        int result = 0;
        result = todolist.size();
        return result;
    }

}
