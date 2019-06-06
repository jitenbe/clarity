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
investmentTypeList:any[]=[];
  constructor(private investmentService:InvestmentService) {
    this.investment.investment_type='';
    this.investment.is_deliverbales_in_current_week='';
    this.getInvestmentTypeList();
   
   }
  public show:boolean = false;
  public investmentbtn:any = 'Add Investment';
  ngOnInit() {
  }
  
onSubmit(investment:Investment)
{
  console.log(this.investment);
  this.investmentService.addInvestment(this.investment).subscribe((res=>this.showMsg=true),err=>console.log(err));
}
getInvestmentTypeList()
{
  this.investmentService.getInvestmentTypes().subscribe(res=>
    {
      this.investmentTypeList=res;
    }
  );
}
toggle() {
  this.show = !this.show;
  if(this.show)  
    this.investmentbtn = "Cancel";
else
   this.investmentbtn = "Add Investment";
}
}
