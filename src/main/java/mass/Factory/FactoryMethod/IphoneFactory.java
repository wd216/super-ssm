package mass.Factory.FactoryMethod;

import mass.Factory.entity.Iphone;
import mass.Factory.entity.Phone;

public class IphoneFactory  implements  PhoneFactory{
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}
