package inheritance;

public class JavaLanguage implements Language {
    @Override
    public void print(String version) {
        System.out.println("java " + version);
    }
}
