import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-show-user',
  templateUrl: './show-user.component.html',
  styleUrls: ['./show-user.component.css']
})
export class ShowUserComponent implements OnInit {

  users = [];
  constructor(private auth: AuthService) {
    this.auth.getUser().subscribe(data => {
      console.log(data.userList);
      this.users = data.userList;
    }, err => {
      console.log(err);
    });
   }

   deleteUser(user) {
    this.auth.delUser(user).subscribe(data => {
      console.log(data);
      this.users.splice(this.users.indexOf(this.deleteUser), 1);
    }, err => {
      console.log(err);
    });
   }
  ngOnInit() {
  }

}
