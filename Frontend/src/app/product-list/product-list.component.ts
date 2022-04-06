import { Component, OnInit } from '@angular/core';
import { Product } from '../model/product';
import { ProductService } from '../service/product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-list',
  template: ``,
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  productList:Product[]=[];
  constructor(private ts:ProductService, private router:Router) { }

  ngOnInit(): void
   {
    this.ts.getAllProd().subscribe((product) =>{
      this.productList= product;
     // this.router.navigate()
    })

  }

}
