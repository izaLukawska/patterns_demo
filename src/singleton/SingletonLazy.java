package singleton;

public class SingletonLazy {

    private String username = "LazyUser";

    private static SingletonLazy instance;

    private SingletonLazy() {}

    public static SingletonLazy getInstance(){
        return instance == null ? new SingletonLazy() : instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
