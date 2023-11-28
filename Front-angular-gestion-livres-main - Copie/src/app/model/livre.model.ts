import { Genre } from "./genre.model";
import { Image } from "./image.model";
export class Livre {
  idLivre?: number;
  auteurLivre?: string;
  datePublication?: Date;
  prixLivre?: number;
  quantiteStock?: number;
  titreLivre!: string;
  genre?: Genre;
  image!: Image
  imageStr!: string
}
