import { ActivatedRouteSnapshot, CanActivate, GuardResult, MaybeAsync, Router, RouterStateSnapshot } from "@angular/router";
import { AuthService } from "../auth.service";
import { Observable } from "rxjs";
import { Injectable } from "@angular/core";

@Injectable({
  providedIn: 'root'
  })  
export class AuthGuard implements CanActivate{
  constructor(private authService: AuthService, private router: Router){}
 
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean{
     if(this.authService.isAuthenticated()){
        return true
     }
     this.router.navigate(['/login'])
     return false
  }

}
