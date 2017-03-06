package by.mozgo.gift.factoryMethod;

import by.mozgo.gift.entity.Cookie;
import by.mozgo.gift.entity.CookieForm;

/**
 * @author Andrei Mozgo
 */
public class CookieCreator implements SweetCreator<Cookie> {
    @Override
    public Cookie createSweet(String[] cookieParameters) throws IllegalArgumentException {
        String name = cookieParameters[1];
        float price = Float.parseFloat(cookieParameters[2]);
        int weight = Integer.parseInt(cookieParameters[3]);
        int sugar = Integer.parseInt(cookieParameters[4]);
        CookieForm form = CookieForm.valueOf(cookieParameters[5].toUpperCase());
        return new Cookie(name, price, weight, sugar, form);
    }
}