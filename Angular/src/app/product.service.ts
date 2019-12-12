import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  constructor(private http: HttpClient) { }
  api = 'http://localhost:8080/onlinemedicalstorespringrest/';

  isProductAdded() {
    const user = JSON.parse(localStorage.getItem('user'));
    if (user && user.isProductAdded) {
      return true;
    } else {
      return false;
    }
  }

  product(credentials): Observable<any> {
    return this.http.put(`${this.api}addProductByadmin`, credentials);
  }

  getProduct() {
    return this.http.get<any>(`http://localhost:8080/onlinemedicalstorespringrest/showAllProducts`);
  }
}
