import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NovelsComponent } from './novels/novels.component';
import { CharactersComponent } from './characters/characters.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import { HeaderComponent } from './header/header.component';
import {AppRoutingModule} from "./app-Routing.module";
import {NovelListComponent} from "./novels/novel-list/novel-list.component";
import {NovelListItemComponent} from "./novels/novel-list/novel-list-item/novel-list-item.component";
import {NovelEditComponent} from "./novels/novel-edit/novel-edit.component";

@NgModule({
  declarations: [
    AppComponent,
    NovelsComponent,
    CharactersComponent,
    HeaderComponent,
    NovelListComponent,
    NovelListItemComponent,
    NovelEditComponent
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
