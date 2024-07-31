import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-my',
  templateUrl: './my.component.html',
  styleUrl: './my.component.css'
})
export class MyComponent {

    sum: number;
    sub:number;
    mul:number;
    div:number;
    constructor(private calc : CalculatorService){
      this.sum =calc.getAddition(10,30);
      this.sub =calc.getSubtraction(10,20);
      this.mul=calc.getMultiplication(10,20);
      this.div=calc.getDivision(20,10);

  }



}
