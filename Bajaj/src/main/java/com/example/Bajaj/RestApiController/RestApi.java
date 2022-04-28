package com.example.Bajaj.RestApiController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/bajaj")
public class RestApi {

	@PostMapping("/req")
	public PojoTemp response(@RequestBody String[] data) {
	  PojoTemp obj=new PojoTemp();
	  
	 for(int i=0;i<data.length;i++)
	 {
		 if(Integer.parseInt(data[i])>= 0 || Integer.parseInt(data[i]) <=1000)
				 {
					 obj.number.add(Integer.parseInt(data[i]));
				 }
				 else
					 obj.alphabets.add(data[i]);
	 }
	  
	  return obj;
	}
	
}//end of class
