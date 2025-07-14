import { TaskService } from './../../services/task.service';
import { Component, signal, inject } from "@angular/core";
import { TaskModel } from "../../models/task.model";

@Component({
    selector: "app-task-list",
    standalone: true, // <-- Componente standalone (sin módulos)
    templateUrl: "./task-list.html",
    styleUrl: "./task-list.css",
})
export class TaskList {
    // Inyección moderna de dependencias
    private taskService = inject(TaskService);

    // Uso de señales reactivas
    tasks = signal<TaskModel[]>([]);
    loading = signal(true);
    error = signal(false);

    // Constructor simplificado
    constructor() {
        this.loadTasks();
    }

    private loadTasks() {
        // Sintaxis moderna de subscribe
        this.taskService.getAll().subscribe({
            next: (data) => {
                this.tasks.set(data);
                this.loading.set(false);
            },
            error: () => {
                this.error.set(true);
                this.loading.set(false);
            }
        });
    }
}