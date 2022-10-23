import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';                 // (1)

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  name!: string | null;                                           // (2)
  constructor(private route: ActivatedRoute,) { }                 // (3)

  ngOnInit(): void {
    this.name = this.route.snapshot.paramMap.get('name')          // (4)

  }

}
