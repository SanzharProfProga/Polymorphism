public class Developer {
    private String fullName;
    private String level;
    private byte age;

    public Developer(String fullName, String level, byte age) {
        this.fullName = fullName;
        this.level = level;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void coding(){

    }

    @Override
    public String toString() {
        return "\nFull name: " + fullName +
                "\nLevel: " + level +
                "\nAge: " + age;
    }
}
