import { LoginComponent } from './user/login/login.component';
import { HeaderComponent } from './shared/header/header.component';
import { MenuComponent } from './shared/menu/menu.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: 'menu', component: MenuComponent },
  { path: 'menu/:name', component: MenuComponent },
  { path: 'header', component: HeaderComponent },
  { path: 'header/:name', component: HeaderComponent },
  { path: 'login', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
