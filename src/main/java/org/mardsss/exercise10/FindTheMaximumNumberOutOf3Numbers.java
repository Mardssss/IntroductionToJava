package org.mardsss.exercise10;

public class FindTheMaximumNumberOutOf3Numbers {
    public static void findTheMaximum(){
        int a = 10;
        int b = 11;
        int c = 19;
        if(a>b && a>c){
            System.out.println("the maximum number out of "+a+"  "+b+"  "+c+" is: "+a);
        } else if (b>a && b>c) {
            System.out.println("the maximum number out of "+a+"  "+b+"  "+c+" is: "+b);
        }else {
            System.out.println("the maximum number out of "+a+"  "+b+"  "+c+" is: "+c);
        }
    }
}
