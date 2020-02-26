package codeDay48;



public class Lion extends Mammals {

    @Override
    public void drinkMilk() {
        System.out.println(" LION DRINKS MILK");
    }

    @Override
    public void makeNoise() {
        System.out.println("LION SAYS ROARRRRRRRR!!!!");
    }

    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

    }
}
