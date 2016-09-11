package Lianxi;

/**
 * Created by Administrator on 2016/9/11.
 */
public class Parent {
    {
        System.out.println("parent constructor block");
    }
    static {
        System.out.println("parent static block");
    }
    public Parent(){
        System.out.println("parent constructor");

    }
}
