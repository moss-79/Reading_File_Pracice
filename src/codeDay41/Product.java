package codeDay41;

// Make this product a well encapsulated
// make all the instance fields private so it can only be accessible in same class
// provide public getters and setters method
public class Product {
    //  this keyword can be used to refer the current object
    // we are working on
    // we can use it to refer the instance field
    // this.fieldName
    // only can be used inside instance method (and later constructor)

       private String name;
       private double price ;

       public String getName(){
           return this.name;
          // return name;

       }
       public void setName(String newName){
           //name = newName;
           this.name = name;
        }
        public double getPrice(){
           return price;
        }
        public void setPrice(double newPrice){
        /*   if(myPrice > 0)
               price = myPrice;

         */
    }



}
