package Practica.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Practica.domain.Persona;
import Practica.repository.PersonaDao;

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})

@Controller
//@RequestMapping("/friends")
public class InicioController {
	
	@Autowired
	private PersonaDao personaDao;

	@GetMapping("")
	public String inicio(Model model) {	
		List<Persona> personas = new ArrayList<Persona>();
		
		System.out.println(this.personaDao.findAll());
		
		return "index";
	}

//	@GetMapping("/{id}")
//	public ResponseEntity<Friend> get(@PathVariable("id") int id) {
//		Optional<Friend> friend = friendsService.getFriend(id);
//		if (!friend.isPresent()) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		} else {
//			return new ResponseEntity<>(friend.get(), HttpStatus.OK);
//		}
//	}
//
//	@PostMapping("")
//	public ResponseEntity<Friend> save(@RequestBody Friend f) {
//		boolean ok = friendsService.save(f);
//		if (!ok) {
//			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
//
//		} else {
//			return new ResponseEntity<>(f, HttpStatus.OK);
//		}
//	}
//	
//	@PutMapping("")
//	public ResponseEntity<Friend> update(@RequestBody Friend f) {
//		boolean ok = friendsService.save(f);
//		if (!ok) {
//			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
//
//		} else {
//			return new ResponseEntity<>(f, HttpStatus.OK);
//		}
//	}
//
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Friend> delete(@PathVariable("id") int id) {
//		Optional<Friend> friend= friendsService.getFriend(id);
//		if (friend.isPresent()) {
//			friendsService.delete(friend.get());
//			return new ResponseEntity<Friend>(friend.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<Friend>(HttpStatus.NOT_FOUND);
//		}
//	}
//	

}

