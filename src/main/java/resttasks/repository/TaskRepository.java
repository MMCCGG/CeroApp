package resttasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import resttasks.modelo.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
