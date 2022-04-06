import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatDialogModule} from '@angular/material/dialog';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import {MatRadioModule} from '@angular/material/radio';
import {MatTabsModule} from '@angular/material/tabs';
import {MatCheckbox, MatCheckboxModule} from '@angular/material/checkbox';
import { MatCardModule } from '@angular/material/card';
import { AppComponent } from './app.component';
import { NgModule } from '@angular/core';

import { LoginComponent } from './login/login.component';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductListItemComponent } from './product-list/product-list-item/product-list-item.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { ProductComponent } from './product/product.component';
import { RegisterComponent } from './register/resgister.component';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { PaymentComponent } from './Payment/payment.component';
import { CartComponent } from './cart/cart.component';
import { CartproductlistComponent } from './cartproductlist/cartproductlist.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { AdminComponent } from './admin/admin.component';




@NgModule({
  declarations: [
    AppComponent,
    PaymentComponent,
    LoginComponent,
    ProductListComponent,
    ProductListItemComponent,
    HomeComponent,
    ContactComponent,
    ProductComponent,
    RegisterComponent,
    CartComponent,
    CartproductlistComponent,
    ProductlistComponent,
    AdminComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    MatDialogModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatRadioModule,
    HttpClientModule,
    MatCardModule,
    ReactiveFormsModule,
    FormsModule,
    MatCheckboxModule,
    MatTabsModule,
    MatFormFieldModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
