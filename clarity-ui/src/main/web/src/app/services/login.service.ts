import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../models/employee';


@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private baseUrl = 'http://localhost:8080/api/employee';
  constructor(private http:HttpClient) { }

  auntheticate(employee:Employee):Observable<Employee>
  {
    return this.http.post(`${this.baseUrl}` + `/login`,employee);
  }


}
