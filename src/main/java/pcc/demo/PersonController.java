package pcc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	public PersonRepository repo;
	
	@RequestMapping("/")
    public String helloWorld(){
        return "Hello world";
    }
	  
    @RequestMapping("/people")
    public Iterable<Person> people() {
    	repo.save(new Person("0","Mary","Smith"));
		return repo.findAll();
    }
	  

}
