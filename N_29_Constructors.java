package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 10;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class N_29_Constructors {
    public static void main(String[] args) {
        MyMainEmployee neel = new MyMainEmployee("Constructor", 100);
        //MyMainEmployee neel = new MyMainEmployee();
        neel.setName("Constructor");
        neel.setId(100);
        System.out.println(neel.getId());
        System.out.println(neel.getName());
    }

}





