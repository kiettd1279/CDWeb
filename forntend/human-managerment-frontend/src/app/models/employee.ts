import {Department} from './department';

export interface Employee {
    Emp_ID: number;
    F_Name: string;
    L_Name: string;
    image: string;
    IDCard: string;
    Hire_Date: Date;
    email: string;
    address: string;
    salary: number;
    commission: number;
    Manager_ID: number;
    Department_ID: Department;
    isActive: boolean;

}