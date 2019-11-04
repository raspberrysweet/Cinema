import { Component, OnInit } from '@angular/core';
import {HttpClientService } from '../service/http-client.service';
import { Movie, Genre, Showtime } from '../model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {

  newMovie: Movie;
  genres: Genre[];
  timeAndDate: string;
  showtimeList: Showtime[];
  show: string;
  notHidden: boolean;

  constructor(private route: Router, private htttpService: HttpClientService) {
    this.newMovie = {
      name: '',
      synposis: '',
      genre: {
        name: ''
      },
      showtimes: []
    };
    this.genres = [];
    this.timeAndDate = '';
    this.showtimeList = [];
    this.show = '';
    this.notHidden = false;
   }

  ngOnInit() {
    this.htttpService.getGenres().subscribe(res => {this.genres = res; } );
  }
  addMovie() {
    this.newMovie.showtimes = [...this.showtimeList];
    this.htttpService.saveMovie(this.newMovie).subscribe((data: Response) => {console.log(data); } );

  }
  addShowtime() {
    this.showtimeList.push(new Showtime (this.show));
    this.show = '';
    this.notHidden = false;
  }

  redirect() {
    this.route.navigate(['/main']);
  }
}

