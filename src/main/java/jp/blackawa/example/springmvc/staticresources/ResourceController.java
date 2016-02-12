package jp.blackawa.example.springmvc.staticresources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResourceController {
    @RequestMapping(value = "/staticResourceTest")
    public String staticResource (Model model) {
        return "staticResourceTest";
    }

    @RequestMapping(value = "/resourceBundleTest")
    public String resourceBundle(Model model) {
        return "resourceBundleTest";
    }
}
