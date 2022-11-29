import { Component, OnInit } from '@angular/core';
import {Novel} from "../zshared/models/novel.model";
import {NovelService} from "../zshared/services/novel.service";

@Component({
  selector: 'app-novels',
  templateUrl: './novels.component.html',
  styleUrls: ['./novels.component.css']
})
export class NovelsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }


}
