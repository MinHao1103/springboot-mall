import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  clickState(str: any) {
    if (str === 'signUp') {
      $(".email-login").fadeOut(100);
      $(".email-signup").delay(100).fadeIn(100);
      $("#login-box-link").removeClass("active");
      $("#signup-box-link").addClass("active");
    } else {
      $(".email-login").delay(100).fadeIn(100);;
      $(".email-signup").fadeOut(100);
      $("#login-box-link").addClass("active");
      $("#signup-box-link").removeClass("active");
    }
  }

  ngOnInit(): void {

  }

}
