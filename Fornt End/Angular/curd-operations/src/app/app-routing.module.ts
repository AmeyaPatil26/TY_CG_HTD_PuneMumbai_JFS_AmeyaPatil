import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ProductComponent } from './product/product.component';
import { AddProductComponent } from './add-product/add-product.component';
import { EditProductComponent } from './edit-product/edit-product.component';


const routes: Routes = [
  { path: '', component: HomeComponent } ,
  { path: 'product', component: ProductComponent},
  { path: 'add-product', component: AddProductComponent },
  { path: 'edit-product', component: EditProductComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
