export class Movie implements MovieInterface {
    id?: number;
    name: string;
    genre: Genre;
    synposis: string;
    showtimes: Showtime[];

    constructor(movieCfg: MovieInterface) {
        this.id = movieCfg.id;
        this.name = movieCfg.name;
        this.genre = movieCfg.genre;
        this.synposis = movieCfg.synposis;
        this.showtimes = movieCfg.showtimes;
    }
}
export class Genre implements GenreInterface {
    id?: number;
    name: string;

    constructor(genreCfg: GenreInterface) {
        this.id = genreCfg.id;
        this.name = genreCfg.name;
    }
}

interface MovieInterface {
    id?: number;
    name: string;
    genre: Genre;
    synposis: string;
    showtimes: Showtime[];
}

export interface GenreInterface {
    id?: number;
    name: string;
}

export interface FilterParamsInterface {
    param1: string;
    param2: string;
  }

export class FilterParams implements FilterParamsInterface {
    param1: string;
    param2: string;
    constructor(fileteParams: FilterParamsInterface) {
        this.param1 = fileteParams.param1;
        this.param2 = fileteParams.param2;
    }

}
export interface ShowtimeInterface {
    id?: number;
    timeAndDate: string;

}
export class Showtime implements ShowtimeInterface {
    id?: number;
    timeAndDate: string;
    constructor(timeAndDate: string) {
        this.timeAndDate = timeAndDate;
    }
}
