# Backend - Ceroapp

API REST básica para gestión de tareas usando Spring Boot + JPA + PostgreSQL.

## Estructura

- `ceroapp.CeroappApplication`: clase principal para lanzar la aplicación.
- Paquete `resttasks` con:
  - `modelo.entities.Task`: entidad JPA que representa una tarea.
  - `repository.TaskRepository`: interfaz JPA para acceso a datos.
  - `services.TaskService` + `TaskServiceImpl`: lógica de negocio.
  - `restcontroller.TaskRestController`: controlador REST con endpoints CRUD.

## Configuración

- Base de datos PostgreSQL `tareasdb`.
- Hibernate con `spring.jpa.hibernate.ddl-auto=update` para crear tabla `task` automáticamente.
- Puerto 8080, CORS habilitado para cualquier origen.

## Funcionalidad

- CRUD completo: crear, leer (uno y lista), actualizar y eliminar tareas.
- Respuestas HTTP adecuadas según éxito o error.
- JSON para entrada y salida.

## Estado actual

- Backend funcional y probado con Postman.
- No implementado frontend aún.
- Organización del código modularizada por capas (entidad, repositorio, servicio, controlador).

---

Para arrancar:

```bash
./mvnw spring-boot:run
