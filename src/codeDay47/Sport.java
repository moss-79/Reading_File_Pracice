package codeDay47;

// can not extend if the class is final
public class Sport  {

    // final method can not be overridden in sub class
    // it can be just used as is in sub class
    // just like family tradition
    // it should stay in generations to come
    // we can just use it as is
    public void doSomething(){
        System.out.println("doing regular sport");
    }

    public void doSomethingElse(){
        System.out.println("something else ");
    }
}

