import { Routes } from "@angular/router";
import { TaskList } from "./tasks/pages/task-list/task-list";

export const routes: Routes = [
  { path: "", pathMatch: "full", redirectTo: "tasks" },
  { path: "tasks", component: TaskList },
  { path: "**", redirectTo: "tasks" },
];
