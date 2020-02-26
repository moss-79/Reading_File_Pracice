package codeDay53;

public class FruitShopUtility {


    public static void main(String[] args) {

        Fruit f1 = new Orange("very Sweet","Blood red",18);
        Fruit f2 = new Apple("Crispy but tasteless","hot red","Gala");

        displayFruit(f1);
        displayFruit(f2);

        Fruit F = new Apple("Sweet", "green","Amba");
        digestBetter(F);


        System.out.println("//------------ getMyFavoriteFruit----------");
        Fruit x = getMyFavoriteFruit();
        x.getDigested();
        System.out.println("My Favorite Fruit = "+ x);

    }
//


  // displayFruit
    public static void displayFruit(Fruit anyFruit){

        System.out.println("Displaying fruit \n"+ anyFruit.toString());
    }

    // create a method called digestBetter
    // it accept a Fruit as parameter type
    // and inside the method , it will digest the Fruit object 4 time then displayInformation

    public  static void digestBetter(Fruit Kazmir){
        for(int i = 0 ; i < 4 ; i++){
            System.out.println(Kazmir.toString());
        }



    }
// create a static method called getMyFavoriteFruit
    // accept no parameter and return your Favorite Fruit Object
    public static Fruit getMyFavoriteFruit(){
        Fruit x = new Apple("Sweet", "blue", "ginger");
        return x ;
    }
//    // sellFruit

    // buyFruit
    //
}
