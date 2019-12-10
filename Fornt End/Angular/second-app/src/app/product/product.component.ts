import { Component, OnInit } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  product: Product[]=[
    {
      name:'MacBook Air',
      imageURL: "https://cdn.pixabay.com/photo/2015/01/14/18/41/home-office-599475__340.jpg",
      price: 540000,
      details: 'very good Laptop'

    },
    {
      name:'Smart Phone',
      imageURL: "https://cdn.pixabay.com/photo/2015/12/13/16/02/ios-1091302__340.jpg",
      price: 50000,
      details: 'very good Phone'

    },
    {
      name:'Cat',
      imageURL: "https://cdn.pixabay.com/photo/2017/04/30/18/33/cat-2273598__340.jpg",
      price: 20000,
      details: 'very good Cat'

    },
    {
      name:'Smart Watch',
      imageURL: "https://cdn.pixabay.com/photo/2015/08/15/15/21/smart-watch-889639_960_720.jpg",
      price: 60000,
      details: 'very good Watch'

    },
    {
      name:'HeadSet',
      imageURL: "https://cdn.pixabay.com/photo/2015/03/26/09/58/headphones-690685_960_720.jpg",
      price: 540000,
      details: 'very good headphone'

    }
  ]

  constructor() { }

  ngOnInit() {
  }

}
