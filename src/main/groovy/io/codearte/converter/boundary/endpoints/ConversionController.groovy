package io.codearte.converter.boundary.endpoints

import io.codearte.converter.boundary.documents.Conversion
import io.codearte.converter.domain.PropsConversionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ConversionController {

    private final PropsConversionService conversionService

    @Autowired
    ConversionController(PropsConversionService conversionService) {
        this.conversionService = conversionService
    }

    @RequestMapping(value = '/conversions', method = RequestMethod.POST)
    ResponseEntity<Conversion> create(@RequestBody Conversion conversion) {
        conversion.yaml = conversionService.convertToYaml(conversion.properties)
        return new ResponseEntity<Conversion>(conversion, HttpStatus.OK)
    }

}
