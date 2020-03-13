package com.randyblanchard.buslocator2.controllers;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.randyblanchard.buslocator2.models.BusRoute;

@Controller
public class HomeController {

	@Autowired
	@Qualifier("hibernateSession")
	Session hibernateSession;
	
	@GetMapping("/")
	public String showHomePage() {
		return "HomePage";
	}
	
	@GetMapping("/showBusLocator")
	public String showBusLocator(@RequestParam String busRoutes, 
			@RequestParam String busStops, 
			@RequestParam String Time,
			Model model) throws Exception {
		System.out.println(busRoutes);
		System.out.println(busStops);
		// next stop - current time = waitTime
		System.out.println(LocalDateTime.now());
		
		String hql = "SELECT BR.time FROM BusRoute BR WHERE BR.stop = :currentStop";
		Query<?> query = hibernateSession.createQuery(hql);
		query.setParameter("currentStop",busStops);
		List<?> results = query.list();
		
		for (Object obj : results) {
			Timestamp ts = (Timestamp)obj;
			Long tsTime = ts.getTime();
			System.out.println(tsTime);
		}

		
		//Integer waitTime = 30;
		//model.addAttribute("waitTime", waitTime);
		//return "BusLocator";
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1 = (Date) format.parse(Time);
		Date date2 = (Date) format.parse(Time);
		long difference = date2.getTime() - date1.getTime();
		System.out.println(difference/1000);
		return hql;
	}
	
	public ModelAndView showBusTime() {
		ModelAndView mav = new ModelAndView();
		BusRoute Bus= new BusRoute();
		return mav;
		
	
	}
	@GetMapping("/showBusLocator")
	
	
	
}

