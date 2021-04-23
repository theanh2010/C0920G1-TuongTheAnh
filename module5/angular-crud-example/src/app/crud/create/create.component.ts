import { Component, OnInit } from '@angular/core';
import { CrudService } from '../crud.service';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  private productForm: FormGroup;

  constructor(
    public fb: FormBuilder,
    private router: Router,
    public crudService: CrudService
  ) {}

  ngOnInit(): void {
    this.productForm = this.fb.group({
      name: [''],
      description: [''],
      price: [''],
      quantity: [''],
    })
  }

  submitForm() {
    // @ts-ignore
    this.crudService.create(this.productForm.value).subscribe(res => {
      console.log('Product created!');
      this.router.navigateByUrl('/crud/home/')

  })
}
}
