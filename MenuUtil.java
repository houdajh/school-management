package util;

import main.Configuration;
import main.Student;

public class MenuUtil {
    public static void printAllStudent(){
        if(Configuration.students==null){
            System.out.println("you do not have any Student\n");
            return;
        }
        System.out.println("Student that you have registred:\n");
        for (int i=0;i<Configuration.students.length;i++){
            Student st= Configuration.students[i];
            System.out.println((1+i)+".Student\n"+st.getInfo());
        }
    }
    public static void registerStudent(){
        int count=InputUtil.enterInt("how many students do you want to register?\n");
        Configuration.students=new Student[count];// Configuration.students est un obj d un tab students
        for (int i=0;i<count;i++){
            System.out.println((i+1)+"-Register");
            Student st=InputUtil.fill();//st obj dyal student
            Configuration.students[i]=st;
        }
    }
    public static void findStudent(){
        String find=InputUtil.enterString("enter name or surname that you want to find ;\n");
        for (int i=0;i<Configuration.students.length;i++){
            Student st= Configuration.students[i];
            if(st.getName().equalsIgnoreCase(find) || st.getSurname().equalsIgnoreCase(find)){
                System.out.println(st.getInfo());
            }
            else {
                System.out.println("Student not found\n");
            }

        }
    }
    public static void updateStudent(){
        int update=InputUtil.enterInt("In which Student you want to update:\n");
        System.out.println("Enter new information:\n");
        Student st=InputUtil.fill();
        Configuration.students[update-1]=st;
        System.out.println(st.getInfo());
    }

}
