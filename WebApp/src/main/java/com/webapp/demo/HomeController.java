package com.webapp.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.webapp.demo.dao.AlienRepo;

@Controller
public class HomeController {
	@Autowired
	AlienRepo repo;
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("homeform")
	public ModelAndView homeform(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("homeform");
		return mv;
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "homeform";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView get(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		Alien alien = repo.findById(id).orElse(new Alien()); 
		mv.addObject("alien",alien);
		mv.setViewName("displayAlien");
		return mv;
	}
	
	@RequestMapping("/updateAlien")
	public ModelAndView get(Alien alien) {
		ModelAndView mv = new ModelAndView();
		repo.save(alien);
		Alien alien2 = repo.findById(alien.getId()).orElse(new Alien()); 
		mv.addObject("alien",alien2);
		mv.setViewName("displayAlien");
		return mv;
	}
	
	@RequestMapping("/deleteAlien")
	public void delete(@RequestParam int id) {
		repo.deleteById(id);
	}
	
	@RequestMapping("/fetchAlienByQuery")
	public ModelAndView fetchAlienByQuery(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		List<Alien> alien  = repo.findByLang("java");
		List<Alien> alien2 = repo.findByIdGreaterThan(id);
		List<Alien> alien3 = repo.findByCustomQuery(id);
		System.out.println("by lang:" + alien + "/nby id greater than :" + alien2 + "\nby custom query:" + alien3);
		mv.addObject("alien", alien3.get(0));
		mv.setViewName("displayAlien");
		return mv;
	}
}
