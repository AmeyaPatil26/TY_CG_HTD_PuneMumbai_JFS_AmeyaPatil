import { Injectable } from '@angular/core';
import { Product } from './product';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  api = 'https://curdoperation-73d05.firebaseio.com/';
  product: Product[] = [];
  constructor(private http: HttpClient) { }
  postData(data) {
    return this.http.post(`${this.api}product.json`, data );
  }
  getData() {
    return this.http.get(`${this.api}product.json`).subscribe(data => {
      console.log(data);
      const productArray  = [];
      for (const key in data) {
        if (data.hasOwnProperty(key)) {
          productArray.push({...data[key], pk: key});
        }
      }
    });
  }
  putData(data) {
    return this.http.put(`${this.api}product/${data.pk}.json`, data);
  }
  deleteData(data) {
    return this.http.delete(`${this.api}product/${data.pk}.json`);
  }
}
