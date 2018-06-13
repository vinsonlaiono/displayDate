package com.vinsonaiono.DisplayDate;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
//	Date date = new Date(0);
//	String strDateFormat = "hh:mm:ss a";
//    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
//    String formattedDate= dateFormat.format(date);
	
	SimpleDateFormat dateString = new SimpleDateFormat("MM/dd/yyy");
	SimpleDateFormat timeString = new SimpleDateFormat("hh:mm a");
	String date = dateString.format(new Date());
	String time = timeString.format(new Date());

	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "index.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("time", time);
		return "displayTime.jsp";
		
	}
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("date", date);
		return "displayDate.jsp";
		
	}

}
