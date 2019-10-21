package pcc.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Region("Person")
public class Person {
	
	
	@Id
	private String id;
	private String first;
	private String last;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Person() {
		super();
		this.first = "";
		this.last = "";
	}
	public Person(String id,String first, String last) {
		super();
		this.id = id;
		this.first = first;
		this.last = last;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}

}
