/**
 * Created by wscown on 2/2/16.
 */

//Enumerated type for morality
enum Morality {GOOD, EVIL}

public class SuperHuman extends Human{
    private Morality morality;
    private String heroName;
    private String ability;

    public Morality getMorality() {
        return morality;
    }

    public void setMorality(Morality morality) {
        this.morality = morality;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "SuperHuman{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", address=" + getAddress() +
                "morality=" + morality +
                ", heroName='" + heroName + '\'' +
                ", ability='" + ability + '\'' +
                '}';
    }

    public void printSuperHuman(){
        System.out.println(toString());
    }

    //returns an int for the purpose of testing. printHuman method in Class returns 0. This method will override the printHuman  method and return 1
    public int printHuman(){
        System.out.println(super.toString());
        return 1;
    }
}
