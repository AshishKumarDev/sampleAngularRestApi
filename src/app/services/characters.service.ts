import { Injectable } from '@angular/core';
import { Characters } from '../classes/data-character';
import { Character } from '../classes/character';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};
@Injectable({
  providedIn: 'root'
})
export class CharactersService {
  private myurl="http://localhost:8181/restTest/webapi/characters";
  constructor(private http:HttpClient) { }
//  getCharacters(): Promise<Character[]> {
 //   return Promise.resolve(Characters);
 // }
 getCharacters(){
   return this.http.get(this.myurl);
 }

 postTroll(troll:any) : Observable<any>{
 return this.http.post(this.myurl,troll,httpOptions);
 }
}
