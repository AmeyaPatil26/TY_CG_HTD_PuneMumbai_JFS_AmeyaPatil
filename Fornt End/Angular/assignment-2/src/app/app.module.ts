import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { BikesComponent } from './bikes/bikes.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { MoviesComponent } from './movies/movies.component';
import { MovieDetailsComponent } from './movie-details/movie-details.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { LaptopDetailsComponent } from './laptop-details/laptop-details.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarsComponent,
    CarDetailsComponent,
    BikesComponent,
    BikeDetailsComponent,
    MoviesComponent,
    MovieDetailsComponent,
    LaptopsComponent,
    LaptopDetailsComponent,
    MobilesComponent,
    MobileDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
