import { Component } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  imports: [],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  role: string | null = ''
  userName: string | null = ''
 
  constructor(private service:AuthService){
     this.role = this.service.getUserRole()
     this.userName = this.service.getUserUsername()
  }
}
