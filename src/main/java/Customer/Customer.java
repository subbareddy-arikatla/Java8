package Customer;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private boolean active;
    private String gender;
    private List<LineItem> lineItems;

    public Customer(int id, String name, boolean active, String gender, List<LineItem> lineItems) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.gender = gender;
        this.lineItems = lineItems;
    }
    public Customer(){

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", gender='" + gender + '\'' +
                ", lineItemList=" + lineItems +
                '}';
    }
}
