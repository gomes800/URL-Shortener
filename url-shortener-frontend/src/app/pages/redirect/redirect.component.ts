import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-redirect',
  standalone: true,
  imports: [],
  templateUrl: './redirect.component.html',
  styleUrl: './redirect.component.css'
})
export class RedirectComponent {
  constructor(private route: ActivatedRoute, private http: HttpClient) {}

  ngOnInit():void {
    const code = this.route.snapshot.paramMap.get('code');
    this.http.get('http://localhost:8080/${code}', { responseType: 'text' })
    .subscribe((originalUrl) => window.location.href = originalUrl);
  }

}
