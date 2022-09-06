package com.example.assignjava3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/steps")
public class TutorialStepsController {

    @RequestMapping("/discover")
    public String showDiscoverStep(){ return "pages/step-1-discover"; }

    @RequestMapping("/create")
    public String showCreateStep(){ return  "pages/step-2-create"; }

    @RequestMapping("/publish")
    public String showPublishStep(){ return "pages/step-3-publish"; }
}
