import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { CartComponent } from './cart/cart.component';
import { CartproductlistComponent } from './cartproductlist/cartproductlist.component';
import { ContactComponent } from './contact/contact.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { RegisterComponent } from './register/resgister.component';

const routes: Routes = [
  
    {path:'home' , component: HomeComponent},
    {path:'contact' , component:ContactComponent},
    {path:'cart' , component:CartComponent},
    {path:'feedback', component:FeedbackComponent},
    {path:'login' , component:LoginComponent},
    {path:'register' , component:RegisterComponent},
    {path:'productlist/:productid', component: CartproductlistComponent},
    {path:'productlist' , component:ProductlistComponent},
    {path:'admin' , component:AdminComponent}
    
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes), ReactiveFormsModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
