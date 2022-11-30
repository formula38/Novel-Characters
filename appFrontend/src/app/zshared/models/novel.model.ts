import {Character} from "./character.model";

export interface Novel {
  id?: number;
  title: string;
  author: string;
  imageUrl: string;
  character?: Character[];
}
