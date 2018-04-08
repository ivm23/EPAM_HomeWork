package exceptions;

public class NotFoundKey extends Exception {
    private String key;
    private String errorMessage;

    public NotFoundKey(String key) {
        this.key = key;
        errorMessage = "The key is not found!";
        System.out.println("Not found key: " + key);
    }
}
