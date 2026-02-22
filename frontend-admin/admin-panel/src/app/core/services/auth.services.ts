import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";


@Injectable({ providedIn:  'root'})
export class AuthService {
    private baseUrl = 'http"//localhost:8080/api/auth';
    constructor(private http: HttpClient) {}

    login(credentials: any){
        return this.http.post(`${this.baseUrl}/login`, credentials);
    }

    saveToken(token : string){
        localStorage.setItem('token', token);
    }

    getToken(){
        return localStorage.getItem('token');
    }

    logout(){
        localStorage.removeItem('token');
    }
}