import { Component, OnInit, ViewChild } from '@angular/core';
import { Investment } from '../../models/investment_master';
import { HttpClient } from '@angular/common/http';
import { InvestmentService } from '../../services/investment.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-investment',
  templateUrl: './investment.component.html',
  styleUrls: ['./investment.component.css']
})
export class InvestmentComponent implements OnInit {
  investment: Investment = new Investment();
  showMsg: boolean = false;
  isEditMode: boolean = false;
  investmentTypeList: any[] = [];
  investmentList: Investment[] = [];

  @ViewChild('form') fromValues:NgForm;
  constructor(private investmentService: InvestmentService) {
    this.investment.investment_type = '';
    this.investment.is_deliverbales_in_current_week = '';
    this.getInvestmentTypeList();
    this.getInvestmentList();
  }
  public show: boolean = false;
  public investmentbtn: any = 'Add Investment';
  private savebtn: string = "Save";
  ngOnInit() {
  }

  editInvestment(investment: Investment) {
    this.investment = { ...investment };
    this.isEditMode = true;
    this.show = true;
    this.savebtn = this.isEditMode ? "Update" : "Save";
  }

  onSubmit(investment: Investment) {
    console.log(this.investment);
    this.investmentService.addInvestment(this.investment).subscribe((res => this.showMsg = true), err => console.log(err));
  }
  getInvestmentTypeList() {
    this.investmentService.getInvestmentTypes().subscribe(res => {
      this.investmentTypeList = res;
    }
    );
  }

  toggle() {
    this.show = !this.show;
    if (this.show) {
      this.investmentbtn = "Cancel";
    } else {
      this.investmentbtn = (this.isEditMode ? "Update" : "Add") + " Investment";
    }
    this.savebtn = this.isEditMode ? "Update" : "Save";
  }

  getInvestmentList() {
    this.investmentService.getInvestmentList()
      .subscribe(res => {
        this.investmentList = res;
      });
  }
  reset() {

  
  }

}
