package pvt.lee.spring.scope;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements InitializingBean {

    @RequestMapping("/api/hello")
    public String hello(){
        return "hello";
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("HelloController create");
    }
}
