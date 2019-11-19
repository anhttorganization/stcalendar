import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';


/**
 * @title Stepper overview
 */
@Component({
  selector: 'app-register-form',
  templateUrl: 'register-form.component.html',
  styleUrls: ['register-form.component.css']
})
export class RegisterFormComponent implements OnInit  {
    firstFormGroup: FormGroup;
    secondFormGroup: FormGroup;
    isOptional = false;

    accountType: string = 'Sinh viên';

    constructor(private _formBuilder: FormBuilder) {}

    ngOnInit() {
      this.firstFormGroup = this._formBuilder.group({
        accountType: ['', Validators.required],

      });
      this.secondFormGroup = this._formBuilder.group({
        gmail: ['', Validators.required],
        lastName: ['', Validators.required],
        firstName: ['', Validators.required],
        faculty: ['', Validators.required],
        class: ['', Validators.required],
      });
    }
  }
