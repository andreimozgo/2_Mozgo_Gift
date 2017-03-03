package by.mozgo.gift.entity;

/**
 * @author Andrei Mozgo
 */
public class Cookie extends AbstractSweet {
    private CookieForm form;

    public Cookie(String name, float price, int weight, int sugar, CookieForm form) {
        super(name, price, weight, sugar);
        this.form = form;
    }

    public CookieForm getForm() {
        return form;
    }
}
