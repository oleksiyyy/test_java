package objects;

public class Student extends User{

    private String groupName;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public int hashCode() {
        return 32;
    }
}
