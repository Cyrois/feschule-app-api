package person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(method = RequestMethod.GET, value="/allPeople"
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Person> getAll() {
        return personService.getAllPeople();
    }

    @RequestMapping(method = RequestMethod.GET
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public HttpEntity<Person> get(@RequestParam(value="userId") @NotNull String userId) {
        Person person;
        try {
            person = personService.getPerson(userId);
        } catch (Exception e){
            //TODO add logger
            throw e;
        }

        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person create(@RequestBody Person person) throws Exception {
        return personService.createPerson(person);
    }

    @RequestMapping(method = RequestMethod.PUT
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person update(@RequestBody Person person) throws Exception {
        return personService.updatePerson(person);
    }

    @RequestMapping(method = RequestMethod.DELETE
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public HttpEntity<List<Person>> delete(@RequestParam(value="userId") @NotNull String userId) throws Exception {
        List<Person> personList;
        try {
            personList = personService.deletePerson(userId);
        } catch (Exception e){
            //TODO add logger
            throw e;
        }

        return new ResponseEntity<>(personList, HttpStatus.OK);
    }

    //TODO exception handling http://www.canchito-dev.com/public/blog/2017/04/22/build-a-rest-api-with-spring/
}