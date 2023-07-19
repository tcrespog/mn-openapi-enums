package mn.openapi.enums.controller

import io.micronaut.http.HttpResponse

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import mn.openapi.enums.model.Breed
import mn.openapi.enums.model.Dog
import mn.openapi.enums.model.Trait

@CompileStatic
@Controller
class DogController {

    @Get('/dog')
    HttpResponse<Dog> get() {
        Dog dog = new Dog(
                name: 'Rex', breed: Breed.GERMAN_SHEPHERD,
                traits: EnumSet.of(Trait.QUICKNESS, Trait.COURAGE, Trait.LOYALTY)
        )

        return HttpResponse.ok(dog)
    }

}
