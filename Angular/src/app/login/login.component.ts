import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error: string = null;

  constructor(private auth: AuthService) { }

  login(form: NgForm) {
    this.error = null;
    this.auth.login(form.value).subscribe(user => {
      console.log(user);
      if (user && user.registered) {
        localStorage.setItem('user', JSON.stringify(user));
      }
      form.reset(form);
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}
