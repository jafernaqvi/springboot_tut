package com.webapp.demo;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.webapp.demo.dao.AlienRepo;

@Controller
public class AlienRestController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("Alien")
	@ResponseBody
	public String fetchAllAlien() {
		return repo.findAll().toString();
	}
	
	@RequestMapping("Alien/{id}")
	@ResponseBody
	public String fetchAlienById(@PathVariable("id") int id) {
		return repo.findById(id).toString();
	}
}
