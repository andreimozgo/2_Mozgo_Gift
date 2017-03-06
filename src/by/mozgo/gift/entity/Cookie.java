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

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() == this.getClass()) {
            Cookie cookie = (Cookie) obj;
            if (cookie.name.equals(this.name) && cookie.price == this.price && cookie.weight == this.weight
                    && cookie.sugar == this.sugar && cookie.form.equals(this.form)) {
                return true;
            }
        }
        return false;
    }
}
