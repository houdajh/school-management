package main;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String className;
    private int balance=0;

    public Student() {
    }

    public Student(String name, String surname, int age, String className, int balance) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
        this.balance = balance;
    }

    public Student(String name, String surname, int age, String classname) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", balance=" + balance +
                '}';
    }
    public  String getInfo(){
        return "name:"+getName()+",surname:"+getSurname()+",age:"+getAge()+",className:"+getClassName()
                +",balance"+getBalance();
    }
}
