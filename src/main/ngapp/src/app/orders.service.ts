import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

  constructor(
    private http: HttpClient
  ) { }

  getOrders() {
    return this.http.get(`http://localhost:8080/api/v1/orders`);
  }

}

