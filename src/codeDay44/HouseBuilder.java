package codeDay44;

public class HouseBuilder {

    public static void main(String[] args) {

        CyberHouse.showNeighborhood();

        CyberHouse c1 = new CyberHouse("Vintage",101);
        c1.showAllInfo();
        CyberHouse c2 = new CyberHouse("Classic",102);
        c1.showAllInfo();


        System.out.println(CyberHouse.neighbourhoodName);
    }
}
