package inheritance;

public class LanguageExamples {
    public static void main(String[] args) {
        Language javaLanguage = new JavaLanguage();
        javaLanguage.print("17");
        printLanguage(javaLanguage,"21");



        Language cSharp = new Language() {

            @Override
            public void print(String version) {
                System.out.println("c# version: "+version);

            }
        };
        //cSharp.print("3");
        printLanguage(cSharp,"7.0");
        //method body and method argument is important

        // lambda expressions can be used on functional interfaces

        Language python = (version -> System.out.println("python version: "+version));
        python.print("3");
    }


    private static void printLanguage(Language language, String version) {
        language.print(version);
    }
}
