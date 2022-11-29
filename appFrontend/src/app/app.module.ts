import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NovelsComponent } from './novels/novels.component';
import { CharactersComponent } from './characters/characters.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import { HeaderComponent } from './header/header.component';
import {AppRoutingModule} from "./app-Routing.module";

@NgModule({
  declarations: [
    AppComponent,
    NovelsComponent,
    CharactersComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
