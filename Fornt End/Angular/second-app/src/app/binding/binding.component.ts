import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  inputData;
  flag = false;
  name='tabu';
  imgURL = 'https://cdn.pixabay.com/photo/2019/10/27/17/13/landscape-4582290__340.jpg';

  constructor() {
    setInterval(() => {
      this.flag = !this.flag;
    }, 1000);
   }

   eventOccured(input){
     console.log(input.value);
     console.log('key up event occured');
   }
  ngOnInit() {
  }

}
