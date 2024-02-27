public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer() {
        this.member = false;
    }

    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    public String getToString(){
        return "Customer[name="+name+",member="+member+",member type="+memberType+"]";
    }
}
