import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  originalUrl = '';
  shortUrl = '';

  constructor(private http: HttpClient) {}

  shorten() {
    this.http.post('http://localhost:8080/shorten', { url: this.originalUrl }, { responseType: 'text' })
      .subscribe((response) => this.shortUrl = response);
  }
}
