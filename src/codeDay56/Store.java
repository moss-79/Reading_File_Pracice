package codeDay56;



import java.util.ArrayList;
import java.util.List;

public class Store {

    String name; // adding a field so we can give a name to Store Object when we create one
    List<Product> allProducts ; // adding a field so we can give a name to Store object when we create one

    public Store(){
        this.name = "Cybertek Store";
        this.allProducts = new ArrayList<>();
    }

    //

    public Store(String name, List<Product>otherList){
        this();
        this.name = name;

        allProducts.addAll(otherList);
    }
}
