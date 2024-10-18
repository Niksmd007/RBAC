import java.util.HashSet;
import java.util.Set;

public class User {
    private String userId;
    private String userName;
    private Set<Role> roles;

    public User(String userId,String userName){
        this.userId=userId;
        this.userName=userName;
        this.roles=new HashSet<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void addRole(Role role){
        roles.add(role);
    }
}
