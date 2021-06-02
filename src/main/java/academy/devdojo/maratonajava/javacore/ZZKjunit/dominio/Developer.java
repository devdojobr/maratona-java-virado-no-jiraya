package academy.devdojo.maratonajava.javacore.ZZKjunit.dominio;

public class Developer extends Employee{
    private String mainLanguage;

    public Developer(String id, String mainLanguage) {
        super(id);
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }
}
