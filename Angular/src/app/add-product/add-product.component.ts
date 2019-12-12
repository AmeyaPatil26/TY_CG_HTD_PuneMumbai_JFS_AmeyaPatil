import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  error: string = null;
  constructor(private auth: ProductService) { }

  addProduct(addProductForm: NgForm) {
    console.log(addProductForm.value);
    this.auth.product(addProductForm.value).subscribe(response => {
      console.log(response);
    }, err => {
      console.log(err);
    });
  }


  ngOnInit() {
  }

}
