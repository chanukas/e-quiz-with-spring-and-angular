import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { routing } from './pages.routing';

import { LayoutModule } from '../shared/layout.module';
import { SharedModule } from '../shared/shared.module';

/* components */
import { PagesComponent } from './pages.component';
import { LoginComponent } from './login/login.component';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import { ManagePlayersComponent } from './manage-players/manage-players.component';

@NgModule({
    imports: [
        CommonModule,
        LayoutModule,
        SharedModule,
        BrowserModule,
      FormsModule,
        routing
    ],
    declarations: [
        PagesComponent,
        LoginComponent,
        ManagePlayersComponent
    ]
})
export class PagesModule { }
