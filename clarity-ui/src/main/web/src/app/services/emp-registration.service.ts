import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from '../models/employee';
import { Observable } from 'rxjs';
import { ApiUrlResolverService } from './api.url.resolver.service';
import { HttpUrlConstants } from '../constants/http.url.constants';

@Injectable({
  providedIn: 'root'
})
export class EmpRegistrationService {

  // private baseUrl = 'http://localhost:8080/api/employee';

  constructor(private http:HttpClient,private apiUrlResolver:ApiUrlResolverService ) { }

  addEmployee(employee:Employee):Observable<Employee>
  {
   let vm=this;
  let url=vm.apiUrlResolver.getUrl(HttpUrlConstants.URL_RESOLVERS.CREATE_EMPLOYEE);
    return this.http.post(url,employee);
  }
}
