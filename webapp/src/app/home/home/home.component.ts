import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {

    const userJson = sessionStorage.getItem('userInfo');
    let jsonUser = JSON.parse(userJson || '{}');
    console.log(jsonUser)
    console.log(jsonUser.userId)
    console.log(jsonUser.email)

  }
}
