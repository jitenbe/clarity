import { Component, OnInit } from '@angular/core';
import { Investment } from '../../models/investment_master';
import { HttpClient } from '@angular/common/http';
import { InvestmentService } from '../../services/investment.service';

@Component({
  selector: 'app-investment',
  templateUrl: './investment.component.html',
  styleUrls: ['./investment.component.css']
})
export class InvestmentComponent implements OnInit {
investment:Investment=new Investment();
showMsg:boolean=false;
  constructor(private investmentService:InvestmentService) { }

  ngOnInit() {
  }
onSubmit(investment:Investment)
{
  console.log(this.investment);
 this.investmentService.addInvestment(this.investment).subscribe((res=>this.showMsg=true),err=>console.log(err));
}
}
