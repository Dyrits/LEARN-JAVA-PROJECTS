package codecademy.languageinheritance;

public class Mayan extends Language {

    Mayan(String name, int numSpeakers) {
        super(name, numSpeakers, "Central America", "Verb | Object | Subject");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Fun fact: " + this.name + " is an ergative language.");
    }
}