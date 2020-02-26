package codeDay43;

public class Coffee {
    private String type;
    private int CaffeineLevel ;
    private double price;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        CaffeineLevel = caffeineLevel;
    }

    public int getCaffeineLevel() {
        return CaffeineLevel;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public Coffee(){
        System.out.println("no arg constructor");
    }
    public Coffee(String type , int caffeineLevel   ) {
        this.type = type;
        this.CaffeineLevel = caffeineLevel;
        System.out.println("2 arg constructor");
    }

    public Coffee(String type , int caffeineLevel , double price   ){
        this.type = type;
        this.CaffeineLevel = caffeineLevel;
        this.price = price ;
        if (price > 0 ) {
        this.price = 1;
        }else {
            this.price = 1;
        }


    }

}
