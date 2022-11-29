import {Component, Input, OnInit} from '@angular/core';
import {Novel} from "../../../zshared/models/novel.model";

@Component({
  selector: 'app-novel-list-item',
  templateUrl: './novel-list-item.component.html',
  styleUrls: ['./novel-list-item.component.css']
})
export class NovelListItemComponent implements OnInit {
  @Input() novel: Novel;
  @Input() index: number;

  constructor() { }

  ngOnInit(): void {
  }

}
