import { Component, OnInit } from '@angular/core';
import {ProductService} from '../product.service'
import { Product } from '../product';
import { FormGroup, FormBuilder} from '@angular/forms';
import {Router} from '@angular/router';


@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

   products:Product[];
  
  formValue!: FormGroup
  productModelObject: Product = new Product;
  showAdd: boolean;
  showBtn: boolean;
  api: any;
  allproductData: any;
  cartService: any;
  productList: any;
  filterCategory: any;
  product: any;
  
  constructor(private formBuilder: FormBuilder, private productService:ProductService, private route: Router) { }

  ngOnInit(): void {
    this.formValue = this.formBuilder.group(
      {
        productname: [''],
        productimage:[''],
        description: [''],
        quantity: [''],
        price: ['']
        
      }
    )
    this.getProduct();
    
  }
  clickAddprod()
  {
    this.formValue.reset();
    this.showAdd=true;
    this.showBtn=false;
  }
getProduct(){
  this.productService.getAllProd().subscribe((product: Product[])=> {
    console.log(product);
    this.products=product;
  });
}

onSelect(data:any)
{
  this.route.navigate(['/productlist',data.productid]);
}
  //subscribe
  addProduct() {
    this.productModelObject.productid=this.formValue.value.productid;
    this.productModelObject.productname= this.formValue.value.productname;
    this.productModelObject.productimage= this.formValue.value.productimage;
    this.productModelObject.description = this.formValue.value.description;
    this.productModelObject.quantity = this.formValue.value.quantity;
    this.productModelObject.price = this.formValue.value.price;
    

    this.productService.postProduct(this.productModelObject).subscribe((res:any[]) => {
      console.log(res);
      alert("Added Successfully");
      this.formValue.reset();
      this.getProduct();
    }
      , err => {
        alert("Error Occured");
      })
  }


 

  //delete
  deleteprod(product:any)
  {
    this.productService.deleteProduct(product.productid).subscribe((res:any[])=>{
      alert("Record Deleted Successfully");
      this.getProduct();
    })
  }

  //edit
  onEditprod(product:any)
  {
    
    this.productModelObject.productid = product.productid;
    this.formValue.controls['productname'].setValue(product.productname);
    this.formValue.controls['productimage'].setValue(product.productimage);
    this.formValue.controls['description'].setValue(product.description);
    this.formValue.controls['quantity'].setValue(product.quantity);
    this.formValue.controls['price'].setValue(product.price);
  }

  updateProduct()
  {
    this.productModelObject.productname = this.formValue.value.productname;
    this.productModelObject.productimage = this.formValue.value.productimage;
    this.productModelObject.description = this.formValue.value.description;
    this.productModelObject.quantity = this.formValue.value.quantity;
    this.productModelObject.price = this.formValue.value.price;
   

    this.productService.updateProduct(this.productModelObject, this.productModelObject.productid)
    .subscribe((res:any[])=>{
      alert("Record Updated Successfully");
      this.getProduct();
    });
  }
  /* addtocart(item: any){
    this.cartService.addtoCart(item);
  }
  filter(category:string){
    this.filterCategory = this.product
    .filter((a:any)=>{
      if(a.category == category || category==''){
        return a;
      }
    })
  } */
}
