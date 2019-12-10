package micronaut.first.thymeleaf.app;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.views.ModelAndView;
import io.micronaut.views.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * In order to create a microservice that responds a simple list of persons you need a controller.
 * @Controller defines the class as a controller mapped to path /main
 * @View refers to the html file which is "index.html" or "simpleTest.html"
 * @Get maps the index method to all requests that use an HTTP GET
 */
@Controller("/main")
public class ApplicationController {

    //list of persons
    ArrayList<Person> persons;

    //Route: http://localhost:8080/main/
    @View("index")
    @Get("/")
    ModelAndView modelAndView() {
        //create model
        Map<String, Object> model = new HashMap<String, Object>();
        //create and add persons to list
        createAndfillList();
        //put persons in model with key "persons"
        model.put("persons", persons);
        //return view and model
        return new ModelAndView("index", model);
    }

    //Route: http://localhost:8080/main/simpleTest
    @View("simpleTest")
    @Get("/simpleTest")
    HttpResponse index() {
        //return key "simpleTest" with value "This Is A Simple Test"
        return HttpResponse.ok(CollectionUtils.mapOf("simpleTest", "This Is A Simple Test"));
    }

    /**
     * Creates three persons and adds them to a list.
     */
    private void createAndfillList() {
        //list with persons to display
        persons = new ArrayList<>();

        //create persons
        Person james = new Person("James");
        Person david = new Person("David");
        Person lisa = new Person("Lisa");

        //add persons to list
        persons.add(james);
        persons.add(david);
        persons.add(lisa);
    }
}