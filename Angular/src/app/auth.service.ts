import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Users } from './users';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }
  api = 'http://localhost:8080/onlinemedicalstorespringrest/';

  isLoggedIn() {
    const user = JSON.parse(localStorage.getItem('user'));
    if (user && user.registered) {
      return true;
    } else {
      return false;
    }
  }

  login(credentials): Observable<any> {
    // tslint:disable-next-line: max-line-length
    return this.http.get(`${this.api}userLogin?email=${credentials.email}&password=${credentials.password}&role=${credentials.role}`, credentials);
  }

  isRegistered() {
    const user = JSON.parse(localStorage.getItem('user'));
    if (user && user.registered) {
      return true;
    } else {
      return false;
    }
  }

  register(credentials): Observable<any> {
    return this.http.put(`${this.api}registerUser`, credentials);
  }

  getUser() {
    return this.http.get<any>(`http://localhost:8080/onlinemedicalstorespringrest/showAllUsers`);
  }

  delUser(user): Observable<any> {
    return this.http.delete<any>(`http://localhost:8080/onlinemedicalstorespringrest/removeUser?userId=${user.id}`, user);
  }
}
