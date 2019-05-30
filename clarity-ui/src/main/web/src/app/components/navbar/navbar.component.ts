import { Component, OnInit, ViewChild, AfterViewInit } from '@angular/core';
import { LoginComponent } from '../login/login.component';
import { ComponentCommunicationService } from '../../services/component-communication.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit{
private consultant_id: string="";
  constructor(private commService:ComponentCommunicationService) { }

  ngOnInit() {
    this.commService.receivedFilter.subscribe((res:string)=>
    {
      this.consultant_id=res;
      
    });
  }
  

}
