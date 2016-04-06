package com.maheshkapoor.ng;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SubscriptionController {

	@RequestMapping(value="/subscribe", method = RequestMethod.GET)
	public ModelAndView subscribe(HttpServletRequest request) {
		int maxLength = 200;
		String orderDetails = getOrderDetails(request);
        String truncatedOrderDetails= truncate(orderDetails,maxLength);

		ModelAndView model = new ModelAndView("DemoPage");
		model.addObject("NewString",truncatedOrderDetails);

		return model;
	}

	private String truncate(String orderDetails, int length) {
		String repString = " ... (truncated) ... ";
		  if ((orderDetails != null) && (orderDetails != "") && (length > 0))
		  	{
			 if(length> orderDetails.length() || length<repString.length()+2)
			 	{
		  		return orderDetails; 	
		  	}else{
		 
		  		int sepLen = repString.length();
		        int charsToShow = length - sepLen;
		        int frontChars = (int)Math.ceil(charsToShow/2);
		        int backChars = (int)Math.floor(charsToShow/2);
		 
		    return orderDetails.substring(0, frontChars) + 
		           repString + 
		           orderDetails.substring(orderDetails.length() - backChars);
		  	}
		 	}
		 	return orderDetails;
	}

	private String getOrderDetails(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details."
				+ "This is test data for News Group interview. Its a long log file details.";
	}

}
