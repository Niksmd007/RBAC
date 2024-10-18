public class Main {

    public static void main(String[] args) {
	// write your code here
        //create users
        User user1=new User("1","user1");
        User user2=new User("2","user2");

        //create roles
        Role adminRole=new Role("1","ADMIN");
        Role userRole=new Role("2","USER");

        //create permissions
        Permission readPermission =new Permission("1","READ");
        Permission writePermission= new Permission("2","WRITE");

        //create resource
        Resource fileResource=new Resource("1","FILE");

        //give addPermissions to roles
        adminRole.addPermissions(writePermission);
        userRole.addPermissions(readPermission);

        //add roles to user using access controller service
        AccessControlService accessControlService =new AccessControlService();
        accessControlService.assignRoleToUser(adminRole,user1);
        accessControlService.assignRoleToUser(userRole,user2);

        //check permissions
        System.out.println(accessControlService.checkPermission(user1,fileResource,"READ"));
        System.out.println(accessControlService.checkPermission(user2,fileResource,"READ"));

        System.out.println(accessControlService.checkPermission(user1,fileResource,"WRITE"));
        System.out.println(accessControlService.checkPermission(user2,fileResource,"WRITE"));
    }
}
