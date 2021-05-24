package pu.fmi.masters.projecta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pu.fmi.masters.projecta.service.HelloService;

/**
 * Example controller.
 */
@RestController
public class HelloController {
	
	private HelloService helloService;
	
	/**
	 * Constructor.
	 * 
	 * @param helloService - object of type {@link HelloService}.
	 */
	@Autowired
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}
	
	/**
	 * Example endpoint.
	 * 
	 * @return - string representing response.
	 */
	@GetMapping(path = "/")
	public String index() {
		return helloService.hello();
	}

}
