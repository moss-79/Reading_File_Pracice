package codeDay47;

public class ExtremeSport extends Sport {

//    @Override
//    public void doSomething() {
//    //    super.doSomething();
//        System.out.println("doing extreme sport");
//    }
//
    public void doSomething(int x ) {

        System.out.println("doing extreme sport");
    }


    @Override
    // this final keyword is
    // blocking sub class of ExtremeSport
    // to to Override this method
  // public  final void doSomethingElse() {
    public void doSomethingElse() {
        //    super.doSomethingElse();
        System.out.println(" doing something else in extreme sport");
    }
}
