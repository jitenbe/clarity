import { Component, OnInit, ViewChild } from '@angular/core';
import { Employee } from '../../models/employee';
import { EmpRegistrationService } from '../../services/emp-registration.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-emp-registration',
  templateUrl: './emp-registration.component.html',
  styleUrls: ['./emp-registration.component.css']
})
export class EmpRegistrationComponent implements OnInit {

  @ViewChild('empForm') form :any
 showMsg:boolean=false;
  emp:Employee=new Employee();
  constructor(private empRegisterService: EmpRegistrationService, private router: Router) { }

  ngOnInit() {
  }
  onSubmit(emp:Employee)
  {
    this.empRegisterService.addEmployee(this.emp)
    // .subscribe((res)=>{ this.router.navigate(['/login'])},err=> console.log(err));
    .subscribe((res=>this.showMsg=true),err=> console.log(err));
  }

}
