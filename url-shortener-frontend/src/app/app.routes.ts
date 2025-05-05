import { RedirectCommand, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { RedirectComponent } from './pages/redirect/redirect.component';

export const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: '', component: RedirectComponent },
];
