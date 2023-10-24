public class Burger {
    public boolean cookie;
    public boolean oneMeet;
    public boolean cheese;
    public boolean greens;
    public boolean mayonnaise;

    Burger() {
        this.cookie = true;
        this.oneMeet = true;
        this.cheese = true;
        this.greens = true;
        this.mayonnaise = true;
        System.out.println(this);
    }

    Burger(boolean cookie, boolean oneMeet, boolean cheese, boolean greens) {
        this.cookie = cookie;
        this.oneMeet = oneMeet;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = false;
        System.out.println(this);
    }

    Burger(boolean cookie, boolean oneMeet, boolean cheese, boolean greens, boolean mayonnaise) {
        this.cookie = cookie;
        this.oneMeet = oneMeet;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Бургер з " +
        "булочка - " + cookie + ", " +
        (oneMeet ? "м'ясо, " : "подвійне м'ясо, ") +
        "сир - " + cheese + ", " +
        "зелень - " + greens + ", " +
        "майонез - " + mayonnaise;
    }

}
