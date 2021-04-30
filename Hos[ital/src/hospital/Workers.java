package hospital;

public class Workers extends Hospital{
    private String firsName;
    private String lastName;
    private double reward;

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public Workers(String firsName, String lastName, double reward) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.reward = reward;
    }
}
