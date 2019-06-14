import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { SowMaster } from '../models/sow-master';
import { HttpClient} from '@angular/common/http';
import { ApiUrlResolverService } from './api.url.resolver.service';
import { HttpUrlConstants } from '../constants/http.url.constants';

@Injectable({
  providedIn: 'root'
})
export class SowMasterService {

  constructor(private http:HttpClient,private apiService:ApiUrlResolverService) { }

  addSow(sow:SowMaster):Observable<SowMaster>
  {
    let url=this.apiService.getUrl(HttpUrlConstants.URL_RESOLVERS.CREATE_SOW);
   return this.http.post(url,sow);
  }
  getSowListByProject(projectid):Observable<any>
  {
    console.log('Project_id-->'+projectid);
    let url=this.apiService.getUrl(HttpUrlConstants.URL_RESOLVERS.SOW_LIST_BY_PROJECT);
   
    return this.http.get<SowMaster[]>(url+projectid);
  }
  
}
