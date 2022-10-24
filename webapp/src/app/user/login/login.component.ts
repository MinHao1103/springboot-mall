import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './data/user-data';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  hello: string | undefined;

  constructor(private http: HttpClient) { }

  ngOnInit(): void { }

  /** 從後端取得資料 */
  getUserLogin() {

    let dataJSON = {
      // action: "selectAddress",
    }

    $.ajax({
      type: "GET",
      async: false,
      url: "http://localhost:8080/products",
      data: dataJSON,
      contentType: "application/json; charset=UTF-8",
      dataType: 'json',
      statusCode: { // 依不同StatusCode執行不同邏輯
        200: function (data) {
          console.table(data);
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
