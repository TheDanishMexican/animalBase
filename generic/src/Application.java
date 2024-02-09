public class Application {
    public Application() {}

    public void start() {
        Animal testAnimal = new Animal("Filippa jumping potato", 22);
        System.out.println(testAnimal);
    }

    public static void main(String[] args) {
        Application application = new Application();


        application.start();
    }
}
