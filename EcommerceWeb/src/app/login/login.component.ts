import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth/auth.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  loginForm!: FormGroup;
  hidePassword=true;
  constructor(
    private formBuilder:FormBuilder,
    private snackBar:MatSnackBar,
    private authService:AuthService,
    private router :Router
  ){}

  ngOnInit():void{
    this.loginForm=this.formBuilder.group({
       email:[null,[Validators.required]],
       password:[null,[Validators.required]]
    })
  }

  togglePasswordVisibility(){
    this.hidePassword =!this.hidePassword;
  }
  onSubmit():void{
    const username=this.loginForm.get('email')!.value;
    const password=this.loginForm.get('password')!.value;

    this.authService.login(username,password).subscribe(
      (res)=>{
        this.snackBar.open('login sucess','ok',{duration:5000});
      },
      (error)=>{
        this.snackBar.open('bad credentials','ERROR',{duration:5000});
      }
    )

  }

}
