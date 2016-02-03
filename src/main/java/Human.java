import java.util.ArrayList;

/**
 * Created by wscown on 2/2/16.
 */

//Enumerated type for gender
enum Gender {MALE, FEMALE}

public class Human {
    private String name;
    private int age;
    private Gender gender;
    private ArrayList<String> address;

    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        SuperHuman superHuman1 = new SuperHuman();
        SuperHuman superHuman2 = new SuperHuman();

        human1.setName("Billy the Kid");
        human1.setAge(21);
        human1.setGender(Gender.MALE);
        human1.setAddress(new ArrayList<String>() {{add("Old Hill Farm"); add("The Wild West"); add("USA");}});

        human2.setName("The Queen");
        human2.setAge(89);
        human2.setGender(Gender.FEMALE);
        human2.setAddress(new ArrayList<String>() {{add("Her Majesty The Queen"); add("Buckingham Palace"); add("London"); add("SW1A 1AA");}});

        superHuman1.setName("Clark Kent");
        superHuman1.setAge(35);
        superHuman1.setGender(Gender.MALE);
        superHuman1.setAddress(new ArrayList<String>() {{add("1938 Sullivan Lane"); add("Midtown"); add("Metropolis"); add("USA");}});
        superHuman1.setMorality(Morality.GOOD);
        superHuman1.setHeroName("Superman");
        superHuman1.setAbility("Flight, superhuman strength, speed, heat vision, freezing breath, x-ray vision");

        superHuman2.setName("Raven Darkhölme");
        superHuman2.setAge(23);
        superHuman2.setGender(Gender.FEMALE);
        superHuman2.setAddress(new ArrayList<String>() {{add("1 Some Place"); add("A city"); add("USA");}});
        superHuman2.setMorality(Morality.EVIL);
        superHuman2.setHeroName("Mystique");
        superHuman2.setAbility("Shape shifting");

        human1.printHuman();
        System.out.println("\n");
        human2.printHuman();
        System.out.println("\n");
        superHuman1.printHuman();
        System.out.println("\n");
        superHuman1.printSuperHuman();
        System.out.println("\n");
        superHuman2.printHuman();
        System.out.println("\n");
        superHuman2.printSuperHuman();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }

    //Returns 0 for testing
    public int printHuman(){
        System.out.println(toString());
        return 0;
    }
}
