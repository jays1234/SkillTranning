package model;

/**
 * Created by phirayu on 7/17/15.
 */
public class DeclareAndAccess {
    public String publicString; // Class 	Package 	Subclass 	World
    protected  String protectedString;//Class 	Package 	Subclass
    String defaultString;// Class 	Package
    private String privateString;//Class

    public DeclareAndAccess(){

    }


    public DeclareAndAccess(String defaultString){
        this.defaultString=defaultString;
    }

    public String getDefaultString() {
        return defaultString;
    }

    public void setDefaultString(String defaultString) {
        this.defaultString = defaultString;
    }

    public String getPrivateString() {
        return privateString;
    }

    public void setPrivateString(String privateString) {
        this.privateString = privateString;
    }
}
