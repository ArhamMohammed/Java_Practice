package com.company;

class EkClass{
    public int getA() {
        return a;
    }

    int a;

    EkClass(int a){
        this.a=a;

    }

    public int returnOne(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int c)
    {
        super(c);
        System.out.println("Mai ek constructor hoon");
    }
}

public class ch_47_this_super {
    public static void main(String[] args) {

        EkClass e = new EkClass(65);
        System.out.println("The value of a is = "+e.getA());

        DoClass d = new DoClass(5);
        System.out.println("The value of c is coming from doClass = "+d.getA());

    }
}
