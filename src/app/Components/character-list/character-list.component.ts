import { Component, OnInit } from '@angular/core';
import { Character } from '../../classes/character';
import { CharactersService} from '../../services/characters.service';

@Component({
  selector: 'app-character-list',
  templateUrl: './character-list.component.html',
  styleUrls: ['./character-list.component.css'],
  providers: [CharactersService]
})
export class CharacterListComponent implements OnInit {

  characters: Character[];
  response:any;
  constructor(private charctersService: CharactersService) { }

  fetchCharacters(): void{
    this.charctersService.getCharacters().subscribe((response)=>{
      this.response=response;
      console.log(response);
    });
  }
  displayedColumns: string[] = ['name', 'dob', 'gender'];
  ngOnInit() {

    this.fetchCharacters();
  }

}
