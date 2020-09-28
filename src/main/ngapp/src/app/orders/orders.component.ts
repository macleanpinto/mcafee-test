import { Component, OnInit } from '@angular/core';
import { OrdersService } from '../orders.service';
export interface Order {
  name: string;
  orderId: string;
  price: number;
  address: string;
}


@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.scss']
})
export class OrdersComponent implements OnInit {
  displayedColumns: string[] = ['orderId', 'name', 'price', 'address'];
  dataSource = [];
  constructor(private ordersService: OrdersService) { }

  ngOnInit(): void {
    this.ordersService.getOrders().subscribe((res: Order[]) => { this.dataSource = res; });
  }

}
