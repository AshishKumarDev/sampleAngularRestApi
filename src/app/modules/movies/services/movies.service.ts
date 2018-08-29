import { Injectable } from '@angular/core';
import { Movies } from '../classes/data-movie';
import { Movie } from '../classes/movie';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  private url="http://localhost:8181/restTest/webapi/movies";
  constructor(private http:HttpClient) { }
 
  getMovies():Observable<any>{
   
   return this.http.get(this.url);
  }
}
