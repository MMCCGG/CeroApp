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
		try {
			if (trepo.existsById(task.getId()))
				return null;
			else  
				return trepo.save(task);
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@Override
	public Task modificar(Task task) {
		try {
			if (trepo.existsById(task.getId()))
				return trepo.save(task);
			else  
				return null;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int eliminar(int id) {
		try {
			if (trepo.existsById(id)) {
				trepo.deleteById(id);
				return 1;
			}
			else  
				return 0;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public Task buscarUna(int id) {
		// TODO Auto-generated method stub
		return trepo.findById(id).orElse(null);
	}

	@Override
	public List<Task> buscarTodos() {
		// TODO Auto-generated method stub
		return trepo.findAll();
	}
/*
	@Override
	public List<Task> buscarPorFamilia(int codigoFamilia) {
		// TODO Auto-generated method stub
		return trepo.findByFamilia(codigoFamilia);
	}

	@Override
	public List<Task> buscarPorMarcaYColor(String marca, String color) {
		// TODO Auto-generated method stub
		return trepo.findByMarcaAndColor(marca, color);
	}

	@Override
	public double mediaPrecioProdPorFamilia(int codigoFamilia) {
		List<Task> lista = trepo.findByFamilia(codigoFamilia);
	/*	if (lista.size()==0)
			return 0;
		double suma =0;
		for(Task p: lista) {
			suma += p.getPrecioUnitario(); 
		}
		
	//	return suma / lista.size();
	*/	
/*		return lista.stream()
							.mapToDouble(p -> p.getPrecioUnitario())
							.average()
							.orElse(0.0);
		
		
		
		
		
		
	}

	@Override
	public List<Task> sbCadenaDeDescripcion(String subCadena) {
		// TODO Auto-generated method stub
		return trepo.findByDescripcionContaining(subCadena);
	}
*/

}
