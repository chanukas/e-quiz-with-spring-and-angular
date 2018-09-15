import { Routes, RouterModule } from '@angular/router';
import { PagesComponent } from './pages/pages.component';
import {AuthGuard} from './guards/auth.guard';

const appRoutes: Routes = [
  {
    canActivate: [AuthGuard],
    path: '',
    redirectTo: 'pages/index',
    pathMatch: 'full'
  },
  {
    path: '**',
    redirectTo: 'pages/index'
  }
];

export const routing = RouterModule.forRoot(appRoutes);
