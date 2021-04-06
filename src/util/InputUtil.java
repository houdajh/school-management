package util;

import main.Student;

import java.util.Scanner;

public class InputUtil {
    public static int enterInt(String title){
        System.out.println(title);
        Scanner scanner=new Scanner(System.in);
        int operation=scanner.nextInt();
        return operation;
    }
    public static String enterString(String title){
        System.out.println(title);
        Scanner scanner=new Scanner(System.in);
        String answer=scanner.nextLine();
        return answer;
    }
    public static Student fill(){

        String name=InputUtil.enterString("enter student name\n");
        String surname =InputUtil.enterString("enter student surname\n");
        int age=InputUtil.enterInt("enter student age\n");
        String classname=InputUtil.enterString("enter student class name\n");
        return new Student(name,surname,age,classname);
    }

}
