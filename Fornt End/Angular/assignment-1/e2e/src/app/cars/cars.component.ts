import { Component, OnInit } from '@angular/core';
import { Car } from '../car';

@Component({

  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {
  cars: Car[]=[
    {
      brand : 'Suzuki',
    imgURL : 'https://cdn.pixabay.com/photo/2019/06/29/09/51/suzuki-sx4-4305877__340.jpg',
    price : 200000,
    specs : `Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Toyota',
    imgURL : 'https://cdn.pixabay.com/photo/2018/07/15/16/24/auto-3539976__340.jpg',
    price : 200000,
    specs : `Toyota, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Buick',
    imgURL : 'https://cdn.pixabay.com/photo/2016/05/18/10/52/buick-1400243__340.jpg',
    price : 200000,
    specs : ` Buick India Limited, formerly known as `
    },
    {
      brand : 'Mercedes',
    imgURL : 'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Chevrolet',
    imgURL : 'https://cdn.pixabay.com/photo/2018/03/23/09/15/chevrolet-3253172__340.png',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Nissan',
    imgURL : 'https://cdn.pixabay.com/photo/2015/08/11/22/33/nissan-885308__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Dodge',
    imgURL : 'https://cdn.pixabay.com/photo/2016/07/28/18/01/corvette-1548682__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Volkswagen',
    imgURL : 'https://cdn.pixabay.com/photo/2016/09/21/07/07/car-1684227__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Volvo',
    imgURL : 'https://cdn.pixabay.com/photo/2017/06/12/16/24/volvo-2396040__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Maruti',
    imgURL : 'https://cdn.pixabay.com/photo/2019/05/15/23/19/car-4206166__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    }
    
  ];
  selectedCar: Car = this.cars[0];
  constructor() { }
  selectCar(car){
    this.selectedCar=car;
  }
  ngOnInit() {
  }

}
