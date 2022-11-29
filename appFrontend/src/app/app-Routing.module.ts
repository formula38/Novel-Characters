import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {NovelsComponent} from "./novels/novels.component";
import {CharactersComponent} from "./characters/characters.component";

const appRoutes: Routes = [
  {path: '', redirectTo: '/novels', pathMatch: "full"},
  {path: 'novels', component: NovelsComponent},
  {path: 'characters', component: CharactersComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
