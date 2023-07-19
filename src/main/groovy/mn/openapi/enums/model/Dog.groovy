package mn.openapi.enums.model

import groovy.transform.CompileStatic

@CompileStatic
class Dog {

    String name
    Breed breed
    Set<Trait> traits

}
