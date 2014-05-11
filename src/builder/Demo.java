package builder;

/**
 * Demonstrates builder pattern.
 */
public class Demo {
    public static void main(String[] args) {
        User user1 = new User.UserBuidler("Yang", "Song").age(24).address("State College").phone("11111111").build();
        User user2 = new User.UserBuidler("Yingying", "Hu").age(24).address("State College").build();
        System.out.println(user1);
        System.out.println(user2);
    }
}
