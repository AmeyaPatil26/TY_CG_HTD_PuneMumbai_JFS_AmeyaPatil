import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { BikesComponent } from './bikes/bikes.component';
import { MoviesComponent } from './movies/movies.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { MobilesComponent } from './mobiles/mobiles.component';


const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'cars', component:CarsComponent},
  {path: 'bikes', component:BikesComponent},
  {path: 'movies', component:MoviesComponent},
  {path: 'laptops', component:LaptopsComponent},
  {path: 'mobiles', component:MobilesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
