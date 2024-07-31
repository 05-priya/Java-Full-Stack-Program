import { Component } from '@angular/core';
import { __values } from 'tslib';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Voting_System_Project';
  Name:string;
  Age:string;
  n:string;
  a:string;
  constructor(){
    this.Name="priya";
    this.Age="21";
    this.n="";
    this.a="";
  }
  details(){
this.n=this.Name;
this.a=this.Age;
  }
}
