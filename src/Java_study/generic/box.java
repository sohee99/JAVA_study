package Java_study.generic;

/*public class box {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}

제네릭 사용후 */

public class box<String> {
    private String t;

    public String get() {
        return t;
    }

    public void set(String t) {
        this.t = t;
    }
}