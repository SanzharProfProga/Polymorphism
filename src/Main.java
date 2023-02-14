public class Main {
    public static void main(String[] args)
    {
//        Developer деген класс түзүңүз, анын coding() деген методу болсун
//        Programmer'ди мурастаган Backend, Frontend, Devops деген 3 класс
//        түзүңүз. Бул 3 класс parent класстагы coding() методун @Override
//            кылсын, бирок реализациясы башкача болсун.
//            Массив түзүп бир backend, frontend жана devops'ту салыңыз жана ал
//        массивдеги программисттерди код жаздырыңыз.
        
        Developer devops = new Devops("Sanzhar Abdymomunov","Senior",(byte) 21);
        Developer backend = new Backend("Ilim Shabdanov" ,"Senior",(byte) 20);
        Developer frontend = new Frontend("Alibek Altynbek uulu","Senior",(byte) 24);
        Developer [] developers = {devops,backend,frontend};
        for (Developer developer:developers) {
            System.out.println(developer.toString());
            developer.coding();
        }

    }
}