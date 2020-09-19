package homeworks.september_13.task1;

public class JavaDeveloper extends Developer{

    public JavaDeveloper() {
        super();
        System.out.println("Colling JavaDeveloper constructor");
    }

    protected void sayMyName(String name, String town) {
        super.sayMyName(name);
        System.out.println("You are from " + town);
    }
}
