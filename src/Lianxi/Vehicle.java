package Lianxi;

/**
 * Created by Administrator on 2016/9/11.
 */
public class Vehicle {

    String type; // car, train, plain, ...
    String color; //
    double weight; //
    double maxSpeed;
    boolean transport(){
        System.out.println("交通工具是运输的主要工具");
        return true;
    }
}