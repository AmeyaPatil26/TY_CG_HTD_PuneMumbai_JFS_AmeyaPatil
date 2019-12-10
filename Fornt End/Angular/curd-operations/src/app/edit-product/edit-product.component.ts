import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  selectedProduct: Product = {
    name: null,
    category: null,
    price: null,
    info: null,
    imgUrl: null,
    pk: null
  };
  constructor(private productService: ProductService) {
    this.productService.getData();
    console.log(productService.product);
   }
   deleteProduct(product: Product) {
     this.productService.deleteData(product).subscribe( Response => {
       console.log(Response);
       console.log('Deleted one Response');
       this.productService.getData();
     }, err => {
       console.log(err);
     });
    }
    selectProduct(product: Product) {

      this.selectedProduct = product;
    }
    submitForm(form: NgForm) {
      console.log(form.value);
      this.productService.putData(form.value).subscribe(response => {
        console.log(response);
      }, err => {
        console.log(err);
      });
    }
  ngOnInit() {
  }

}
