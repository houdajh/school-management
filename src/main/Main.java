package main;

import util.InputUtil;
import util.MenuUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the school operation Centre");
        while (true) {
            int operation = InputUtil.enterInt("what do you want to do?" +
                    "\n1-Register Documents" +
                    "\n2-show all Student" +
                    "\n3-Find Student" +
                    "\n4-Update Student" +
                    "\n0-To Quit");
            switch (operation) {
                case 1: {
                    MenuUtil.registerStudent();
                        break;
                }
                case 2:  {
                    MenuUtil.printAllStudent();
                    break;
                }
                case 3:  {
                    MenuUtil.findStudent();
                    break;
                }
                case 4: {
                    MenuUtil.updateStudent();
                    break;
                }
                case 0:{
                    System.out.println("Quiting from the system!\n");
                    break;

                }

            }
        }



    }
}
