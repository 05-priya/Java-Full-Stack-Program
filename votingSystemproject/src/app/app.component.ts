import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'votingSystemproject';
  name : string;
  age : number;
  email : string;
  txtcolor : string;
  imgpath : string;
  fname : string=" ";

  constructor(){
    this.name="Priya";
    this.age=21;
    this.email="priya22@gmail.com";
    this.txtcolor="green";
    this.imgpath="./assets/logo.png";
    
  }
  getAddition(a : number, b : number){
    let sum=a+b;
    return sum;
  }
  changeName(){
    this.name="Dheetchanaa";
  }
  changeEmail(){
    this.email="dhee21@gmail.com"
  }
}
