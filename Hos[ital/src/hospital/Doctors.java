package hospital;

public class Doctors extends Workers {
    private final double bonus=2;
    double bonusDoctor=bonus*getReward();

    public double getBonus() {
        return bonusDoctor;
    }



    public Doctors(String firsName, String lastName, double reward){
        super(firsName, lastName, reward);

    }
}
