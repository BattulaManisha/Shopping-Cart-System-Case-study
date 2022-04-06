import { Component, Input, OnInit } from '@angular/core';
import { Product } from 'src/app/model/product';

@Component({
  selector: 'app-product-list-item',
  templateUrl: './product-list-item.component.html',
  styleUrls: ['./product-list-item.component.css']
})
export class ProductListItemComponent implements OnInit {
  @Input() productItem:Product
  cartService: any;
  filterCategory: any;
  productList: any;
  constructor() { }

  ngOnInit(): void {
  }
  addtocart(item: any){
    this.cartService.addtoCart(item);
  }
  filter(category:string){
    this.filterCategory = this.productList
    .filter((a:any)=>{
      if(a.category == category || category==''){
        return a;
      }
    })
  }

}
