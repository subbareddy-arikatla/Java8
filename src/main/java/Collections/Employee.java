package Collections;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String region;
    private double sal;

    public Employee() {
    }

    public Employee(int id, String name, int age, String region, double sal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.region = region;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", region='" + region + '\'' +
                ", sal=" + sal +
                '}';
    }
}
