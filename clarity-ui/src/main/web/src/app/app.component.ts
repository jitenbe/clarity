import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Clarity';
  msg:any;
  user:any
  constructor(private http:HttpClient){

  }
  ngOnInit(){
    this.msg=this.http.get('/api/hi',{responseType:'text'}).subscribe(res=>{console.log(res);this.title=res});
  
  }
}
