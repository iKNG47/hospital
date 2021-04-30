package hospital;

public class Nursers extends Workers {
    private double overtime;

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public Nursers(String firsName, String lastName, double reward, double overtime) {
        super(firsName, lastName, reward);
        this.overtime = overtime;
    }
}
