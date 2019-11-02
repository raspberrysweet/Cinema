import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Genre, FilterParams } from '../model';
import { getLocaleNumberSymbol } from '@angular/common';


@Component({
  selector: 'app-filter-movies',
  templateUrl: './filter-movies.component.html',
  styleUrls: ['./filter-movies.component.css']
})
export class FilterMoviesComponent implements OnInit {

@Input() genres: Genre[];
@Output() filterCriteria: EventEmitter<FilterParams> = new EventEmitter<FilterParams>();
filterParams: FilterParams;

constructor() {
  this.filterParams = {
    param1: '',
    param2: ''
  };

}
  ngOnInit() {
  }

  filterMovies() {
    this.filterCriteria.emit(this.filterParams);
    console.log('nesto');
    console.log(this.filterParams.param1);
    console.log(this.filterParams.param2);
  }

  genreNames(): string[] {
    return this.genres.map(g => g.name);
  }
}

