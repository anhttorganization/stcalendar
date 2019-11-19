import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './pages/home/home.component';
import { FlexLayoutModule } from '@angular/flex-layout';
import { IndexComponent } from './pages/index/index.component';
import { ReactiveFormsModule } from '@angular/forms';

import { MaterialModule } from './material.module';
// import {CdkTableModule} from '@angular/cdk/table';
import { LoginFormComponent } from './shared/components/login-form/login-form.component';
import { RegisterFormComponent } from './shared/components/register-form/register-form.component';
import { HeaderComponent } from './shared/components/header/header.component';
import { FooterComponent } from './shared/components/footer/footer.component';
import { LayoutComponent } from './shared/components/layout/layout.component';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    IndexComponent,
    LoginFormComponent,
    RegisterFormComponent,
    HeaderComponent,
    FooterComponent,
    LayoutComponent,
    // CdkTableModule,
    LoginComponent,
    RegisterComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FlexLayoutModule,
    ReactiveFormsModule,
    MaterialModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
