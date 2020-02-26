package codeDay31;

public class SeasonChecker {
    public static void main(String[] args) {

        // a String variable declared and assigned value inside main method
        // it can be accessible in main method
        String season = "Winter";
        decideSeasonAction(season);decideSeasonAction("Winter");// both of these are the same
       decideSeasonAction("Summer");


        String MySeason = "AAAA";
        decideSeasonAction(MySeason);
    }

    /*
    write a static method called decideSeasonAction
    it has one String parameter called season
    inside method method :
    according to what user passed it should print correct action
     */
    public static void decideSeasonAction(String season) {
        // this  season method parameter can only be accessible inside method body
        switch (season) {

            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Hiking");
                break;
            case "Fall":
                System.out.println("Pumpkin ");
                break;
            case "Winter":
                System.out.println("GO Snowboarding ");
                break;
            default:
                System.out.println("INVALID SEASON");
        }
    }
}