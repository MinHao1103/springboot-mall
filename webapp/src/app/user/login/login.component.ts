import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit(): void { }

  // 登入
  getUserLogin() {
    let dataJSON = {
      "email": $("#loginEmail").val(),
      "password": $("#loginPassword").val()
    }

    $.ajax({
      type: "Post",
      async: false,
      url: "http://localhost:8080/users/login",
      data: JSON.stringify(dataJSON),
      contentType: "application/json; charset=UTF-8",
      dataType: 'json',
      statusCode: { // 依不同StatusCode執行不同邏輯
        200: function (userInfo) {
          alert("登入成功");
          window.sessionStorage.setItem("userInfo", JSON.stringify(userInfo));
          window.location.assign("http://localhost:4200/home");
        },
        404: function () {
          alert("Page Not Found!");
        },
        500: function (xhr) {
          alert(xhr.responseText);
        }
      }
    });
  }

  // Login 與 Sign Up 的 Button
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
}
