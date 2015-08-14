package Trainee.model;

/**
 * Created by phirayu on 7/17/15.
 */
public class Box<T> {
    private T data;
    public void add(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
}
