import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dailog',
  templateUrl: './dailog.component.html',
  styleUrls: ['./dailog.component.css']
})
export class DailogComponent implements OnInit {
  dailog: any;
  _http: any;

  constructor() { }

  ngOnInit(): void {
  }
  /*// make method  to create method
  signUp()
  {
    this._http.post<any>("http://localhost:3000/signup",this.dailog.value).subscribe(res =>{
      alert("User Added Successfully !!");
      this.dailog.reset();
      this.router.navigate(['login'])
    }, err=>{
      alert("Something went wrong !!")
    }
    )
  } */
}
