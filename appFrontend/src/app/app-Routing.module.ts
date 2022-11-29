import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {NovelsComponent} from "./novels/novels.component";
import {CharactersComponent} from "./characters/characters.component";
import {NovelEditComponent} from "./novels/novel-edit/novel-edit.component";

const appRoutes: Routes = [
  {path: '', redirectTo: '/novels', pathMatch: "full"},
  {path: 'novels', component: NovelsComponent,
  children: [
    {path: 'new', component: NovelEditComponent}
  ]},
  {path: 'characters', component: CharactersComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
