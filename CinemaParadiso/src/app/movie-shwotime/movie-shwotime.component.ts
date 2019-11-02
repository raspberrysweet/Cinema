import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpClientService } from '../service/http-client.service';
import { Movie } from '../model';


@Component({
  selector: 'app-movie-shwotime',
  templateUrl: './movie-shwotime.component.html',
  styleUrls: ['./movie-shwotime.component.css']
})
export class MovieShwotimeComponent implements OnInit {

  id: number;
  movie: Movie;
  isDataAvailable: boolean;
  // private sub: any;

  constructor(private route: ActivatedRoute, private httpClient: HttpClientService) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
     this.isDataAvailable = false;
     // tslint:disable-next-line:no-string-literal
     this.id = +params['id']; } );
    this.httpClient.getMovie(this.id).subscribe(
       (res: Movie) => {
         this.movie = res;
         this.isDataAvailable = true;
       }
     );

 }

}
