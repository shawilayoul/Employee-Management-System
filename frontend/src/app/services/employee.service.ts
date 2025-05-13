import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../models/employee.type=model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private apiUrl = 'http://localhost:8081/api/employee';

  constructor(private http: HttpClient) { }

  getEmployee(): Observable<Employee[]>{
    return this.http.get<Employee[]>(this.apiUrl);
  }

  addEmployee(employee: Employee): Observable<Employee>{
    return this.http.post<Employee>(this.apiUrl, employee);
  }

  updateEmployee(employee: Employee): Observable<Employee>{
    return this.http.put<Employee>(`${this.apiUrl}/${employee}`,employee)
  }

  deleteEmployee(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/delete/${id}`)
  }


}
