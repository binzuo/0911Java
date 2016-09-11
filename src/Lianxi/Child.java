package Lianxi;

/**
 * Created by Administrator on 2016/9/11.
 */
public class Child extends Parent{
    {
        System.out.println("child constructor block");
    }
    static {
        System.out.println("child static block");
    }
    public Child(){
        System.out.println("child constructor");
    }
}
//class test{
   // public static void main(String[] args){
    //    new Child();



