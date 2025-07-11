package ceroapp.resttasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ceroapp.resttasks.modelo.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
