import { Component, OnInit } from '@angular/core';
import { Investment } from '../../models/investment_master';

@Component({
  selector: 'app-investment',
  templateUrl: './investment.component.html',
  styleUrls: ['./investment.component.css']
})
export class InvestmentComponent implements OnInit {
investment:Investment=new Investment();
  constructor() { }

  ngOnInit() {
  }
onSubmit(investment:Investment)
{

}
}
