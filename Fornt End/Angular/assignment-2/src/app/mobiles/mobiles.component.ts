import { Component, OnInit } from '@angular/core';
import { Mobile } from '../mobile';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {

  mobiles: Mobile[]=[
    {
      brand : 'Nokia',
    imgURL : 'https://cdn.pixabay.com/photo/2017/04/26/16/06/mobile-2262928__340.jpg',
    price : 200000,
    specs : `Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Yureka',
    imgURL : 'https://cdn.pixabay.com/photo/2016/04/22/02/34/cell-1344985__340.jpg',
    price : 200000,
    specs : `Toyota, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'YU',
    imgURL : 'https://cdn.pixabay.com/photo/2017/08/10/03/30/iphone-2617704__340.jpg',
    price : 200000,
    specs : ` Buick India Limited, formerly known as `
    },
    {
      brand : 'Redmee',
    imgURL : 'https://cdn.pixabay.com/photo/2016/02/19/10/26/phone-1209230__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand :'Samsung',
    imgURL : 'https://cdn.pixabay.com/photo/2014/12/15/13/39/smartphone-569059__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'OnePlus',
    imgURL : 'https://cdn.pixabay.com/photo/2015/02/04/12/38/smartphone-623722__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Vivo',
    imgURL : 'https://cdn.pixabay.com/photo/2015/09/02/13/11/phone-918928__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Micromax',
    imgURL : 'https://cdn.pixabay.com/photo/2017/04/03/15/52/mobile-phone-2198770__340.png',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'Oppo',
    imgURL : 'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    },
    {
      brand : 'iphone',
    imgURL : 'https://cdn.pixabay.com/photo/2014/08/05/10/30/iphone-410324__340.jpg',
    price : 200000,
    specs : `Maruti Suzuki India Limited, formerly known as Maruti Udyog Limited, is an automobile manufacturer in India. It is a 56.21% owned subsidiary of the Japanese car and motorcycle manufacturer Suzuki Motor Corporation. As of July 2018, it had a market share of 53% of the Indian passenger car market.
    `
    }
  ];
  selectedMobile: Mobile = this.mobiles[0];
    
  constructor() { }
  selectMobile(mobile){
    this.selectedMobile=mobile;
  }

  ngOnInit() {
  }

}
