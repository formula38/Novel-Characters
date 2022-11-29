import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../../environments/environment";
import {Observable} from "rxjs";
import {Novel} from "../models/novel.model";

@Injectable({
  providedIn: 'root'
})
export class NovelService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getNovels(): Observable<Novel[]> {
    return this.http
      .get<Novel[]>(`${this.apiServerUrl}/v1/novels/all`);
  }

  public getNovel(novelId: number): Observable<Novel> {
    return this.http
      .get<Novel>(`${this.apiServerUrl}/v1/novels/find${novelId}`);
  }

  public addNovel(newNovel: Novel): Observable<Novel> {
    return this.http
      .post<Novel>(`${this.apiServerUrl}/v1/novels/add`, newNovel);
  }

  public updateNavel(novel: Novel): Observable<Novel> {
    return this.http
      .put<Novel>(`${this.apiServerUrl}/v1/novels/update`, novel);
  }

  public deleteNovel(novelId: number): Observable<void> {
    return this.http
      .delete<void>(`${this.apiServerUrl}/delete${novelId}`);
  }
}
