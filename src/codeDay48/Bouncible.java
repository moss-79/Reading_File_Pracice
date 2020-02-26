package codeDay48;

public abstract interface Bouncible {

    // ALL THE MEMBERS IN INTERFACE IN THE PUBLIC
    // THIS IS EXCLUSIVE TO INTERFACE TYPE
    // NOWWHERE ELSE YOU GET THIS AT ALL !!!!!!!!!!!!!!
    // if we don't add any part of public static final for the field
    // all interface fields are automatically public static final
    double gravity = 9.81;

 //  public static final double gravity = 9.81;
    // every memre of interface automatically public
    // if no access modifier is given
    // all the method with no body automatically public abstract
    // void bounce();

    public abstract void  bounce();

}
