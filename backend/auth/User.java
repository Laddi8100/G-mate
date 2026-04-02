import java.util.HashMap;

public class AuthService {
    private HashMap<String, User> users = new HashMap<>();

    public boolean signup(String username, String password) {
        if (users.containsKey(username)) {
            return false; // user already exists
        }
        users.put(username, new User(username, password));
        return true;
    }

    public boolean login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}