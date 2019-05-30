import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from '../models/employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmpRegistrationService {

  private baseUrl = 'http://localhost:8080/api/employee';

  constructor(private http:HttpClient) { }

  addEmployee(employee:Employee):Observable<Employee>
  {
   
    
    return this.http.post(`${this.baseUrl}` + `/create`,employee);
  }
}
