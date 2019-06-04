import { Injectable } from "@angular/core";
import { ApplicationConstants } from '../constants/application.constants';

@Injectable()
export class ApiUrlResolverService
{
    getUrl(url:string)
    {
        return ApplicationConstants.API_CONTEXT_ROUTE+url;
    }
}