import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Person } from '../models/person';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PeopleService {
  private apiUrl = 'http://localhost:8080/api/people';

  constructor(private http: HttpClient) {}

  getPeople(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }

  addPerson(person: Person): Observable<string> {
    return this.http.post(this.apiUrl, person, { responseType: 'text' });
  }
}
