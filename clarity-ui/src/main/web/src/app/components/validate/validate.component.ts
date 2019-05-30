import { Component, OnInit } from '@angular/core';
import { Employee } from '../../models/employee';

@Component({
  selector: 'app-validate',
  templateUrl: './validate.component.html',
  styleUrls: ['./validate.component.css']
})
export class ValidateComponent implements OnInit {
  model: any = {};
  emp:Employee=new Employee();
  constructor() { }

  ngOnInit() {
  }
  onSubmit() {
    alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.emp))
  }

}
