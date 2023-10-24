package pl.sda.mg.annotations;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.przykladowaMetoda();

        AnnotationProcessor.processAnnotations(app);
    }
}
