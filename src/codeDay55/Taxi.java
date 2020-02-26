package codeDay55;

// Taxi Engine -- Driver -- Passengers
// Encapsulate All the fields as homework TASK
public class Taxi {

    int millage;
    Engine eng ;
    Driver dri ;


    public Taxi(int millage, Engine eng, Driver dri) {
        this.millage = millage;
        this.eng = eng;
        this.dri = dri;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "millage=" + millage +
                ", Engine =" + eng +
                ", Driver =" + dri +
                '}';
    }
}


class Engine{

    String type ;
    int horsePower ;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }

}

class Driver {

    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driver ID=" + driverID +
                '}';
    }
}