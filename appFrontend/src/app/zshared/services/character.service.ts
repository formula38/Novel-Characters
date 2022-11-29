import { Injectable } from '@angular/core';
import {environment} from "../../../environments/environment";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Character} from "../models/character.model";

@Injectable({
  providedIn: 'root'
})
export class CharacterService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getCharacters(): Observable<Character[]> {
    return this.http
      .get<Character[]>(`${this.apiServerUrl}/v1/characters/all`);
  }

  public getCharacter(characterId: number): Observable<Character> {
    return this.http
      .get<Character>(`${this.apiServerUrl}/v1/characters/find${characterId}`);
  }

  public addCharacter(newCharacter: Character): Observable<Character> {
    return this.http
      .post<Character>(`${this.apiServerUrl}/v1/characters/add`, newCharacter);
  }

  public updateCharacter(character: Character): Observable<Character> {
    return this.http
      .put<Character>(`${this.apiServerUrl}/v1/characters/update`, character);
  }

  public deleteCharacter(characterId: number): Observable<void> {
    return this.http
      .delete<void>(`${this.apiServerUrl}/v1/characters/delete${characterId}`);
  }
}

