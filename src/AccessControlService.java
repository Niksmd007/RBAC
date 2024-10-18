public class AccessControlService {
    public void assignRoleToUser(Role role, User user){
         user.addRole(role);
    }
    public boolean checkPermission(User user, Resource resource,String action){
        for (Role role : user.getRoles()){
            for(Permission permission : role.getPermissions()){
                if(permission.getAction().equals(action)){
                    return true;
                }
            }
        }
        return  false;
    }
}
