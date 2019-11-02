import { Component, OnInit } from '@angular/core';
// import { HttpClient } from '@angular/common/http';
import { HttpClientService } from '../service/http-client.service';
// import { Observable } from 'rxjs';
import { Movie, Genre, FilterParams } from '../model';
import { Router } from '@angular/router';



@Component({
  selector: 'app-main',
 templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {


  public movies: Movie[];
  public genres: Genre[];
  public filterCriteria: FilterParams;

  constructor(private httpClientService: HttpClientService, private router: Router) {
    this.movies = [];
    this.genres = [];
    this.filterCriteria = {
      param1: '',
      param2: ''
    };
    this.loadData();
   }

   ngOnInit() {console.log('blablabla'); }

  private loadData() {
    this.httpClientService.getMovies(this.filterCriteria.param1, this.filterCriteria.param2).subscribe(res => {this.movies = res; });
    this.httpClientService.getGenres().subscribe(data => { this.genres = data; });
  }

movieShowtimes(index: number) {
    this.router.navigate(['/movie-showtime', index]);
   }

ngFilterMovies(filterParams: FilterParams) {
      this.filterCriteria = filterParams;
      this.loadData();
      console.log('nesto u main-u pozvan');
    }
}

