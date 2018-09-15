import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../dtos/user";
import {Observable} from "rxjs/Observable";
import {map} from "rxjs/operators/map";
import {Router} from "@angular/router";

const URL= "/api/v1/login";
export  const MAIN_URL="http://localhost:8080";

@Injectable()
export class AuthService {

  constructor(private http: HttpClient, private router: Router) {
  }

  login(user: User): Observable<boolean> {
    return this.http.post<boolean>(MAIN_URL + URL, user)
      .pipe(
        map((result)=>{
          if(result!=null){
            sessionStorage.setItem("token", result + "");
            if (result){
              this.router.navigate(['/pages/index']);
            }
            return false;
          }else{
            sessionStorage.setItem("token",  "false"+ "");
            if (result){
              this.router.navigate(['/pages/index']);
            }
            return false;
          }

        })
      )
  }


  isAuth(): boolean{
    if (sessionStorage.getItem("token")){
      return sessionStorage.getItem("token") == 'false' ? false: true;
    }
  }

  logout(): void{
    sessionStorage.removeItem("token");
    this.router.navigate(['/login']);
  }
}
