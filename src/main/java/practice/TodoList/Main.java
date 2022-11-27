package practice.TodoList;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();
        todoList.add("TestString i need 0");
        todoList.add("TestString i need 1");
        todoList.add("TestString i need 2");
        todoList.add("TestString i need 3");
        todoList.add("TestString i need 4");


        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Выберите команду и соответвуюшее действие - LIST, ADD, EDIT, DELETE, OUT");
            String todo = scanner.nextLine();

            String LIST = "LIST";
            String ADD = "ADD";
            String EDIT = "EDIT";
            String DELETE = "DELETE";
            String OUT = "OUT";

            String buffer = "";
            String result = "";

            int testWhile = 0;

            String numbers = "[0-9].*";

            String item = "";
            int value = 0;
            String inter = "";

            int end = 0;

            Pattern pattern = Pattern.compile(numbers);
            Matcher matcher;


            if (todo.startsWith(LIST)) {
                todoList.list();
            }

            if (todo.startsWith(ADD)) {
                todo = todo.substring(4,todo.length());
                System.out.println("posle udalrybz =" + todo);

                if(todo.matches(numbers)){
                    System.out.println("Popal v blok s chislami");
                    String[] string = todo.split(" ");
                    value = Integer.parseInt(string[0]);
                    for (int i = 1; i < string.length-1; i++) {
                        item = item + string[i] + " ";
                    }
                    item = item + string[string.length-1];
                    if (value > todoList.size()){ value = todoList.size();}
                    todoList.add(value,item);
                } else {
                    System.out.println("Popal v bes chisel todo = " + inter);
                    todoList.add(todo);
                }
            }

            if (todo.startsWith(EDIT)) {
                todo = todo.substring(5, todo.length());
                String[] string = todo.split(" ");
                value = Integer.parseInt(string[0]);
                for (int i = 1; i < string.length - 1; i++) {
                    item = item + string[i] + " ";
                }
                item = item + string[string.length - 1];
                if (value <= todoList.size()) {
                todoList.edit(value, item);
            }
            }

            if (todo.startsWith(DELETE)){
                todo = todo.substring(7,todo.length());
                value = Integer.parseInt(todo);
                if (value <= todoList.size()) {
                    todoList.delete(value);
                }
            }

            if (todo.startsWith(OUT) || testWhile == 5){
                work = false;
            }
            testWhile++;

        }
    }
}
