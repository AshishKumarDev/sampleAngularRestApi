import { Component, OnInit } from '@angular/core';
import { Movie } from '../../classes/movie';
import { MoviesService } from '../../services/movies.service';


@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css'],
  providers: [ MoviesService ]
})
export class MovieListComponent implements OnInit {

 responses:any

  constructor(private moviesService: MoviesService) { }

  fetchMovies():void{
    this.moviesService.getMovies().subscribe((responses)=>{
      this.responses=responses;
      console.log(responses);
      

    });
  }

  ngOnInit() {
    this.fetchMovies();
  }

}
