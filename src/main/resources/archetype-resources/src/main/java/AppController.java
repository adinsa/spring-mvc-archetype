package ${package}; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    private static final Logger logger = LoggerFactory
            .getLogger(AppController.class);

    @RequestMapping(value = "/hello")
    public @ResponseBody String helloWorld() {
        logger.info("In '/hello'");
        return "Hello, world!";
    }
}
