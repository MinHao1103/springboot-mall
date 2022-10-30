import { HomeComponent } from './home/home/home.component';
import { LoginComponent } from './user/login/login.component';
import { HeaderComponent } from './shared/header/header.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', component: HeaderComponent }, // 此設定會讓 Header 在每個頁面存在
  { path: 'login', component: LoginComponent }, // 登入
  { path: 'home', component: HomeComponent } // 首頁
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
