import { Injectable } from '@angular/core';
import { jwtDecode } from 'jwt-decode'

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() { }
  isAuthenticated(): boolean{
    return  !!localStorage.getItem('token')
  }

  getUserRole(): string | null {
    const token = localStorage.getItem('token');
    if (token) {
      const decoded: any = jwtDecode(token);
      return decoded.role; // O JWT deve conter um campo 'role'
    }
    return null;
  }

  getUserUsername(): string | null {
    const token = localStorage.getItem('token');
    if (token) {
      const decoded: any = jwtDecode(token);
      return decoded.username; // O JWT deve conter um campo 'role'
    }
    return null;
  }

}
