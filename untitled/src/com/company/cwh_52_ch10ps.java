package com.company;

class CirclePracticeSet{
    public int radius;

    CirclePracticeSet(int a)
    {
        System.out.println("This is inside from a circle constructor");
        this.radius=a;
        System.out.println("the radius is now being assinged to = "+radius);
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class CylinderPracticeSet extends CirclePracticeSet{
    public int height;

    CylinderPracticeSet(int r,int h)
    {
        super(r);
        System.out.println("This is inside from a cylinder constructor");
        this.height = h;
    }
    public double volume(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
}

public class cwh_52_ch10ps {
    public static void main(String[] args) {

//         Problem1
//        CirclePracticeSet c = new CirclePracticeSet(12);
//        System.out.println(c.area());

        CylinderPracticeSet cps = new CylinderPracticeSet(10,20);
        System.out.println(cps.area());

    }
}
