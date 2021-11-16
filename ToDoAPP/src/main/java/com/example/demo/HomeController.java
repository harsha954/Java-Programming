package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")

	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		String Name=request.getParameter("t1");
		String Data=request.getParameter("t2");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home.jsp");
		mv.addObject("Name",Name);
		mv.addObject("Data",Data);
		return mv;
	}
}
