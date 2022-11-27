import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void { }

  logOut() {
    sessionStorage.removeItem("userInfo");
    this.router.navigateByUrl('login');
  }

  // 進入會員中心
  inToUserCenter() {
    const userJson = sessionStorage.getItem('userInfo');
    if (userJson === null) {
      alert('請先登入');
      this.router.navigateByUrl('login');
    } else {
      this.router.navigateByUrl('userCenter');
    }
  }
}
