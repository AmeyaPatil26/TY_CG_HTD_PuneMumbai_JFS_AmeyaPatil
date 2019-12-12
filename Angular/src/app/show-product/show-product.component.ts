import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-show-product',
  templateUrl: './show-product.component.html',
  styleUrls: ['./show-product.component.css']
})
export class ShowProductComponent implements OnInit {
  products = [];
  constructor(private productService: ProductService) {

    this.productService.getProduct().subscribe(data => {
      console.log(data.productList);
      this.products = data.productList;
    }, err => {
      console.log(err);
    });
   }

  ngOnInit() {
  }

}
