import { NgModule } from '@angular/core';
import { MovieListComponent } from './components/movie-list/movie-list.component';
import { MovieComponent } from './components/movie/movie.component';
import { MoviesService } from './services/movies.service';
import { CommonModule } from '@angular/common';
import { MovieRoutingModules } from './movies-routing.modules';
import { MyMaterialModule } from '../my-material/my-material.module'

@NgModule({

    imports:[CommonModule,MovieRoutingModules,MyMaterialModule],
    declarations: [MovieListComponent,MovieComponent],
    providers: [MoviesService]
})

export class MoviesModules{}