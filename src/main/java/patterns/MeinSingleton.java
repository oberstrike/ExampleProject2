package patterns;

public class MeinSingleton {

    private static final MeinSingleton INSTANCE = new MeinSingleton();

    private String configuration = "configuration";

    private MeinSingleton(){

    }

    public static MeinSingleton getInstance(){
        return INSTANCE;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}

