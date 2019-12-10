import { Component, OnInit } from '@angular/core';
import { Bike } from '../bike';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  
bikes: Bike[]= [
  {
brand: 'RoyalEnfield',
imgURL:'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231__340.jpg',
model:'version123',
price: 20000,
specs:'Nice bike',
},
{
  brand: 'Cycle',
  imgURL:'https://cdn.pixabay.com/photo/2016/01/19/14/55/mountain-bike-1149074_960_720.jpg',
  model:'pept23',
  price: 20000,
  specs:'good performance'
  },
  {
    brand: 'Tvs',
    imgURL:'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
    model:'version355',
    price: 20000,
    specs:'Nice '
    },
    {
      brand: 'Jawa',
      imgURL:'https://cdn.pixabay.com/photo/2017/11/23/04/08/royal-enfield-2972007__340.jpg',
      model:'version34',
      price: 20000,
      specs:'bike',
      }

];
selectedBike: Bike = this.bikes[0];
  constructor() { }
selectBike(bike){
  this.selectedBike=bike;
}
  ngOnInit() {
  }

}
