package polimorfizm;

public class Zoo {
    public static void main(String[] args) {

        Animals[] animals1 = new Animals[3];
        animals1[0] = new Cat("Wisienka");
        animals1[1] = new Dog("Morger");
        animals1[2] = new Animals("Kotozo");
changeName(animals1[0]," Roamn");
        for (Animals animals : animals1) {
            animals.givesound();
        }
    }
    private static void changeName(Animals animals, String newname ){
        animals.setName(newname);

    }
}
