import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  people: { name: string; height: string }[] = [
    { name: 'Luke Skywalker', height: '172' },
    { name: 'Darth Vader', height: '202' }
  ];

  newPerson = { name: '', height: '' };

  addPerson() {
    this.people.push({ ...this.newPerson });
    this.newPerson = { name: '', height: '' };
  }
}
