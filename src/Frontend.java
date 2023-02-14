public class Frontend extends  Developer{
    public Frontend(String fullName, String level, byte age) {
        super(fullName, level, age);
    }

    @Override
    public void coding() {
        System.out.println("The interface is written in 'JavaScript'");
    }

    @Override
    public String toString() {
        return "\nFrontend: " + super.toString();
    }
}
