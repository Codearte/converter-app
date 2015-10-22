package io.codearte.converter

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {

    @Value('${application.version}')
    private String version

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("version", version)
        return "index"
    }
}
