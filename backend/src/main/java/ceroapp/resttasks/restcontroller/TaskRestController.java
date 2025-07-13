package ceroapp.resttasks.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ceroapp.resttasks.modelo.entities.Task;
import ceroapp.resttasks.modelo.services.TaskService;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping("/tasks")
public class TaskRestController {
	@Autowired private TaskService tservice;

	@PostMapping
	public ResponseEntity<Task> alta(@RequestBody Task task) {

		return 	new ResponseEntity<Task>(tservice.alta(task), HttpStatus.CREATED);
		
	}
	
	@PutMapping
	public ResponseEntity<Task> modificar(@RequestBody Task task) {
	    Task modificado = tservice.modificar(task);
	    return new ResponseEntity<>(modificado, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id) {
		switch(tservice.eliminar(id)) {
		case 1:  return new ResponseEntity<String>("Task eliminada correctamente", HttpStatus.OK);
		case 0:  return new ResponseEntity<String>("Task no existe", HttpStatus.NOT_FOUND);
		case -1: return new ResponseEntity<String> 
			("Esto es un problema de la base de datos, llame a servicio Tecnico",HttpStatus.CONFLICT);
		default:  return null;
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> uno(@PathVariable int id) {
		 Task task = tservice.buscarUna(id);
		 if ( task != null)
			 return new ResponseEntity<Task>(task, HttpStatus.OK);
		 else
			 return new ResponseEntity<String>("Task no existe", HttpStatus.NOT_FOUND);
			 
	}
	
	@GetMapping
	public ResponseEntity<List<Task>>  todos() {
		return new ResponseEntity<List<Task>>(tservice.buscarTodos(), HttpStatus.OK);
	}
}