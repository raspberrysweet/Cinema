import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Movie } from '../model';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent implements OnInit {
@Input() movies: Movie[];
@Output() movieShowtimes: EventEmitter<number> = new EventEmitter();

  constructor() { }

  ngOnInit() {
  }

  clickMovieShowtimes(index: number) {
    this.movieShowtimes.emit(index);
  }
}
