public class Backend extends Developer{

    public Backend(String fullName, String level, byte age) {
        super(fullName, level, age);
    }

    @Override
    public void coding() {
        System.out.println("The backend is written in 'Java'");
    }

    @Override
    public String toString() {
        return "\nBackend: " + super.toString();
    }
}
