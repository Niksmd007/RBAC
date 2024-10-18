import java.util.HashSet;
import java.util.Set;

public class Role {
    private String roleId;
    private String roleName;
    private Set<Permission> permissions;

    public Role(String roleId,String roleName){
        this.permissions=new HashSet<>();
        this.roleId=roleId;
        this.roleName=roleName;
    }

    public String getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }
    public void addPermissions(Permission permission){
        permissions.add(permission);
    }
}
