package io.codearte.converter

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest")
class MainController {

    @RequestMapping(method = RequestMethod.GET)
    String print() {
        return "foo"
    }

}
