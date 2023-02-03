package JavaReflection;

public class Person {

    public String firstName;
    public String lastName;
    private int age;
    private long phoneNo;

    public Person(String firstName, String lastName, int age, long phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNo = phoneNo;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    /**
     * Private constructor to set the age
     * @param age
     */
    private void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    /**
     * Private constructor to set the mobile no.
     * @param phoneNo
     */
    private void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
        System.out.println("[ Phone No : "+ phoneNo + " ]");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
