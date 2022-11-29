import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {NovelService} from "../../zshared/services/novel.service";
import {ActivatedRoute, Params, Router} from "@angular/router";

@Component({
  selector: 'app-novel-edit',
  templateUrl: './novel-edit.component.html',
  styleUrls: ['./novel-edit.component.css']
})
export class NovelEditComponent implements OnInit {
  id: number;
  editMode = false;
  novelForm: FormGroup;

  constructor(private novelService: NovelService,
              private router: Router,
              private route: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.route.params
      .subscribe(
        (params: Params) => {
          this.id = +params['id'];
          this.editMode = params['id'] != null;
          this.initForm();
        }
      );
  }

  private initForm() {
    let title = '';
    let author = '';
    let imageUrl = '';

    this.novelForm = new FormGroup({
      title: new FormControl(title),
      author: new FormControl(author),
      imageUrl: new FormControl(imageUrl)
    });
  }

  onSubmit() {
    if (this.editMode) {
      this.novelService.updateNavel(this.novelForm.value);
    } else {
      this.novelService.addNovel(this.novelForm.value);
    }
    this.onCancel();
  }

  onCancel() {
    this.router.navigate(
      ['../'],
      {relativeTo: this.route}
    );
  }
}
