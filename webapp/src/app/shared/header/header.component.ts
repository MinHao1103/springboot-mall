import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';                 // (1)

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  name!: string | null;                                           // (2)
  constructor(private route: ActivatedRoute,) { }                 // (3)

  ngOnInit(): void {
    this.name = this.route.snapshot.paramMap.get('name')          // (4)
  }

}
