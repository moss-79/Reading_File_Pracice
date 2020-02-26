package codeDay55;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
//        c1.addNum(100);
   //     c1.addNum(100).addNum(200).addNum(100);
          
              c1.addNum(100);
                 c1.addNum(200)
                .addNum(100)
                .addNum(50)
                .displayFinalResult();


                 c1.result = -1000;

    }

}