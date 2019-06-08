import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// import { Observable } from 'rxjs';
// import { Movie } from '../model';


@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {


  public movies: any[];

  constructor(private http: HttpClient) {
    this.movies = [];
   }

   ngOnInit() {
    this.loadData();
   }

   private loadData() {
     // ovo je prekopiran kod sa kursa koji javlja gresku
   // this.http.get('/api/movies').subscribe((res: Response) => {this.movies = res.json(); });
   const o: any = this.http.get('api/movies');
   o.subscribe( (data: any[]) => {  // morala sam movies: any[] jer javlja gresku
    this.movies = data as any[]; });
   }
}
