package meshalkin.generics;

public class Generics<T, U> {
    private String string = "";

    public String getString() {
        return string;
    }

    public void addToString(T t, U u) {
        if (this.string.equals("")) {
            this.string = this.string + t.toString() + " " + u.toString();
        } else {
            this.string = this.string + " - " + t.toString() + " " + u.toString();
//            this.string = this.string + "\n" + t.toString();
        }
    }
}
