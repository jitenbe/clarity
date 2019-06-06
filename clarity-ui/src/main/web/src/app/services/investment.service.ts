import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Investment } from '../models/investment_master';
import { HttpClient } from '@angular/common/http';
import { ApiUrlResolverService } from './api.url.resolver.service';
import { HttpUrlConstants } from '../constants/http.url.constants';
import { Employee } from '../models/employee';


@Injectable({
  providedIn: 'root'
})
export class InvestmentService {

  constructor(private http:HttpClient,private urlResolver:ApiUrlResolverService) { }

  addInvestment(investment:Investment):Observable<Investment>
  {
    let url=this.urlResolver.getUrl(HttpUrlConstants.URL_RESOLVERS.CREATE_INVESTMENT);

    return this.http.post(url,investment);
  }
  getInvestmentTypes():Observable<any>
  {
    let url=this.urlResolver.getUrl(HttpUrlConstants.URL_RESOLVERS.INVESTMENT_TYPE_LIST);
    return this.http.get(url);
  }
}
