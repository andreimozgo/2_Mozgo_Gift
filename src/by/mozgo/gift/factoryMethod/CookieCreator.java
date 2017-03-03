package by.mozgo.gift.factoryMethod;

import by.mozgo.gift.entity.Cookie;
import by.mozgo.gift.entity.CookieForm;

/**
 * @author Andrei Mozgo
 */
public class CookieCreator implements SweetCreator<Cookie> {
    @Override
    public Cookie createSweet(String name, int ... args) {
        return new Cookie(name, args[0],args[1],args[2],CookieForm.values()[args[3]]);
    }
}