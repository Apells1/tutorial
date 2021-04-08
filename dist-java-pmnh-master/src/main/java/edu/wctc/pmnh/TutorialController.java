package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tutorials")
public class TutorialController {
    @RequestMapping("/tutorial1")
    public String showTutorial1() {
        return "pages/Tutorial1";
    }

    @RequestMapping("/tutorial2")
    public String showTutorial2() {
        return "pages/Tutorial2";
    }

    @RequestMapping("/tutorial3")
    public String showTutorial3() {
        return "pages/Tutorial3";
    }
}
