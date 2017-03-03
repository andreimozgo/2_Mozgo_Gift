package by.mozgo.gift.entity;

/**
 * @author Andrei Mozgo
 */
public class Cookie extends AbstractSweet {
    CookieForm form;

    public Cookie(float price, int weight, byte sugar, CookieForm form) {
        super(price, weight, sugar);
        this.form = form;
    }

    public CookieForm getForm() {
        return form;
    }
}
