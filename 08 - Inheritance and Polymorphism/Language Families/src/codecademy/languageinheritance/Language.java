package codecademy.languageinheritance;

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args) {
        Language french = new Language("French", 76_000_000, "France", "Subject | Verb | Complement");
        french.getInfo();
        Mayan kiche = new Mayan("Kʼiche", 2_330_00);
        kiche.getInfo();
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 920_000_000);
        SinoTibetan burmese = new SinoTibetan("Burmese", 32_000_000);
        mandarin.getInfo();
        burmese.getInfo();
    }
}
