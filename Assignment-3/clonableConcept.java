class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;
    
    public Organization(int code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }
        public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class clonableConcept {
    public static void main(String[] args) {
        Organization org1 = new Organization(1, "Org1", "Address1");
        
        try {
            
            Organization org2 = (Organization) org1.clone();
            System.out.println("Details of org1:");
            org1.printDetails();
            System.out.println("\nDetails of cloned org2:");
            org2.printDetails();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
