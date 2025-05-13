import { Component, OnInit } from '@angular/core';
import { Employee } from '../models/employee.type=model';
import { EmployeeService } from '../services/employee.service';
import { CommonModule } from '@angular/common';
import {
  FormGroup,
  NonNullableFormBuilder,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-employee-form',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './employee-form.component.html',
  styleUrl: './employee-form.component.scss',
})
export class EmployeeFormComponent implements OnInit {
  employeeForm: FormGroup;
  employees: Employee[] = [];

  constructor(
    private fb: NonNullableFormBuilder,
    private employeeService: EmployeeService
  ) {
    this.employeeForm = this.fb.group({
      name: [''],
      email: [''],
      jobTitle: [''],
      phone: [''],
      imageUrl: [''],
    });
  }

  ngOnInit(): void {
    this.getEmployees();
  }

  getEmployees(): void {
    this.employeeService.getEmployee().subscribe((data) => {
      this.employees = data;
    });
  }

  addEmployee(): void {
    if(this.employeeForm.valid){
      const employee: Employee = this.employeeForm.value;
      this.employeeService.addEmployee(employee).subscribe(()=>{
        this.getEmployees();
        this.employeeForm.reset();
      });
    }else{
      console.log("form invalide",this.employeeForm.errors);
      console.log("form value", this.employeeForm.value)
    }
  }

  deleteEmployee(id: number): void {
    this.employeeService.deleteEmployee(id).subscribe(() => {
      this.getEmployees();
    });
  }
}
