# CeroApp - Frontend

Frontend de la aplicación **CeroApp**, desarrollada con Angular 20.

## Estructura

```
src/
├── app/
│   ├── core/               # Servicios globales, interceptores, guards
│   ├── shared/             # Componentes y pipes reutilizables
│   └── tasks/              # Módulo principal de la app: tareas
│       ├── components/     # Componentes como task-item
│       ├── pages/          # Páginas como task-list y task-form
│       ├── models/         # Interfaces y modelos de datos
│       └── services/       # Servicios específicos para tareas
````

## Tecnologías

- Angular 20
- TypeScript
- Bootstrap (opcional, según uso)
- Arquitectura modular + lazy loading

## Objetivo

Consumir la API REST desarrollada en Spring Boot (ver carpeta `/backend` en rama `main`) y gestionar tareas: listar, crear, editar y eliminar.

## Inicio rápido

```bash
npm install
ng serve
````

## Notas

Este frontend está diseñado para apuntar por defecto a `http://localhost:8080`. Cambia el endpoint si el backend está en otra dirección.
