import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'CinemaParadiso';

  constructor(private router: Router) {}

showHome() {
this.router.navigate(['/main']);
}
addMoviePage() {
  this.router.navigate(['/add-movie']);
}
}
