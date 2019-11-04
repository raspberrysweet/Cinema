import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../security/authentication.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public user: any;
  public wrongUsernameOrPass: boolean;
  constructor(private authenticationService: AuthenticationService,
              private router: Router) { }

  ngOnInit() {
  }

}
