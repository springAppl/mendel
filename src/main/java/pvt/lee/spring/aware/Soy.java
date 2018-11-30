package pvt.lee.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

public class Soy implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
