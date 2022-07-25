package com.BookMovie.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.ModelAndView;

import com.BookMovie.demo.curdope.dataTransfer;
import com.BookMovie.demo.person_info.Customer;



@RestController
public class controll {
	ModelAndView dataPage=new ModelAndView();
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private dataTransfer Transfer;
	
	@GetMapping("/")
	public ModelAndView veiw() {
		ModelAndView homePage=new ModelAndView("login.jsp");
		return homePage;
	}
	
	@GetMapping("/login_credencials")
	public ModelAndView verify( String e_mail,String password) {
		String inCorrect="userId or Password is Incorrect";
	    if(Transfer.existsByemail(e_mail)) {
	    	Customer data=Transfer.findByemail(e_mail);
	    	if(password.equals(data.getPassword())) {
	    		//for getting data from an api about movies available in a location
	    		//String url="";
	    		//RestTemplate template=new RestTemplate();
	    		//Object[] result=template.getForObject(url, Object[].class);
	    		//dataPage.addObject("movieData",Arrays.asList(result));
	    		//System.out.println(Arrays.asList(result));
	    		//dataPage.setViewName("data.jsp");
	    		dataPage.setViewName("data.jsp");
	    		return dataPage;
	    	}
	    	else {
	    		dataPage.addObject("in_correct", inCorrect);
	    		dataPage.setViewName("login.jsp");
	    		return dataPage;
	    	}
	    }else {
	    	dataPage.addObject("in_correct",inCorrect);
	    	dataPage.setViewName("login.jsp");
	    	return dataPage;
	    }
	    
	    }
	
	 @GetMapping("/data")
	 public ModelAndView post(Customer user){
		 System.out.println(user.getPhno());
		Transfer.save(user);
		dataPage.setViewName("login.jsp");
		return dataPage;
	}
	
		@GetMapping("/movie")
		public ModelAndView sendEmail( String e_mail, String movieName) {
			SimpleMailMessage message=new SimpleMailMessage();
			message.setFrom("sandeep.dabbakutiuni.de@gmail.com");
			message.setTo(e_mail);
			message.setSubject("Boook a a show");
			message.setText("Hey you have booked a movie"+movieName);
			mailSender.send(message);	
			System.out.println("mailsent");
			dataPage.setViewName("data.jsp");
    		return dataPage;
				
			}
		

	
}
