package com.techelevator.npgeek;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDao;
import com.techelevator.npgeek.model.Survey;
import com.techelevator.npgeek.model.Weather;


@Controller
public class NPController {
	
	@Autowired 
	private ParkDao parkDao;
	
	@RequestMapping("/")
	public String showHomePage(ModelMap modelHolder) {
		List<Park> allParks = parkDao.getAllParks();
		modelHolder.put("allParks", allParks);
		return "homePage";
	}
	
	@RequestMapping("/detailPage")
	public String showDetailPage(@RequestParam String parkCode, ModelMap modelHolder) {
		Park selectedPark = parkDao.getParkByCode(parkCode);
		modelHolder.put("park", selectedPark);
		List <Weather> parkWeatherDays = parkDao.getWeatherByParkCode(parkCode);
		modelHolder.put("allWeather", parkWeatherDays);
		return "detailPage";
	}
	
	@RequestMapping("/survey")
	public String showSurveyPage(ModelMap modelHolder) {
		if( ! modelHolder.containsAttribute("Survey")) {
			modelHolder.addAttribute("Survey", new Survey());
		}
		List<Park> allParks = parkDao.getAllParks();
		modelHolder.put("allParks", allParks);
		return "surveyPage";
	}
	
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String submitRegisterForm(
			@Valid @ModelAttribute("Survey") Survey registerFormValues,
			BindingResult result,
			RedirectAttributes flash
	){
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "Survey", result);
			flash.addFlashAttribute("Survey", registerFormValues);
			return "redirect:/survey";
		}
		
		flash.addFlashAttribute("message", "You have voted.");
		
		return "redirect:/confirmation";
	}
	
	
	
	
	

}
