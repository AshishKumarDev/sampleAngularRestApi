import { NgModule } from '@angular/core';
import { RouterModule,  Routes } from '@angular/router';
import { PageNotFoundComponent } from './Components/page-not-found.component';
import { CharacterListComponent } from './Components/character-list/character-list.component';


const appRoutes: Routes =[
{path: 'characters', component: CharacterListComponent },
{path: '', redirectTo: '/characters', pathMatch: 'full'},
{path: '**', component: PageNotFoundComponent}

];

@NgModule({
imports: [

    RouterModule.forRoot(appRoutes)
],
exports: [RouterModule]

})

export class AppRoutingModules{}