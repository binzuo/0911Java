package Lianxi;

/**
 * Created by Administrator on 2016/9/11.
 */
public class Plane extends Vehicle {
    String where;
    String shape;
    String material;
    double size;

    void fastestSpeed(){

    }
    void transportClass(){

    }
    void connectionMode(){

    }
    void workingMethod(){

    }
    boolean transport(){
        System.out.println("飞机是运输的主要工具");
       return true;
    }

    public static void main(String[] args){
        Plane plane=new Plane();
        plane.transport();

    }
}
