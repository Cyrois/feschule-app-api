package person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    Person getPerson(String userId) {
        return personRepository.findByUserId(userId);
    }

    Person createPerson(Person person) throws Exception {
        Person existingPerson = personRepository.findByUserId(person.getUserId());
        if(existingPerson != null && existingPerson.getUserId().equals(person.getUserId())) {
            return updatePerson(person);
        } else {
            return personRepository.save(person);
        }
    }

    Person updatePerson(Person person) throws Exception {
        Person existingPerson = personRepository.findByUserId(person.getUserId());
        if(existingPerson.getUserId() == person.getUserId()) {
            return personRepository.save(person);
        } else {
            throw new Exception("could not find a user with id " + person.getUserId());
        }
    }

    List<Person> deletePerson(String userId) throws Exception {
        return personRepository.deleteAllByUserId(userId);
    }
}
