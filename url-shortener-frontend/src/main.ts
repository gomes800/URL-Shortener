import { bootstrapApplication } from '@angular/platform-browser';
import { routes } from './app/app.routes'
import { HomeComponent } from './app/pages/home/home.component';
import { provideHttpClient } from '@angular/common/http';
import { provideRouter } from '@angular/router';

bootstrapApplication(HomeComponent, {
  providers: [
    provideRouter(routes),
    provideHttpClient()]
});
