package springmvc.controller;  
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class HomeController {  
@RequestMapping("/hello")  
    public String redirect(Model model)  
    {  
		model.addAttribute("name", "Mjstar");
		model.addAttribute("id", 1234);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Mjstar");
		friends.add("Yash");
		friends.add("Sandeep");
		model.addAttribute("f", friends);
        return "viewpage";  
    }     
@RequestMapping("/helloagain")  
public String display()  
{  
    return "final";  
}  

@RequestMapping("/help")  
public ModelAndView help()
{
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("name", "Mjstar");
	modelAndView.addObject("rollNumber", 21);
	LocalDateTime now = LocalDateTime.now();
	modelAndView.addObject("time", now);
	
	List<Integer> list = new ArrayList<Integer>();
	list.add(12);
	list.add(123);
	list.add(1234);
	list.add(12345);
	
	modelAndView.addObject("mark", list);
	//Setting the view name
	modelAndView.setViewName("help");
	return modelAndView;
}

}  