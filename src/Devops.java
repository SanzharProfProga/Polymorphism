public class Devops extends Developer{
    public Devops(String fullName, String level, byte age) {
        super(fullName, level, age);
    }

    @Override
    public void coding() {
        System.out.println("Devops checks and fixes the code");
    }

    @Override
    public String toString() {
        return "Devops: " + super.toString();
    }
}
