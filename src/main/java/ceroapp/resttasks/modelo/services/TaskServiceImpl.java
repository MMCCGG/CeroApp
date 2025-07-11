package ceroapp.resttasks.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ceroapp.resttasks.modelo.entities.Task;
import ceroapp.resttasks.repository.TaskRepository;
@Service
public class TaskServiceImpl implements TaskService {
	@Autowired private TaskRepository trepo;

	@Override
	public Task alta(Task task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task modificar(Task task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eliminar(int codigo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Task buscarUna(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
