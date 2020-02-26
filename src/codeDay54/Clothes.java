package codeDay54;

        import javax.swing.colorchooser.ColorSelectionModel;

public class Clothes implements Wearable {

        int size;

    public Clothes(int size) {
        this.size = size;
        }

    public static void main(String[] args) {


            // ceate a static void method wearMyWearable
            // it has 1 parameter with type Wearable
            // we made it static so we can just call it directly



        // try out all the polymorphic assignment
        // according to these relationship

//        Wearable c1 = new Clothes(30);
//        c1.wear();
//
//        c1 = new Watch();
//        c1.wear();
//
//        c1 = new MakeUps();
//        c1.wear();
//
//        c1 = new Perfume();
//        c1.wear();
//
//        System.out.println("//------------------------");

        Wearable result = getMyWearableObject();
        System.out.println("result = " + result);

        System.out.println(result.getClass().getSimpleName());

        }

    // ceate a static void method wearMyWearable
    // it has 1 parameter with type Wearable
    // we made it static so we can just call it directly

    public static void wearMyWearable(Wearable any){
        any.wear();
    }

    public static Wearable getMyWearableObject(){

        Wearable w  = new MakeUps();

            return w ;
    }

        @Override
    public void wear() {
        System.out.println("Wear the size "+size+" jeans");
        }
        }
class Watch implements Wearable {
        @Override
    public void wear() {
        System.out.println("Wear the watch");
        }
        }

class MakeUps implements Wearable, Cosmetics {

        @Override
     public void wear() {
        System.out.println("Do the makeup");
        }

        }

class   Perfume implements Wearable, Cosmetics {

        @Override
     public void wear() {
        System.out.println("get perfumed");
        }
}