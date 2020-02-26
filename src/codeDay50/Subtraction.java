package codeDay50;

public class Subtraction extends Question {

    public Subtraction(int num1 ,int num2   ){

        super("Subtraction question ", "-");



        if(num1 < num2){
            int temp = num1;
            num1 = num2 ;
            num2 = temp ;
        }
        // After making sure num1 is more than num2 then we set the field value

        this.num1 = num1;
        this.num2 = num2;

    }

    @Override
    public void calculate(){
        answer = num1 - num2 ;
        // calculated is the instance field to keep track of the Question
        // is calculated or not
        calculated = true;
    }

    public String toString() {
        if(calculated == true){
            return num1+ operator + num2 + " = "+ answer ;
        }else {
            return num1 + operator + num2 ;
        }
    }
}
