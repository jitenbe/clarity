import { Injectable } from '@angular/core';

import { ApiUrlResolverService } from './api.url.resolver.service';
import { HttpUrlConstants } from '../constants/http.url.constants';
import { Observable } from 'rxjs';
import { ProjectMaster } from '../models/project-master';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProjectMasterService {

  constructor(private http:HttpClient,private apiServices:ApiUrlResolverService) { }

  addProject(project:ProjectMaster):Observable<ProjectMaster>
  {
    let vm=this;
    let url=this.apiServices.getUrl(HttpUrlConstants.URL_RESOLVERS.CREATE_PROJECT);
    return vm.http.post(url,project);
  }
  getProjectList():Observable<any>
  {
    let vm=this;
    let url=this.apiServices.getUrl(HttpUrlConstants.URL_RESOLVERS.PROJECT_LIST);
    return vm.http.get<ProjectMaster[]>(url);
  }
}
