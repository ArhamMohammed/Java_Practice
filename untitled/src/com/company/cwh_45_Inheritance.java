package com.company;

class Base {
    int x;

    public int getX() {
        System.out.println("I am getting x now from the base class");
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x now from the base class");
        this.x = x;
    }

    Base() {
        System.out.println("I am a constrcutor");
    }

    public void printMe() {
        System.out.println("I am printMe function");
    }
}

    class Derived extends Base{
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }


public class cwh_45_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println("The value of X is = "+b.getX());

        Derived d = new Derived();
        d.setX(43);
        d.setY(20);
        System.out.println("The value of X is = "+d.getX());
        System.out.println("The value of Y is ="+d.getY());


    }
}
