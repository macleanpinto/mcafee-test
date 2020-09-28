import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../products.service';
export interface Product {
  id: string;
  itemName: string;
  itemDescription: string
  price: number;
}

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})

export class ProductsComponent implements OnInit {

  products = [];

  constructor(private productService: ProductsService) { }

  ngOnInit(): void {
    this.productService.getProducts().subscribe((res: Product[]) => { this.products = res; });
  }

}
