package oops.Encapsulation;

public class Encapsulation1 {

    public static void main(String[] args) {

        Student std = new Student();
        std.setId(1);
        std.setName("anji");
        std.setFees(34232.00);
        std.setContact(630291781);
        std.setIshealthy(true);
        std.setLocation("Peddakadabur");

        int id = std.getId();
        String name = std.getName();
        double fees = std.getFees();
        boolean ishealthy = std.getIsHealthy();
        long contact = std.getContact();
        String location = std.getLocation();

        System.out.println("Id :" + id);
        System.out.println("Name :" + name);
        System.out.println("Fees :" + fees);
        System.out.println("IsHealthy :" + ishealthy);
        System.out.println("Contact :" + contact);
        System.out.println("Location :" + location);
    }
}

class Student {

    private int id;
    private String name;
    private double fees;
    private boolean ishealthy;
    private long contact;
    private String location;


    public int getId() {
        return this.id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return this.fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public boolean getIsHealthy() {
        return this.ishealthy;
    }

    public void setIshealthy(boolean ishealthy) {
        this.ishealthy = ishealthy;
    }

    public long getContact() {
        return this.contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
