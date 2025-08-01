package ceroapp.resttasks.modelo.services;

import java.util.List;

import ceroapp.resttasks.modelo.entities.Task;

public interface TaskService {
	Task alta(Task task);
	Task modificar(Task task);
	int eliminar(int codigo);
	Task buscarUna(int codigo);
	List<Task> buscarTodos();
}
