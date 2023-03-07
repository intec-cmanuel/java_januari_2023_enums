package be.intecbrussel.settersvsthisdotproperty;

public class Person {
    private String name;
    private double heightInCM;

    public Person(String name, double heightInCM) throws Exception {
        this.name = name;
        setHeightInCM(heightInCM);
    }

    public Person(String name, double heightInCM, boolean bool) throws Exception {
        setName(name);
        setHeightInCM(heightInCM);
    }

    public String getName() {
        return name;
    }

    public double getHeightInCM() {
        return heightInCM;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeightInCM(double heightInCM) throws Exception {
        if (heightInCM > 0) {
            this.heightInCM = heightInCM;
        } else {
            throw new Exception();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", heightInCM=" + heightInCM +
                '}';
    }
}
