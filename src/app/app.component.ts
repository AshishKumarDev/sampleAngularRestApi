import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators} from '@angular/forms';
import { CharactersService } from './services/characters.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'My ng-app';

  trollForm: FormGroup;
  post: any;
  rant: string='';
  troll: string='';
  response: any;
  constructor(private formBuilder:FormBuilder, private charactersService:CharactersService){
    this.trollForm = formBuilder.group({
      'troll': [null,Validators.required],
      'rant': [null,Validators.compose([
        Validators.required,
        Validators.min(3),
        Validators.maxLength(200)
      ])]
    });
  }
  createRant( post ){
    console.log('troll:' +post.troll);
    console.log('Rant: '+post.rant);
    this.troll=post.troll;
    this.rant=post.rant;
    this.save( post );
  }
  save(post):void{

    this.charactersService.postTroll(post).subscribe((response)=>{

      this.response=response;
      console.log(response);

console.log("Done Posting");
    });

  }
}
