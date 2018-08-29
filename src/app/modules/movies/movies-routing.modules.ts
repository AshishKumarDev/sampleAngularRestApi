import { NgModule } from '@angular/core';
import { RouterModule,  Routes } from '@angular/router';
import { MovieListComponent } from '../../modules/movies/components/movie-list/movie-list.component'
import { MovieComponent } from '../../modules/movies/components/movie/movie.component';


const movieRoutes: Routes =[
{ path: 'movies', component: MovieListComponent},
];

@NgModule({
imports: [

    RouterModule.forChild(movieRoutes)
],
exports: [RouterModule]

})

export class MovieRoutingModules{}