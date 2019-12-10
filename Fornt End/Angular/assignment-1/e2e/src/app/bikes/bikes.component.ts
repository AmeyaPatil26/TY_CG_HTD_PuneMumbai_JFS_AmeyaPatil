import { Component, OnInit } from '@angular/core';
import { Bike } from '../bike';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  bikes: Bike[]=[
    {
      brand:'RoyalEnfield',
      imgURL:'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231__340.jpg',
      model:'version369',
      price:30000,
      specs:'nice bike'
    },{
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
      },

    {
      brand:'Honda',
      imgURL:'https://cdn.pixabay.com/photo/2018/02/16/21/04/motorcycle-3158616__340.jpg',
      model:'version786',
      price:30000,
      specs:''
    },
    {
      brand:'Pulsar',
      imgURL:'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      model:'version890',
      price:30000,
      specs:''
    },
    {
      brand:'ActivaPlus',
      imgURL:'https://cdn.pixabay.com/photo/2017/05/27/03/18/bike-2347541__340.jpg',
      model:'version 3762',
      price:30000,
      specs:''
    },
    {
      brand:'Scootypept',
      imgURL:'https://cdn.pixabay.com/photo/2018/09/30/20/58/piaggio-3714634__340.jpg',
      model:'version893',
      price:30000,
      specs:''
    },
    {
      brand:'Activa',
      imgURL:'https://cdn.pixabay.com/photo/2016/07/10/22/31/vespa-1508674__340.jpg',
      model:'version467',
      price:30000,
      specs:''
    },
    {
      brand:'Hero',
      imgURL:'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
      model:'model23',
      price:30000,
      specs:''
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
