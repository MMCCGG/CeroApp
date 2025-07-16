import { Component, inject } from "@angular/core";
import { FormBuilder, ReactiveFormsModule, Validators } from "@angular/forms";
import { Router } from "@angular/router";
import { TaskService } from "../../services/task.service";
import { TaskModel } from "../../models/task.model";

@Component({
  selector: "app-task-form",
  imports: [ReactiveFormsModule],
  templateUrl: "./task-form.html",
  styleUrl: "./task-form.css",
})
export class TaskForm {
  private fb = inject(FormBuilder);
  private taskService = inject(TaskService);
  private router = inject(Router);

  taskForm = this.fb.group({
    title: ["", [Validators.required, Validators.minLength(3)]],
    completed: [false],
  });

  guardar() {
    if (this.taskForm.invalid) return;

    const task: TaskModel = this.taskForm.value as TaskModel;

    this.taskService.insert(task).subscribe({
      next: () => this.router.navigate(["/"]),
      error: (err) => console.error("Error al guardar", err),
    });
  }
}
