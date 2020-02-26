package replit.RepLit232;

public class EducationalInstitution {

    private int years;

    public EducationalInstitution(int years) {
        this.years = years;
    }
    public  String graduationRequirements(){
        return ""+years+ "years of study and passing the bar.";
    }

}
