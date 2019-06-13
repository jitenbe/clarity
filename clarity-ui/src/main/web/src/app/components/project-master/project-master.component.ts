import { Component, OnInit } from '@angular/core';
import { ProjectMaster } from '../../models/project-master';
import { ProjectMasterService } from '../../services/project-master.service';

@Component({
  selector: 'app-project-master',
  templateUrl: './project-master.component.html',
  styleUrls: ['./project-master.component.css']
})
export class ProjectMasterComponent implements OnInit {

  project:ProjectMaster=new ProjectMaster();
  projectList:ProjectMaster[]=[];
  projectbtn:any='Add';
  showMsg:boolean=false;
  constructor(private projectService:ProjectMasterService) {
    this.getProjectList();
   }

  ngOnInit() {
  }


  getProjectList(){

  }
  onSubmit(project:ProjectMaster)
  {
    console.log('project Name'+this.project.projectName)
    let vm=this;
    vm.projectService.addProject(this.project).subscribe((res=>this.showMsg=true)
         
);
  }
}
