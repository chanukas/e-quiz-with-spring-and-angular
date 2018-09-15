import {Routes, RouterModule} from '@angular/router';
import {PagesComponent} from './pages.component';
import {LoginComponent} from './login/login.component';
import {AuthGuard} from '../guards/auth.guard';
import {ManagePlayersComponent} from './manage-players/manage-players.component';

export const childRoutes: Routes = [
  {
    path: 'login',
    component: LoginComponent,
  },


  {
    path: 'pages',
    component: PagesComponent,
    canActivate: [AuthGuard],
    children: [
      {path: '', redirectTo: 'index', pathMatch: 'full'},
      {path: 'manage-players', component: ManagePlayersComponent},
      {path: 'index', loadChildren: './index/index.module#IndexModule'},
      {path: 'editor', loadChildren: './editor/editor.module#EditorModule'},
      {path: 'icon', loadChildren: './icon/icon.module#IconModule'},
      {path: 'profile', loadChildren: './profile/profile.module#ProfileModule'},
      {path: 'form', loadChildren: './form/form.module#FormModule'},
      {path: 'charts', loadChildren: './charts/charts.module#ChartsModule'},
      {path: 'ui', loadChildren: './ui/ui.module#UIModule'},
      {path: 'table', loadChildren: './table/table.module#TableModule'},
      {path: 'menu-levels', loadChildren: './menu-levels/menu-levels.module#MenuLevelsModule'},
    ]
  }
];

export const routing = RouterModule.forChild(childRoutes);
