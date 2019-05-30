import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginService } from './services/login.service';
import { EmpRegistrationComponent } from './components/emp-registration/emp-registration.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { LoginComponent } from './components/login/login.component';
import { ClarityComponent } from './components/clarity/clarity.component';
import { ValidateComponent } from './components/validate/validate.component';
import { InvestmentComponent } from './components/investment/investment.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    EmpRegistrationComponent,
    LoginComponent,
    ClarityComponent,
    ValidateComponent,
    InvestmentComponent    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
