package com.techelevator.npgeek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDao;

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
		return "detailPage";
	}
	
	
	
	
	

}
