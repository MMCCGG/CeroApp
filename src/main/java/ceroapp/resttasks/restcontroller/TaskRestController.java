package ceroapp.resttasks.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ceroapp.resttasks.modelo.services.TaskService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/tasks")
public class TaskRestController {
	@Autowired private TaskService tservice;

	// falta implementar rutas
}
