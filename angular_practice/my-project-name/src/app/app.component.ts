import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  rectangle = {
    length: 5,
    width: 6,
    area: function() {
       return this.length * this.width;
    }
 }
  title = 'My First Angular Project!';
  name: string = 'Marie'
  itemList: string[] = ['chocolate', 'vanilla', 'strawberry', 'rockyroad']
}

