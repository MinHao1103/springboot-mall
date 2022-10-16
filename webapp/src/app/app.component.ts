import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  title = 'webapp';

  ngOnInit(): void { // OnInit 初始化時，to do something
    $('#bu').on('click', function () {
      alert('123');
    })
  }
}
