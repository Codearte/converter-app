package io.codearte.converter.domain

import io.codearte.props2yaml.Props2YAML
import org.springframework.stereotype.Component

@Component
class PropsConversionService {

    String convertToYaml(String props){
        return Props2YAML.fromContent(props).convert()
    }
}
