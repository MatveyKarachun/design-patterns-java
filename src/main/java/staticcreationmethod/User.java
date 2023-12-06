package staticcreationmethod;

public class User {
    private final long id;
    private final String name;
    private final String email;
    private final String phone;


    User(long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
