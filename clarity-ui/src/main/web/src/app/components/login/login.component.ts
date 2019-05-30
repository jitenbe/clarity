import { Component, OnInit, Output, EventEmitter, ViewChild } from '@angular/core';
import { Employee } from '../../models/employee';
import { LoginService } from '../../services/login.service';
import { Router } from '@angular/router';
import { NavbarComponent } from '../navbar/navbar.component';
import { ComponentCommunicationService } from '../../services/component-communication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  emp: Employee = new Employee();
  
  // @Output() shareUser: EventEmitter<any> = new EventEmitter();
  showMsg:boolean=false;
  constructor(private loginService: LoginService, private router: Router,private comService:ComponentCommunicationService) { }

  ngOnInit() {
    
  }

  
  login() {
    this.loginService.auntheticate(this.emp)
    .subscribe(
      res =>{this.comService.sendLanId(this.emp.consultant_id),this.router.navigate(['/home'])},
      error =>{this.showMsg=true});
  }
}
