import { Injectable, EventEmitter } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class ComponentCommunicationService {

  lanId:string;
  receivedFilter:EventEmitter<string>;

  constructor() { 
    this.receivedFilter=new EventEmitter<string>();
  }
  sendLanId(lanId : string)
  {
    this.lanId=lanId;
    this.receivedFilter.emit(lanId);
  }
  
}
