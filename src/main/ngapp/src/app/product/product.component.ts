import { Component, Input, OnInit } from '@angular/core';
export interface Product {
  id: string;
  itemName: string;
  itemDescription: string
  price: number;
}
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.scss']
})
export class ProductComponent implements OnInit {

  @Input() product: Product;
  constructor() { }

  ngOnInit(): void {
  }

}
