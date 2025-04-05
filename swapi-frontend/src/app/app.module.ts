import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; // <-- Necesario para ngModel
import { CommonModule } from '@angular/common'; // <-- Necesario para *ngFor

import { AppComponent } from './app.component';

@NgModule({
  declarations: [AppComponent],
  imports: [
    BrowserModule,
    FormsModule,
    CommonModule // <-- Agregado para evitar el error NG8103
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
