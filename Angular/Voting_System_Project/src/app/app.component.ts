import { Component } from '@angular/core';
import { __values } from 'tslib';
import { Voter } from './model/Voter';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Voting_System_Project';
  voterList:Voter;

constructor(){
  this.voterList = new Voter();
}

  insertVoter(data:any){
    this.voterList.fname=data.fname;
    this.voterList.age=data.age;
    this.voterList.gender=data.gender;
    this.voterList.aadharno=data.aadharno;
    alert(data.fname+" "+data.age+" "+data.gender+" "+data.aadharno);
}
}
