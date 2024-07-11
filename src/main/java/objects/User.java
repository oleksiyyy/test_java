package objects;

public class User {

    private String name;

    private String lastname;

    private int age;

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setLastname (String lastname) {
        this.lastname = lastname;
    }

    public String getLastname () {
        return lastname;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User){

            User thatUser = (User) obj;

            return this.name.equals(thatUser.getName())
                    && this.lastname.equals(thatUser.getLastname())
                    && this.age == thatUser.getAge();
        }

        return false;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastname + " " + this.age;
    }

}
