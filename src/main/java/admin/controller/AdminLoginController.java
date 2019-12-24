package admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminLoginController {
	
	@RequestMapping(value = "admin/main", method=RequestMethod.GET)
	public void main() {
		
	}
	
	@RequestMapping(value="/admin/login")
	public void login() {
		
	}
	
}
