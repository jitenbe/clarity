import { Component, OnInit, ViewChild } from '@angular/core';
import { InvestmentMaster } from '../../models/investment_master';
import { HttpClient } from '@angular/common/http';
import { InvestmentService } from '../../services/investment.service';
import { NgForm } from '@angular/forms';
import { ProjectMaster } from '../../models/project-master';
import { ProjectMasterService } from '../../services/project-master.service';
import { SowMaster } from '../../models/sow-master';
import { SowMasterService } from '../../services/sow-master.service';

@Component({
  selector: 'app-investment',
  templateUrl: './investment.component.html',
  styleUrls: ['./investment.component.css']
})
export class InvestmentComponent implements OnInit {
  investment: InvestmentMaster = new InvestmentMaster();
  showMsg: boolean = false;
  isEditMode: boolean = false;
  investmentTypeList: any[] = [];
  investmentList: InvestmentMaster[] = [];
  projectList: ProjectMaster[] = [];
  edited:boolean=true;
  sowList:SowMaster[]=[];
  @ViewChild('form') fromValues: NgForm;
  constructor(private investmentService: InvestmentService, private projectService: ProjectMasterService,
  private sowService:SowMasterService) {
    this.investment.investmentType = '';
    this.investment.projectMasterId = 0;
    this.getInvestmentTypeList();
    // this.getInvestmentList();
    this.getProjectList();
  
  }
  public show: boolean = true;
  public investmentbtn: any = 'Add Investment';
  private savebtn: string = "Save";
  ngOnInit() {


  }

  editInvestment(investment: InvestmentMaster) {
    this.investment = { ...investment };
    this.isEditMode = true;
    this.show = true;
    this.savebtn = this.isEditMode ? "Update" : "Save";
  }

  onSubmit(investment: InvestmentMaster) {
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

  getProjectList() {
    this.projectService.getProjectList().subscribe(res => {
      this.projectList = res;
    });
  }
  public onChange(event): void {
  const project_id=event.target.value;
    if(project_id !=0)
    {
      this.edited=false;
      this.sowService.getSowListByProject(project_id).subscribe(res=>
      {
        this.sowList=res;
      });
    }
    else
    {
      this.edited=true;
    }
  }

}
