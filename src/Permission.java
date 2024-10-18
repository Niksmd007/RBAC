public class Permission {
   private String permissionId;
    private String action;

    public Permission(String permissionId, String action) {
        this.permissionId = permissionId;
        this.action = action;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public String getAction() {
        return action;
    }
}
