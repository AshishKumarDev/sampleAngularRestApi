import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppRoutingModules } from './app-routing-module';
import { MoviesModules } from './modules/movies/movies.modules';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MyMaterialModule } from './modules/my-material/my-material.module'
import { ReactiveFormsModule } from '@angular/forms'
import { HttpClientModule } from  '@angular/common/http';

import { PageNotFoundComponent} from './Components/page-not-found.component';
import { AppComponent } from './app.component';
import { CharacterListComponent } from './Components/character-list/character-list.component';
import { CharacterComponent } from './Components/character/character.component';

@NgModule({
  declarations: [
    AppComponent,
    CharacterListComponent,
    CharacterComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MyMaterialModule,
    MoviesModules,
    AppRoutingModules,
    ReactiveFormsModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
