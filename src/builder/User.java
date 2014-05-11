package builder;

/**
 * {@code User} classes constructed with builder pattern
 */
public class User {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    private User(UserBuidler buidler) {
        this.firstName = buidler.firstName;
        this.lastName = buidler.lastName;
        this.age = buidler.age;
        this.phone = buidler.phone;
        this.address = buidler.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "First Name: " + firstName + "; " +
                "Last Name: " + lastName + "; " +
                "Age: " + age + "; " +
                "Phone: " + phone + "; " +
                "Address: " + address + ".";
    }

    public static class UserBuidler {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone = "";
        private String address = "";

        public UserBuidler(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuidler age(int age) {
            this.age = age;
            return this;
        }

        public UserBuidler phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuidler address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
