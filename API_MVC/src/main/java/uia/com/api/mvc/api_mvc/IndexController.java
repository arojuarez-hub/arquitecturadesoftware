package uia.com.api.mvc.api_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class IndexController {

    /SameReturnValue/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String showIndex(){
        return "Hola UIA 1...";
    }

}
