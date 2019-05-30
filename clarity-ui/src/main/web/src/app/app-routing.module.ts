import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { EmpRegistrationComponent } from './components/emp-registration/emp-registration.component';
import { ClarityComponent } from './components/clarity/clarity.component';
import { ValidateComponent } from './components/validate/validate.component';
import { InvestmentComponent } from './components/investment/investment.component';

const routes: Routes = [
{ path: 'login', component: LoginComponent },
{ path: 'register', component: EmpRegistrationComponent },
{ path: 'home', component: ClarityComponent},
{path:'validate',component:ValidateComponent},
{path:'investment',component:InvestmentComponent},
{ path: '**', redirectTo: '/login' }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
