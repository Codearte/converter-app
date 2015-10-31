package io.codearte.converter.boundary.endpoints

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class IndexController {

    @Value('${application.version}')
    private String version

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        model.put("version", version)
        return "index.html"
    }

    @RequestMapping(value = "/conversion", method = RequestMethod.GET)
    public String conversion(Map<String, Object> model) {
        model.put("version", version)
        return "index.html"
    }
}
