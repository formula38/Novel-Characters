import { Component, OnInit } from '@angular/core';
import {Novel} from "../../zshared/models/novel.model";
import {NovelService} from "../../zshared/services/novel.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-novel-list',
  templateUrl: './novel-list.component.html',
  styleUrls: ['./novel-list.component.css']
})
export class NovelListComponent implements OnInit {
  novels: Novel[];

  constructor(private novelService: NovelService,
              private router: Router,
              private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.onGetNovels();
  }

  onGetNovels() {
    this.novelService.getNovels()
      .subscribe(
        (novels: Novel[]) => {
          this.novels = novels;
        }
      );
  }

  onNewNovel() {
    this.router.navigate(
      ['new'],
      {relativeTo: this.route}
    )
  }

}
