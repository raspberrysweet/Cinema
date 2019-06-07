// ovo sam videla na kursu,  u jednoj lekciji su koristili ove klase kao tipove, pa kasnije nisu
export class Movie implements MovieInterface {
    id: number;
    name: string;
    genre: GenreInterface;
    synposis: string;
    showtimes: ShowtimeInterface;

    constructor(movieCfg: MovieInterface) {
        this.id = movieCfg.id;
        this.name = movieCfg.name;
        this.genre = movieCfg.genre;
        this.synposis = movieCfg.synposis;
        this.showtimes = movieCfg.showtimes;
    }
}

interface MovieInterface {
    id?: number;
    name: string;
    genre: GenreInterface;
    synposis: string;
    showtimes: ShowtimeInterface;
}

interface GenreInterface {
    id?: number;
    name: string;
}

interface ShowtimeInterface {
    id?: number;
    timeAndDate: string;
  }
