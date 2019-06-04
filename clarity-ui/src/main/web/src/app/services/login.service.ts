import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../models/employee';
import { ApiUrlResolverService } from './api.url.resolver.service';
import { HttpUrlConstants } from '../constants/http.url.constants';


@Injectable({
  providedIn: 'root'
})
export class LoginService {
  
  constructor(private http:HttpClient,private apiResolverService:ApiUrlResolverService) { }

  auntheticate(employee:Employee):Observable<Employee>
  {
  let vm=this; 
  let url=vm.apiResolverService.getUrl(HttpUrlConstants.URL_RESOLVERS.LOGIN);
    return this.http.post(url,employee);
  }


}
