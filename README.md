# CeroApp - FullStack Task Manager

![Java](https://img.shields.io/badge/Java-17+-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1-green)
![Angular](https://img.shields.io/badge/Angular-20-red)
![TypeScript](https://img.shields.io/badge/TypeScript-5.0-blue)

CeroApp es una aplicación fullstack para gestión de tareas que combina:

-   **Backend**: Spring Boot con arquitectura RESTful
-   **Frontend**: Angular con Signals y Componentes Standalone

## Características principales

✅ CRUD completo de tareas  
✅ Diseño responsive  
✅ Manejo de errores en frontend y backend  
✅ Configuración CORS segura  
✅ Comunicación API REST con Angular HttpClient  
✅ Arquitectura modular escalable

## Estructura del proyecto

```text
ceroapp/
├── backend/               # API Spring Boot
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── ceroapp/
│   │       │       ├── config/       # Configuraciones CORS
│   │       │       └── resttasks/    # Módulo de tareas
│   │       │           ├── dto/      # Data Transfer Objects
│   │       │           ├── modelo/   # Entidades y servicios
│   │       │           ├── repository/ # Repositorios Spring Data
│   │       │           └── restcontroller/ # Controladores REST
│   │       └── resources/
│   │           └── application.properties
│   ├── pom.xml
│   └── mvnw
├── frontend/              # Aplicación Angular
│   └── CeroApp-Angular/
│       ├── src/
│       │   └── app/
│       │       ├── tasks/            # Feature module
│       │       │   ├── components/   # Componentes reutilizables
│       │       │   ├── models/       # Interfaces TypeScript
│       │       │   ├── pages/        # Vistas de páginas
│       │       │   └── services/     # Servicios Angular
│       │       ├── app.config.ts     # Configuración global
│       │       ├── app.routes.ts     # Enrutamiento
│       │       └── app.ts            # Componente principal
│       ├── angular.json
│       └── package.json
└── README.md              # Este archivo
```

## Tecnologías clave

| Área        | Tecnologías                                              |
| ---------------- | -------------------------------------------------------------- |
| **Backend**      | Java 17, Spring Boot 3.1, Spring Data JPA, Lombok, PostgreSQL  |
| **Frontend**     | Angular 20, TypeScript 5, Signals, Standalone Components, CSS3 |
| **Herramientas** | Maven, Angular CLI, Git, Vite              |

## Configuración y ejecución

### Backend (Spring Boot)

```bash
cd backend

# Instalar dependencias
./mvnw clean install

# Ejecutar aplicación (puerto 8080)
./mvnw spring-boot:run
```

### Frontend (Angular)

```bash
cd frontend/CeroApp-Angular

# Instalar dependencias
npm install

# Ejecutar servidor de desarrollo (puerto 4200)
ng serve
```

## Configuración importante

### application.properties (Backend)

```properties
spring.application.name=ceroapp

spring.datasource.url=jdbc:postgresql://localhost:5432/tu_ddbb
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### app.config.ts (Frontend)

```typescript
export const appConfig: ApplicationConfig = {
  providers: [
    provideBrowserGlobalErrorListeners(),
    provideZoneChangeDetection({ eventCoalescing: true }),
    provideRouter(routes),
    provideHttpClient(withFetch()),
  ],
};
```

## Endpoints API

| Método | Endpoint    | Descripción                |
| ------ | ----------- | -------------------------- |
| GET    | /tasks      | Obtener todas las tareas   |
| GET    | /tasks/{id} | Obtener una tarea por ID   |
| POST   | /tasks      | Crear nueva tarea          |
| PUT    | /tasks      | Actualizar tarea existente |
| DELETE | /tasks/{id} | Eliminar tarea             |

## Implementando mejoras

-   [ ] Autenticación JWT
-   [ ] Filtrado y búsqueda de tareas
-   [ ] Despliegue en Docker
-   [ ] Pruebas unitarias e2e
-   [ ] Internacionalización (i18n)

## Contribuir

1. Haz fork del proyecto
2. Crea tu feature branch (`git checkout -b feature/nueva-funcionalidad`)
3. Haz commit de tus cambios (`git commit -m 'Add nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## Licencia

Distribuido bajo licencia MIT. Ver `LICENSE` para más información.