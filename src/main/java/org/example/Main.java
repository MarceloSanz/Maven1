package org.example;

import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alumno obj = new Alumno("Marcelo",23,"marcelo.herce@gmail.com");
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        System.out.println(json);
        int[] ints = {1, 2, 3, 4, 5};
        gson.toJson(ints);
        int[] ints2 = gson.fromJson("[1,2,3,4,5]", int[].class);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}