public class program {
    public static void main(String[] args) {
        User user = new User();
        user.firstName = "David"; // Setting a property
        user.lastName = "Zhou";
        System.out.println(user.getFullName());
    }
}
