package mass.Factory.SimpleFactory;

import mass.Factory.entity.HuaWei;
import mass.Factory.entity.Iphone;
import mass.Factory.entity.Phone;
import mass.Factory.entity.SanXing;

public class PhoneFactory {
    public Phone createPhone(String tag){
        if ("hw".equals(tag)){
            return new HuaWei();
        } else if ("pg".equals(tag)){
            return new Iphone();
        }else if ("sx".equals(tag)){
            return new SanXing();
        }
        return null;
    }
}
