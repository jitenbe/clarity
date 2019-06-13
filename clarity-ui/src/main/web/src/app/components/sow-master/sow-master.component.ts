import { Component, OnInit } from '@angular/core';
import { SowMaster } from '../../models/sow-master';
import { ProjectMaster } from '../../models/project-master';
import { ProjectMasterService } from '../../services/project-master.service';
import { SowMasterService } from '../../services/sow-master.service';

@Component({
  selector: 'app-sow-master',
  templateUrl: './sow-master.component.html',
  styleUrls: ['./sow-master.component.css']
})
export class SowMasterComponent implements OnInit {
sow:SowMaster=new SowMaster();
projectList:ProjectMaster[]=[];
showMsg:boolean=false;
  constructor(private projectService:ProjectMasterService,private sowService:SowMasterService) {
    this.sow.projectMasterId=0;
    this.getProjectList();
  }

  ngOnInit() {
  }
onSubmit(sow:SowMaster)
{
  console.log('sow->'+this.sow.projectMasterId+'sow_no'+this.sow.sowNo+'ddd'+this.sow);
  let vm=this;
  vm.sowService.addSow(sow).subscribe(res=>this.showMsg=true);
}
  getProjectList()
  {
    let vm=this;
    vm.projectService.getProjectList().subscribe(
      res=>
      {
        this.projectList=res;
      }
    );
  }

}
