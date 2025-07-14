import { HttpClient } from "@angular/common/http";
import { inject, Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { TaskModel } from "../models/task.model";

@Injectable({
  providedIn: "root"
})
export class TaskService {
  private http = inject(HttpClient);
  private baseUrl = "http://localhost:8080/tasks";

  getAll(): Observable<TaskModel[]> {
    return this.http.get<TaskModel[]>(this.baseUrl);
  }

  getById(id: number): Observable<TaskModel> {
    return this.http.get<TaskModel>(`${this.baseUrl}/${id}`);
  }

  insert(task: TaskModel): Observable<TaskModel> {
    return this.http.post<TaskModel>(this.baseUrl, task);
  }

  update(task: TaskModel): Observable<TaskModel> {
    return this.http.put<TaskModel>(this.baseUrl, task);
  }

  delete(id: number): Observable<string> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }
}
