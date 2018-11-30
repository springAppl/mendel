package pvt.lee.spring.scope;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements InitializingBean {

    private int count = 0;

    @RequestMapping("/api/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/api/inc")
    public void inc(){
        ++count;
    }

    @RequestMapping("/api/count")
    public Integer count(){
        return count;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("HelloController create");
    }
}
