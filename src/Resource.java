public class Resource {
    private String resourceId;
    private String resourceName;

    public Resource(String resourceId, String resourceName) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
    }

    public String getResourceId() {
        return resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }
}
