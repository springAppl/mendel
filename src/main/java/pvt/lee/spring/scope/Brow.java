package pvt.lee.spring.scope;

import org.springframework.web.client.RestTemplate;

public class Brow {

    public static void main(String[] args){
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    RestTemplate template = new RestTemplate();
                    template.getForObject("http://127.0.0.1:8080/api/inc", Object.class);
                }
            });
            thread.start();
        }
    }



}
