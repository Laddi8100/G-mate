import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private Map<String, User> users = new HashMap<>();

    // Signup
    public boolean signup(String username, String password) {
        if (users.containsKey(username)) return false; // already exists
        users.put(username, new User(username, password));
        return true;
    }

    // Login
    public boolean login(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }
}